package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.tool.toolkit.dashboard.component.javafx.AbstractJavaFxView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.annotation.JavaFxView;

/**
 * 首页视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:05:12
 */
@JavaFxView
public class IndexView extends AbstractJavaFxView {

    @Override
    public String getFxml() {
        return "index/index";
    }
}
