package com.javaparainiciantes.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.javaparainiciantes.boot.client.HelloRestClient;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class OAuth2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ClientApplication.class, args);
	}

}

@AllArgsConstructor
@Component
class Runner implements ApplicationRunner {
	
	HelloRestClient client;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		client.getHello().subscribe(System.out::println);
	}
	
}