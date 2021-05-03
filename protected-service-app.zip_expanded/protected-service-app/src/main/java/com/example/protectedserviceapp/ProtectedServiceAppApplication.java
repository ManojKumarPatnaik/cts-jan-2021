package com.example.protectedserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
@RestController
@RequestMapping("api")
public class ProtectedServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtectedServiceAppApplication.class, args);
	}

	@GetMapping(path = "/fetch")
	public String getUri() { 
		return "Get Informations";
	}
	
	@PostMapping(path = "/store")
	public String storeUri() { 
		return "Store Informations";
	}
}
