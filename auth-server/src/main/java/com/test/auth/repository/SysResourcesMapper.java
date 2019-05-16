package com.test.auth.repository;

import com.test.auth.entity.SysResources;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SysResourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int insert(SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int insertSelective(SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    SysResources selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    SysResources selectOne(@Param("record") SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    List<SysResources> selectList(@Param("record") SysResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    List<SysResources> selectPage(@Param("record") SysResources record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resources
     *
     * @mbg.generated Wed May 15 13:53:17 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysResources record);
}