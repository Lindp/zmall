package com.lindp.zmall.admin.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 运营按钮
 * </p>
 *
 * @author lindp
 * @since 2020-10-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AdminButton对象", description="运营按钮")
public class AdminButton implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "运营菜单ID")
    private Long adminMenuId;

    @ApiModelProperty(value = "按钮名称")
    private String name;

    @ApiModelProperty(value = "按钮值")
    private String value;

    @ApiModelProperty(value = "是否隐藏")
    private Boolean isHidden;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "排序号")
    private BigDecimal sort;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
