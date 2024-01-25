package com.coursehub.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CourseHubGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseHubGatewayApplication.class, args);
	}

}
