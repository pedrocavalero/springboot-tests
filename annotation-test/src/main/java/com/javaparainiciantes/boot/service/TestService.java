package com.javaparainiciantes.boot.service;

import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService{

	public String hello() {
		System.out.println("Imprimindo Hello World");
		return "Hello World";
	}
}
