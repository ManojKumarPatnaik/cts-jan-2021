package com.example.protectedserviceapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceOwner extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.POST, "/api/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.GET, "/api/**").hasAnyRole("USER", "ADMIN")
		.anyRequest().authenticated();
	}

	
}
