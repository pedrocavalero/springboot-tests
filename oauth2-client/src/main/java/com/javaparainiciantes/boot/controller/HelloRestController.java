package com.javaparainiciantes.boot.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.javaparainiciantes.boot.client.HelloRestClient;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
public class HelloRestController {

	HelloRestClient client;
	
	@GetMapping("/external-hello")
	Mono<String> getExternalHello() {
		return client.getHello();
	}
	
	@GetMapping("/external-hello-with-client")
	Mono<String> getExternalHelloUsingAuthorizedClient(
			@RegisteredOAuth2AuthorizedClient("teste") OAuth2AuthorizedClient authorizedClient) {
		return client.getHelloUsingAuthorizedClient(authorizedClient);
	}
	
}
