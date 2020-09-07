package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class CrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudExampleApplication.class, args);
	}

}

@Component
@AllArgsConstructor
class Runner implements ApplicationRunner {

	PersonRepository repository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repository.findByNomeContaining("1").forEach(System.out::println);
		
	}
	
}