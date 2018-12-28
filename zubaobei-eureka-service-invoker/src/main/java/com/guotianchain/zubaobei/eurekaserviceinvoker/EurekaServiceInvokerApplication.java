package com.guotianchain.zubaobei.eurekaserviceinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Eureka 服务调用者
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaServiceInvokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceInvokerApplication.class, args);
	}
}
