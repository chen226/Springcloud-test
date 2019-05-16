package com.test.auth.repository;

import com.test.auth.entity.Table1;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Table1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int insert(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int insertSelective(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    Table1 selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int updateByPrimaryKey(@Param("record") Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    Table1 selectOne(@Param("record") Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    List<Table1> selectList(@Param("record") Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Wed May 08 16:14:30 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") Table1 record);
}