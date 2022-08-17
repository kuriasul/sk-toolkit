package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 简单的视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-11 00:09:48
 */
public interface PlainView {

    /**
     * 获取标题
     *
     * @return 标题
     * @author skjv2014@163.com
     * @since 2022-08-13 11:32:44
     */
    String getTitle();

    /**
     * 获取stage风格
     *
     * @return stage风格
     * @author skjv2014@163.com
     * @since 2022-08-13 11:34:02
     */
    StageStyle getStageStyle();

    /**
     * 获取根
     *
     * @return Parent 根
     * @author skjv2014@163.com
     * @since 2022-08-11 00:13:49
     */
    Parent getRoot();

    /**
     * 获取stage
     *
     * @return Stage
     * @author skjv2014@163.com
     * @since 2022-08-13 19:26:14
     */
    Stage getStage();

    /**
     * 显示
     *
     * @author skjv2014@163.com
     * @since 2022-08-13 18:55:46
     */
    void show();

    /**
     * 关闭
     *
     * @author skjv2014@163.com
     * @since 2022-08-13 19:26:37
     */
    void close();
}
