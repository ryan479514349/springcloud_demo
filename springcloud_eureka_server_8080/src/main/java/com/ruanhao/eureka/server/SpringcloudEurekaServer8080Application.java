package com.ruanhao.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用一个组件：
 * 1、添加起步依赖
 * 2、配置@Enablexxxx
 * 3、配置application.yml
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8080Application.class, args);
    }
}


