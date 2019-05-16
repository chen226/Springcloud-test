package com.test.auth.repository;

import com.test.auth.entity.SysUserGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysUserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insert(SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insertSelective(SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysUserGroup selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysUserGroup selectOne(@Param("record") SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysUserGroup> selectList(@Param("record") SysUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysUserGroup> selectPage(@Param("record") SysUserGroup record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysUserGroup record);
}