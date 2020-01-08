package com.zq.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@TableName("user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键")
    @TableField("id")
    private Integer id;

    @TableField("username")
    @ApiModelProperty(value = "用户名")
    private String username;

    @TableField("password")
    @ApiModelProperty(value = "密码")
    private String password;

    @TableField("salt")
    @ApiModelProperty(value = "盐（密匙）")
    private String salt;

    @TableField("name")
    @ApiModelProperty(value = "姓名")
    private String name;

    @TableField("phone")
    @ApiModelProperty(value = "电话")
    private String phone;

    @TableField("email")
    @ApiModelProperty(value = "邮箱")
    private String email;

    @TableField("is_deleted")
    @ApiModelProperty(value = "删除标识")
    private Integer isDeleted;

    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    //@Transient注解，ORM框架将忽略该属性
//    @Transient
//    List<AdminRole> roles;
}