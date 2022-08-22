package com.sikejava.tool.toolkit.dashboard.common.vo;

import com.sikejava.framework.flame.common.model.BaseObject;

import lombok.Getter;
import lombok.Setter;

/**
 * 工具卡片VO
 *
 * @author skjv2014@163.com
 * @since 2022-08-22 08:01:01
 */
@Getter
@Setter
public class ToolCardVO extends BaseObject {
    /**
     * 图片路径
     */
    private String imagePath;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String desc;
}
