package com.javaparainiciantes.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello-flux")
public class WebFluxHelloController {

	@GetMapping
	private Mono<String> hello(){
		return Mono.just("Hello Flux");
	}
}
