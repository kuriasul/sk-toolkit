package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.framework.flame.javafx.FxView;
import com.sikejava.framework.flame.javafx.JavaFxContext;
import com.sikejava.tool.toolkit.dashboard.common.vo.ToolCardVO;

import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * 首页
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:18:38
 */
@Component
public class IndexController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private HBox titleBar;

    @FXML
    private FlowPane cardFlowPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        titleBar.setOnMousePressed((mouseEvent) -> {
            Stage stage = (Stage) titleBar.getScene().getWindow();

            xOffset = mouseEvent.getScreenX() - stage.getX();
            yOffset = mouseEvent.getScreenY() - stage.getY();
        });
        titleBar.setOnMouseDragged((mouseEvent) -> {
            Stage stage = (Stage) titleBar.getScene().getWindow();

            stage.setX(mouseEvent.getScreenX() - xOffset);
            stage.setY(mouseEvent.getScreenY() - yOffset);
        });

        List<ToolCardVO> tooCardVOList = getToolCardVOList();
        tooCardVOList.forEach(tooCardVO -> {
            FxView<CardController> fxView = JavaFxContext.load("index/card", "index");
            CardController cardController = fxView.getController();
            cardController.setData(tooCardVO);

            cardFlowPane.getChildren().add(fxView.getRoot());
        });
    }

    @FXML
    public void minimize() {
        Stage stage = (Stage) titleBar.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    public void maximize() {
        Stage stage = (Stage) titleBar.getScene().getWindow();
        stage.setMaximized(!stage.isMaximized());
    }

    @FXML
    public void close() {
        Stage stage = (Stage) titleBar.getScene().getWindow();
        stage.close();
    }

    private List<ToolCardVO> getToolCardVOList() {
        List<ToolCardVO> toolCardList = new ArrayList<>();

        ToolCardVO toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);


        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        toolCardVO = new ToolCardVO();
        toolCardVO.setTitle("aa");
        toolCardVO.setDesc("aabbcc");
        toolCardVO.setImagePath("/image/bootWindow.jpg");
        toolCardList.add(toolCardVO);

        return toolCardList;
    }
}
