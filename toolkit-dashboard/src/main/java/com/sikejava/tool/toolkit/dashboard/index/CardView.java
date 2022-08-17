package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.tool.toolkit.dashboard.component.javafx.annotation.JavaFxView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.view.AbstractFxmlView;

/**
 * 卡片视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:05:12
 */
@JavaFxView
public class CardView extends AbstractFxmlView {

    @Override
    public String getFxml() {
        return "index/card";
    }
}
