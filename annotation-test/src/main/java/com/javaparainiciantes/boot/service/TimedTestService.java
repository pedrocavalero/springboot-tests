package com.javaparainiciantes.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TimedTestService implements ITestService{
	
	@Autowired
	@Qualifier("cachedTestService")
	ITestService testService;

	public String hello() {
		long initialTime = System.nanoTime();
		String result = testService.hello();
		long finalTime = System.nanoTime();
		System.out.printf("A chamada levou %f ms\n", (finalTime-initialTime)/1000000.0);
		return result;
	}

}
