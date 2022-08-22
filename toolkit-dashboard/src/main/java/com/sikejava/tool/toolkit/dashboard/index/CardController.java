package com.sikejava.tool.toolkit.dashboard.index;

import com.sikejava.tool.toolkit.dashboard.common.vo.ToolCardVO;

import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 卡片
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:18:38
 */
@Component
public class CardController implements Initializable {

    @FXML
    private ImageView toolImage;

    @FXML
    private Label toolTitle;

    @FXML
    private Label toolDesc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setData(ToolCardVO toolCardVO) {
        this.toolImage.setImage(new Image(toolCardVO.getImagePath()));
        this.toolTitle.setText(toolCardVO.getTitle());
        this.toolDesc.setText(toolCardVO.getDesc());
    }
}
