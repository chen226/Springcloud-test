package com.test.auth.repository;

import com.test.auth.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysUserRole selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysUserRole selectOne(@Param("record") SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysUserRole> selectList(@Param("record") SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysUserRole> selectPage(@Param("record") SysUserRole record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysUserRole record);
}