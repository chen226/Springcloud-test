package com.test.client;


/**
 * @author chenhj
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringCloudApplication
@MapperScan("com.test.client.repository")
@EnableHystrix
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.test.client","com.chj.*"})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
