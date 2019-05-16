package com.test.auth.controller;

import com.chj.common.mybatis.annotation.DataPermissionAop;
import com.test.auth.entity.Table1;
import com.test.auth.entity.Table2;
import com.test.auth.entity.Table3;
import com.test.auth.entity.TableVo;
import com.test.auth.repository.Table1Mapper;
import com.test.auth.repository.Table2Mapper;
import com.test.auth.repository.Table3Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户测试数据权限
 * @author chenhj
 */
@Slf4j
@RestController
@DataPermissionAop
@RequestMapping(value = "/dataPermission",produces = "application/json; charset=UTF-8")
public class DataPermissionTestController {
    @Autowired
    Table1Mapper table1Mapper;
    @Autowired
    Table2Mapper table2Mapper;
    @Autowired
    Table3Mapper table3Mapper;
    /**
     *不加注解
     * @return
     */
    @RequestMapping("/test")
    public TableVo test(){
        try{
            return query();
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }
    /**
     *注解关闭
     * @return
     */
    @DataPermissionAop(enabled = false)
    @RequestMapping("/test1")
    public TableVo test1(){
        try{
            SecurityContextHolder.getContext().getAuthentication();
            return query();
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }
    /**
     *注解启动
     * @return
     */
    @DataPermissionAop
    @RequestMapping("/test2")
    public TableVo test2(){
        try{
            return query();
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }
    private TableVo query(){
        List<Table1> t = table1Mapper.selectList(new Table1());
        List<Table2> t2 = table2Mapper.selectList(new Table2());
        List<Table3> t3 = table3Mapper.selectList(new Table3());
        log.info("t={},t2={},t3={}",t,t2,t3);
        TableVo tableVo=new TableVo();
        tableVo.setT(t);
        tableVo.setT2(t2);
        tableVo.setT3(t3);
        return tableVo;
    }
}
