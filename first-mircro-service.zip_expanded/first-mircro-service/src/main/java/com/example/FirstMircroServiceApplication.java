package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstMircroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMircroServiceApplication.class, args);
	}

}
