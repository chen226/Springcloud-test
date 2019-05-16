package com.test.auth.repository;

import com.test.auth.entity.SysButton;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

@Mapper
public interface SysButtonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int insert(SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int insertSelective(SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    SysButton selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int updateByPrimaryKey(@Param("record") SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    SysButton selectOne(@Param("record") SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    List<SysButton> selectList(@Param("record") SysButton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    List<SysButton> selectPage(@Param("record") SysButton record, @Param("pageable") Pageable pageable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_button
     *
     * @mbg.generated Wed May 15 13:47:45 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") SysButton record);
}