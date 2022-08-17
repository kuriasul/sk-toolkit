package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.tool.toolkit.dashboard.component.javafx.annotation.JavaFxController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 首页
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:18:38
 */
@JavaFxController
public class IndexController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private BorderPane container;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        container.setOnMousePressed((mouseEvent) -> {
            Stage stage = (Stage) container.getScene().getWindow();

            xOffset = mouseEvent.getScreenX() - stage.getX();
            yOffset = mouseEvent.getScreenY() - stage.getY();
        });
        container.setOnMouseDragged((mouseEvent) -> {
            Stage stage = (Stage) container.getScene().getWindow();

            stage.setX(mouseEvent.getScreenX() - xOffset);
            stage.setY(mouseEvent.getScreenY() - yOffset);
        });
    }

    @FXML
    public void minimize() {
        Stage stage = (Stage) container.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    public void maximize() {
        Stage stage = (Stage) container.getScene().getWindow();
        stage.setMaximized(!stage.isMaximized());
    }

    @FXML
    public void close() {
        Stage stage = (Stage) container.getScene().getWindow();
        stage.close();
    }
}
