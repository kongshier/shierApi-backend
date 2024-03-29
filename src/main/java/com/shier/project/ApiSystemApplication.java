package com.shier.project;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shier.project.mapper")
@EnableDubbo
public class ApiSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiSystemApplication.class, args);
    }

}
