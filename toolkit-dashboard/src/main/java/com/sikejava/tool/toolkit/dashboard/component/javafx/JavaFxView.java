package com.sikejava.tool.toolkit.dashboard.component.javafx;

import javafx.scene.Parent;

/**
 * javafx视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 22:37:40
 */
public interface JavaFxView {

    /**
     * 获取fxml
     *
     * @return String fxml
     * @author skjv2014@163.com
     * @since 2022-08-10 22:40:00
     */
    String getFxml();

    /**
     * 获取css
     *
     * @return String css
     * @author skjv2014@163.com
     * @since 2022-08-10 22:40:37
     */
    String getCss();

    /**
     * 获取view
     *
     * @return Parent view
     * @author skjv2014@163.com
     * @since 2022-08-10 22:40:56
     */
    Parent getView();
}
