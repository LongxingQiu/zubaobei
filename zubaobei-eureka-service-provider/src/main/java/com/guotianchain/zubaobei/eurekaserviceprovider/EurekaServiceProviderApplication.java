package com.guotianchain.zubaobei.eurekaserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceProviderApplication.class, args);
	}
}
