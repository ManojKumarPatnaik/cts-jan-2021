package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer // this acts as a OAuth2 server
@EnableResourceServer // this acts as protected resource
@RestController
public class AuthenticationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationDemoApplication.class, args);
	}

	// an end point to receive the token and validate the user, it returns the user informations & their roles
	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> user(OAuth2Authentication auth) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", auth.getUserAuthentication().getPrincipal());
		map.put("authorities", AuthorityUtils.authorityListToSet(auth.getUserAuthentication().getAuthorities()));
		return map;
	}
}
