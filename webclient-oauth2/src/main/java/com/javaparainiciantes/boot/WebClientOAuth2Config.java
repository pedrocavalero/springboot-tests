package com.javaparainiciantes.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientOAuth2Config {

	@Bean
	WebClient webClient(ReactiveClientRegistrationRepository clientRegistrations, 
			ReactiveOAuth2AuthorizedClientService clientService) {
		ServerOAuth2AuthorizedClientExchangeFilterFunction oauth =
				new ServerOAuth2AuthorizedClientExchangeFilterFunction(
						new AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager(
								clientRegistrations, clientService));
		oauth.setDefaultClientRegistrationId("teste");
		return WebClient.builder()
				.filter(oauth)
				.build();
	}
	
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
	    http.authorizeExchange()
	      .anyExchange()
	      .authenticated()
	      .and()
	      .httpBasic();
	    return http.build();
	}
}
