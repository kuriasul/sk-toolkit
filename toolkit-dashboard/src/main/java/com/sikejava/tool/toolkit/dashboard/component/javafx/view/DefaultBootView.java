package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * 默认的启动画面
 *
 * @author skjv2014@163.com
 * @since 2022-08-11 00:14:23
 */
public class DefaultBootView extends AbstractPlainView {

    @Override
    public Parent getRoot() {
        ImageView imageView = new ImageView(getClass().getResource("/image/splashScreen.jpg").toExternalForm());

        HBox hBox = new HBox();
        hBox.getChildren().add(imageView);

        return hBox;
    }
}
