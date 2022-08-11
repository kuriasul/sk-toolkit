package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.tool.toolkit.dashboard.component.javafx.annotation.JavaFxView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.view.AbstractFxmlView;

/**
 * 首页视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:05:12
 */
@JavaFxView
public class IndexView extends AbstractFxmlView {

    @Override
    public String getFxml() {
        return "index/index";
    }
}
