package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretKey {

	@Value("${secret.key}")
	private String jwtKey = "";

	public String getJwtKey() {
		return jwtKey;
	}
	
	
}
