package com.sikejava.tool.toolkit.dashboard;

import com.sikejava.framework.flame.javafx.AbstractJavaFxApplication;
import com.sikejava.framework.flame.javafx.FxView;
import com.sikejava.framework.flame.javafx.JavaFxContext;
import com.sikejava.framework.flame.javafx.ResourceUtils;
import com.sikejava.framework.flame.javafx.WindowStyle;
import com.sikejava.tool.toolkit.dashboard.index.IndexController;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 控制台应用程序
 *
 * @author skjv2014@163.com
 * @since 2022-08-05 20:57:18
 */
@SpringBootApplication
public class DashboardApplication extends AbstractJavaFxApplication {

    public static void main(String[] args) {
        launch(DashboardApplication.class, args);
    }

    @Override
    public Stage getBootWindow() {
        // root
        ImageView imageView = new ImageView(ResourceUtils.getImageExternalForm("bootWindow"));
        HBox hBox = new HBox();
        hBox.getChildren().add(imageView);

        // stage
        Stage stage = new Stage();
        stage.setTitle("正在启动...");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(new Scene(hBox, Color.TRANSPARENT));

        return stage;
    }

    @Override
    public void startIndex(Stage stage) {
        FxView<IndexController> fxView = JavaFxContext.load("index/index", "index");
        JavaFxContext.showWindow(fxView.getRoot(), WindowStyle.newWithoutBar("工具集"));
    }
}
