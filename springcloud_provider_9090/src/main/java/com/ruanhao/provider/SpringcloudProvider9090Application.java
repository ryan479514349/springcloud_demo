package com.ruanhao.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.ruanhao.provider.mapper")
public class SpringcloudProvider9090Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider9090Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
