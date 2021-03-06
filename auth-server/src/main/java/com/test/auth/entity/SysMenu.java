package com.test.auth.entity;

import java.util.Date;

public class SysMenu {
    /**
     * ID
     */
    private Long id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单编号
     */
    private String menuCode;

    /**
     * 前段path
     */
    private String menuPath;

    /**
     * 菜单url
     */
    private String menuUrl;

    /**
     * 菜单icon
     */
    private String menuIcon;

    /**
     * 菜单级别
     */
    private String menuLevel;

    /**
     * 菜单类型0：pc,1:手机
     */
    private String menuType;

    /**
     * 
     */
    private String parentCode;

    /**
     * 排序
     */
    private Long menuOrder;

    /**
     * 
     */
    private Byte hidden;

    /**
     * 
     */
    private Byte enabled;

    /**
     * 
     */
    private String sys;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 记录版本
     */
    private Long recordVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.id
     *
     * @return the value of sys_menu.id
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.id
     *
     * @param id the value for sys_menu.id
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_name
     *
     * @return the value of sys_menu.menu_name
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_name
     *
     * @param menuName the value for sys_menu.menu_name
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_code
     *
     * @return the value of sys_menu.menu_code
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_code
     *
     * @param menuCode the value for sys_menu.menu_code
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_path
     *
     * @return the value of sys_menu.menu_path
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuPath() {
        return menuPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_path
     *
     * @param menuPath the value for sys_menu.menu_path
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath == null ? null : menuPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_url
     *
     * @return the value of sys_menu.menu_url
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_url
     *
     * @param menuUrl the value for sys_menu.menu_url
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_icon
     *
     * @return the value of sys_menu.menu_icon
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_icon
     *
     * @param menuIcon the value for sys_menu.menu_icon
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_level
     *
     * @return the value of sys_menu.menu_level
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuLevel() {
        return menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_level
     *
     * @param menuLevel the value for sys_menu.menu_level
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel == null ? null : menuLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_type
     *
     * @return the value of sys_menu.menu_type
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_type
     *
     * @param menuType the value for sys_menu.menu_type
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_code
     *
     * @return the value of sys_menu.parent_code
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_code
     *
     * @param parentCode the value for sys_menu.parent_code
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_order
     *
     * @return the value of sys_menu.menu_order
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Long getMenuOrder() {
        return menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_order
     *
     * @param menuOrder the value for sys_menu.menu_order
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setMenuOrder(Long menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.hidden
     *
     * @return the value of sys_menu.hidden
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Byte getHidden() {
        return hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.hidden
     *
     * @param hidden the value for sys_menu.hidden
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.enabled
     *
     * @return the value of sys_menu.enabled
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.enabled
     *
     * @param enabled the value for sys_menu.enabled
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.sys
     *
     * @return the value of sys_menu.sys
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public String getSys() {
        return sys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.sys
     *
     * @param sys the value for sys_menu.sys
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setSys(String sys) {
        this.sys = sys == null ? null : sys.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.create_time
     *
     * @return the value of sys_menu.create_time
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.create_time
     *
     * @param createTime the value for sys_menu.create_time
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.update_time
     *
     * @return the value of sys_menu.update_time
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.update_time
     *
     * @param updateTime the value for sys_menu.update_time
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.record_version
     *
     * @return the value of sys_menu.record_version
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.record_version
     *
     * @param recordVersion the value for sys_menu.record_version
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }
}