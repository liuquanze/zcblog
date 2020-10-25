package com.progzc.blog.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description 菜单管理
 * @Author zhaochao
 * @Date 2020-10-25
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysMenu对象", description="菜单管理")
public class SysMenu implements Serializable {


    @ApiModelProperty(value = "主键,菜单id")
      @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private Long menuId;

    @ApiModelProperty(value = "父级菜单id")
    private Long parentId;

    @ApiModelProperty(value = "菜单名称")
    private String name;

    @ApiModelProperty(value = "路由地址")
    private String url;

    @ApiModelProperty(value = "权限")
    private String perms;

    @ApiModelProperty(value = "菜单类型：0-目录，1-菜单，2-按钮")
    private Integer type;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "同级菜单排序")
    private Integer orderNum;


}
