package com.test.auth.entity;

import java.util.Date;

public class SysButton {
    /**
     * ID
     */
    private Long id;

    /**
     * 按钮名称
     */
    private String buttonName;

    /**
     * 按钮编号
     */
    private String buttonCode;

    /**
     * 按钮类型（用于前端处理）
     */
    private String buttonType;

    /**
     * 菜单url
     */
    private String buttonUrl;

    /**
     * 菜单icon
     */
    private String buttonIcon;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单编号
     */
    private String menuCode;

    /**
     * 
     */
    private String sys;

    /**
     * 备注
     */
    private String remark;

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
     * This method returns the value of the database column sys_button.id
     *
     * @return the value of sys_button.id
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.id
     *
     * @param id the value for sys_button.id
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.button_name
     *
     * @return the value of sys_button.button_name
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.button_name
     *
     * @param buttonName the value for sys_button.button_name
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.button_code
     *
     * @return the value of sys_button.button_code
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getButtonCode() {
        return buttonCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.button_code
     *
     * @param buttonCode the value for sys_button.button_code
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode == null ? null : buttonCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.button_type
     *
     * @return the value of sys_button.button_type
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getButtonType() {
        return buttonType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.button_type
     *
     * @param buttonType the value for sys_button.button_type
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setButtonType(String buttonType) {
        this.buttonType = buttonType == null ? null : buttonType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.button_url
     *
     * @return the value of sys_button.button_url
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getButtonUrl() {
        return buttonUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.button_url
     *
     * @param buttonUrl the value for sys_button.button_url
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setButtonUrl(String buttonUrl) {
        this.buttonUrl = buttonUrl == null ? null : buttonUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.button_icon
     *
     * @return the value of sys_button.button_icon
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getButtonIcon() {
        return buttonIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.button_icon
     *
     * @param buttonIcon the value for sys_button.button_icon
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setButtonIcon(String buttonIcon) {
        this.buttonIcon = buttonIcon == null ? null : buttonIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.menu_name
     *
     * @return the value of sys_button.menu_name
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.menu_name
     *
     * @param menuName the value for sys_button.menu_name
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.menu_code
     *
     * @return the value of sys_button.menu_code
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.menu_code
     *
     * @param menuCode the value for sys_button.menu_code
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.sys
     *
     * @return the value of sys_button.sys
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getSys() {
        return sys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.sys
     *
     * @param sys the value for sys_button.sys
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setSys(String sys) {
        this.sys = sys == null ? null : sys.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.remark
     *
     * @return the value of sys_button.remark
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.remark
     *
     * @param remark the value for sys_button.remark
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.create_time
     *
     * @return the value of sys_button.create_time
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.create_time
     *
     * @param createTime the value for sys_button.create_time
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.update_time
     *
     * @return the value of sys_button.update_time
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.update_time
     *
     * @param updateTime the value for sys_button.update_time
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_button.record_version
     *
     * @return the value of sys_button.record_version
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_button.record_version
     *
     * @param recordVersion the value for sys_button.record_version
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }
}