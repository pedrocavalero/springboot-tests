package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokExampleApplication.class, args);
		
		Person p1 = new Person("Pedro", 39);
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = Person.builder().name("Pedro").age(38).build();
		System.out.println(p2);
	}

}
