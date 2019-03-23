package com.rkritchat.studentinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}

}
