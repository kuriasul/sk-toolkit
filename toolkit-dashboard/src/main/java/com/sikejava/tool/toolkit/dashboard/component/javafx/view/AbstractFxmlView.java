package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import com.sikejava.tool.toolkit.dashboard.component.javafx.view.FxmlView;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * 抽象的fxml视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 22:28:53
 */
public abstract class AbstractFxmlView implements FxmlView, ApplicationContextAware {

    /**
     * spring上下文
     */
    private ApplicationContext applicationContext;

    @Override
    public String getCss() {
        return "";
    }

    @Override
    public Parent getView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getFxmlResource());
        fxmlLoader.setControllerFactory(this.applicationContext::getBean);

        Parent currentView;
        try {
            currentView = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String css = getCss();
        if (StringUtils.hasText(css)) {
            URL cssResource = getClass().getResource(css);

            currentView.getStylesheets().add(cssResource.toExternalForm());
        }

        return currentView;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 获取fxml资源
     */
    private URL getFxmlResource() {
        return getClass().getResource("/template/" + getFxml() + ".fxml");
    }
}
