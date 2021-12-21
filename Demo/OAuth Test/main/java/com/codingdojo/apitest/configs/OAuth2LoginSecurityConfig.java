package com.codingdojo.apitest.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

@Configuration
public class OAuth2LoginSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http
			.authorizeRequests(authorize -> authorize.anyRequest().authenticated())
			.oauth2Login();
		// @formatter:on
	}	
	
	@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
	    return new InMemoryClientRegistrationRepository(this.spotifyClientRegistration());
	}
	

	private ClientRegistration spotifyClientRegistration() {
	    // @formatter:off
	    return ClientRegistration
	            .withRegistrationId("spotify")
	            .clientId("546671a3023e41a09893905382d0c7a6")
	            .clientSecret("c573a361947347cfa01f54ffe30b8482")
	            .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
	            .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
	            .redirectUri("http://localhost:8080/login/oauth2/code/spotify")
	            .scope("user-read-private", "user-read-email")
	            .authorizationUri("https://accounts.spotify.com/authorize")
	            .tokenUri("https://accounts.spotify.com/api/token")
	            .userInfoUri("https://api.spotify.com/v1/me")
	            .userNameAttributeName("display_name")
	            .clientName("spotify")
	            .build();
	    // @formatter:on
	}
	
}
