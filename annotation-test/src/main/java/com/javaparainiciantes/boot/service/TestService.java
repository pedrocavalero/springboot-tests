package com.javaparainiciantes.boot.service;

import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService{

	public String hello() {
		System.out.println("Imprimindo Hello World Sem Cache");
		delay();
		return "Hello World";
	}

	private void delay() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
