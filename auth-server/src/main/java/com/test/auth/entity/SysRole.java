package com.test.auth.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SysRole {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String roleName;

    /**
     * 用户编号（作为用户登录的账号）
     */
    private String roleCode;

    /**
     * 所属组织
     */
    private Long groupId;

    /**
     * 是否可用,1表示可用，0表示不可用
     */
    private Boolean enabled;

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
     * 
     */
    private String sys;

}