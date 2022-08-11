package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import com.sikejava.tool.toolkit.dashboard.component.javafx.view.SimpleView;

/**
 * fxml视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-11 07:57:50
 */
public interface FxmlView extends SimpleView {

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
}
