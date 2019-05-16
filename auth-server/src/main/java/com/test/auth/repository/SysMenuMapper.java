package com.test.auth.repository;

import com.test.auth.entity.SysMenu;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    SysMenu selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    SysMenu selectOne(@Param("record") SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    List<SysMenu> selectList(@Param("record") SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    List<SysMenu> selectPage(@Param("record") SysMenu record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed May 15 13:51:03 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysMenu record);
}