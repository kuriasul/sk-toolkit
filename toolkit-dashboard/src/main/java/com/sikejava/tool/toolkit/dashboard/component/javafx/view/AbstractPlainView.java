package com.sikejava.tool.toolkit.dashboard.component.javafx.view;

import java.util.Objects;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 抽象的普通的视图
 *
 * @author skjv2014@163.com
 * @since 2022-08-13 19:00:15
 */
public abstract class AbstractPlainView implements PlainView {
    private Stage stage;

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public StageStyle getStageStyle() {
        return StageStyle.TRANSPARENT;
    }

    @Override
    public Stage getStage() {
        if (Objects.isNull(stage)) {
            stage = new Stage();
            stage.setTitle(getTitle());
            stage.initStyle(getStageStyle());
            stage.setScene(new Scene(getRoot(), Color.TRANSPARENT));
        }
        return stage;
    }

    @Override
    public void show() {
        getStage().show();
    }

    @Override
    public void close() {
        getStage().close();
    }
}
