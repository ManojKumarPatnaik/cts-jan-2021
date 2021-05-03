package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

// this will use the authentication manager & user details service 
// this will define the application credentials

@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtAccessTokenConverter jwtAccessTokenConverter;
	
	@Autowired
	private TokenStore tokenstore;
	
	// defines the application client with the type of application
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
		.withClient("zomato")
		.secret("{noop}secretpassword")
		.authorizedGrantTypes("password", "refresh token")
		.scopes("web", "mobile");
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenstore)
		.accessTokenConverter(jwtAccessTokenConverter)
		.authenticationManager(authenticationManager)
		.userDetailsService(userDetailsService);
	}
	
	
}
