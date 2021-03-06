package com.test.auth.repository;

import com.test.auth.entity.SysGroupType;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysGroupTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insert(SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insertSelective(SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysGroupType selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysGroupType selectOne(@Param("record") SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysGroupType> selectList(@Param("record") SysGroupType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysGroupType> selectPage(@Param("record") SysGroupType record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_type
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysGroupType record);
}