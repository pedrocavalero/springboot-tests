package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class NiceComponent {
	
	public String doSomethingNice(String parameter) {
		return parameter + " ok";
	}

}
