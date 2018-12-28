package com.guotianchain.zubaobei.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  启动入口
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}

}

