package com.example.appdisplayservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.appdisplayservice.mapper")
public class AppDisplayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDisplayServiceApplication.class, args);
    }

}
