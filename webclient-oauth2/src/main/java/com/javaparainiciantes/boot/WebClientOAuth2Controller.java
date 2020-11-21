package com.javaparainiciantes.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class WebClientOAuth2Controller {

	WebClient webClient;

	@RequestMapping(method = RequestMethod.GET, value = "/external-hello")
	Mono<String> getExternalHello() {
		return webClient
				.get()
				.uri("http://localhost:8081/hello")
				.retrieve()
				.bodyToMono(String.class)
				.map(retorno -> "Eu recebi externamente um " + retorno);
	}
}
