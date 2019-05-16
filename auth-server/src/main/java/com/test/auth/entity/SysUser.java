package com.test.auth.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SysUser {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String nickName;

    /**
     * 用户编号（作为用户登录的账号）
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String phoneNum;

    /**
     * 
     */
    private String birthday;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String telPhone;

    /**
     * 
     */
    private String email;

    /**
     * 'F'-女，'M'-男，'S'-保密
     */
    private String sex;

    /**
     * 
     */
    private String isFirstLogin;

    /**
     * 是否可用,1表示可用，0表示不可用
     */
    private Byte enabled;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 记录版本
     */
    private Long recordVersion;


}