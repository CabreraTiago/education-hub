package com.coursehub.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CourseHubStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseHubStudentApplication.class, args);
	}

}
