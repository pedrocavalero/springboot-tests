package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRunnerApplication.class, args);
	}
	

}

@Component
class Runner implements ApplicationRunner {
	
	@Value("${hello:Hello from code}")
	String hello;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Propriedade hello: " + hello);
	}
	
}