package com.sikejava.tool.toolkit.dashboard.component.javafx.splash;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * 默认的启动画面
 *
 * @author skjv2014@163.com
 * @since 2022-08-11 00:14:23
 */
public class DefaultSplashScreen implements SplashScreen {

    @Override
    public Parent getView() {
        return new HBox(new Button("aa"));
    }
}
