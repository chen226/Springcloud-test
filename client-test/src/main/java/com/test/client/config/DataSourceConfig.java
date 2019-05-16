//package com.test.auth.config;
//
//import com.chj.common.mybatis.interceptor.DataPermissionInterceptor;
//import com.chj.common.mybatis.interceptor.ResultInterceptor;
//import org.apache.ibatis.plugin.Interceptor;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(SqlSessionFactoryBean sqlSessionFactoryBean) {
//        try {
//            sqlSessionFactoryBean.setPlugins(new Interceptor[]{new DataPermissionInterceptor(),new ResultInterceptor()});
//            return sqlSessionFactoryBean;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}