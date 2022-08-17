package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * 抽象的fxml视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 22:28:53
 */
public abstract class AbstractFxmlView extends AbstractPlainView implements FxmlView, ApplicationContextAware {
    private Parent root;

    /**
     * spring上下文
     */
    private ApplicationContext applicationContext;

    @Override
    public String getCss() {
        return "";
    }

    @Override
    public Parent getRoot() {
        if (Objects.isNull(root)) {
            FXMLLoader fxmlLoader = new FXMLLoader(getFxmlResource());
            fxmlLoader.setControllerFactory(this.applicationContext::getBean);

            try {
                root = fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String css = getCss();
            if (StringUtils.hasText(css)) {
                URL cssResource = getClass().getResource(css);

                root.getStylesheets().add(cssResource.toExternalForm());
            }
        }

        return root;
    }

    /**
     * 获取fxml资源
     */
    private URL getFxmlResource() {
        return getClass().getResource("/template/" + getFxml() + ".fxml");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
