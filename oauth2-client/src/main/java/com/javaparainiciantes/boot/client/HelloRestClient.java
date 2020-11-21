package com.javaparainiciantes.boot.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class HelloRestClient {

	@Autowired
	private WebClient webClient;

	public Mono<String> getHello() {
		return webClient
				.get()
				.uri("http://localhost:8081/hello")
				.retrieve()
				.bodyToMono(String.class);
	}
	
	public Mono<String> getHelloUsingAuthorizedClient(OAuth2AuthorizedClient authorizedClient) {
		return webClient
				.get()
				.uri("http://localhost:8081/hello")
				.attributes(ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient(authorizedClient))
				.retrieve()
				.bodyToMono(String.class)
				.map(string -> "Resource: " + string 
						+ " - Principal associated: " + authorizedClient.getPrincipalName()
						+ " - Token will expire at: " + authorizedClient.getAccessToken().getExpiresAt());
				
	}

}
