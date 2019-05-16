package com.test.client.repository;

import com.test.client.entity.Table3;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Table3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int insert(Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int insertSelective(Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    Table3 selectByPrimaryKey(@Param("id") Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int updateByPrimaryKeySelective(@Param("record") Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int updateByPrimaryKey(@Param("record") Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    Table3 selectOne(@Param("record") Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    List<Table3> selectList(@Param("record") Table3 record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table3
     *
     * @mbg.generated Wed May 08 16:17:52 CST 2019
     */
    int updateByPrimaryKeySelectiveLock(@Param("record") Table3 record);
}