package com.javaparainiciantes.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class WebclientOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebclientOauth2Application.class, args);
	}

}

@Component
@AllArgsConstructor
class Runner implements ApplicationRunner {

	WebClient webClient;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		webClient
		.get()
		.uri("http://localhost:8081/hello")
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(System.out::println);
	}
	
}