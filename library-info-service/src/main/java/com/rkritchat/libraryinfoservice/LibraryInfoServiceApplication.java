package com.rkritchat.libraryinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LibraryInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryInfoServiceApplication.class, args);
	}

}
