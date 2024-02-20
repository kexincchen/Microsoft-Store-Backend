package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NacosServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosServerApplication.class, args);
	}

}
