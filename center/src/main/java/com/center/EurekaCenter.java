package com.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenhj
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenter {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCenter.class, args);
    }
}
