package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

// This class will create AuthenticationManagerBean & UserDetailsServiceBean
// This will also find the user credentials with roles

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	// defines the user, their passwords & their roles
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("super.user").password("{noop}superuser").roles("USER", "ADMIN")
		.and()
		.withUser("guest").password("{noop}guest123").roles("USER");
	}

	// is used by spring security to handle authentication
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}

	// is used to hold the user information
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		// TODO Auto-generated method stub
		return super.userDetailsServiceBean();
	}
	
	
}
