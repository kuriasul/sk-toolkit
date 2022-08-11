package com.sikejava.tool.toolkit.dashboard.component.javafx;

import com.sikejava.tool.toolkit.dashboard.component.javafx.boot.DefaultBootView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.view.AbstractFxmlView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.view.SimpleView;

import org.springframework.boot.SpringApplication;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象的javafx应用
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 01:38:51
 */
@Slf4j
public abstract class AbstractJavaFxApplication extends Application {

    private final CompletableFuture<Runnable> splashScreenShow = new CompletableFuture<>();

    public static void launch(Class<? extends Application> appClass, String[] args, Class<? extends AbstractFxmlView> indexView) {
        launch(appClass, args, new DefaultBootView(), indexView);
    }

    public static void launch(Class<? extends Application> appClass, String[] args, SimpleView bootView, Class<? extends AbstractFxmlView> indexView) {
        JavaFxContext.setAppClass(appClass);
        JavaFxContext.setAppArgs(args);
        JavaFxContext.setBootView(bootView);
        JavaFxContext.setIndexView(indexView);

        Application.launch(appClass, args);
    }

    @Override
    public void init() throws Exception {
        CompletableFuture.supplyAsync(() ->
            SpringApplication.run(JavaFxContext.getAppClass(), JavaFxContext.getAppArgs())
        ).whenComplete((applicationContext, throwable) -> {
            if (Objects.nonNull(throwable)) {
                log.error("加载springboot失败. 失败详情: ", throwable);
                Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "加载springboot失败");
                    alert.showAndWait().ifPresent(response -> Platform.exit());
                });
            } else {
                JavaFxContext.setApplicationContext(applicationContext);
            }
        }).thenAcceptBothAsync(splashScreenShow, (applicationContext, closeSplashScreen) -> {
            Platform.runLater(closeSplashScreen);
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        Stage splashStage = new Stage();
        splashStage.setScene(new Scene(JavaFxContext.getBootView().getView()));
        splashStage.show();

        splashScreenShow.complete(() -> {
            splashStage.close();

            AbstractFxmlView indexView = JavaFxContext.getApplicationContext().getBean(JavaFxContext.getIndexView());
            Scene indexScene = new Scene(indexView.getView());
            stage.setScene(indexScene);
            stage.show();
        });
    }
}
