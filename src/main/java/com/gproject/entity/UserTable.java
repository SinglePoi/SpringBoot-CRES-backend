package com.gproject.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "账号")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "院校")
    private Integer collegeId;

    @ApiModelProperty(value = "角色权限")
    private Integer roleId;

    @ApiModelProperty(value = "账号状态：0-活跃/1-禁用")
    private boolean status;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
