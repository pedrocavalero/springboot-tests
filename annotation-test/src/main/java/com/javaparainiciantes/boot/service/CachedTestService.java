package com.javaparainiciantes.boot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CachedTestService implements ITestService{

	TestService testService;

	@Cacheable("hello")
	public String hello() {
		return testService.hello();
	}
	
}
