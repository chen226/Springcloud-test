package com.test.auth.repository;

import com.test.auth.entity.SysGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insert(SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int insertSelective(SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysGroup selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    SysGroup selectOne(@Param("record") SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysGroup> selectList(@Param("record") SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    List<SysGroup> selectPage(@Param("record") SysGroup record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Wed May 15 13:57:13 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysGroup record);
}