package com.javaparainiciantes.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import com.javaparainiciantes.boot.service.ITestService;

@SpringBootApplication
@EnableCaching
public class AnnotationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationTestApplication.class, args);
	}

}

@Component
class Runner implements ApplicationRunner {
	
	@Autowired
	@Qualifier("timedTestService")
	ITestService testService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(testService);
		System.out.println("1:"+testService.hello());
		System.out.println("2:"+testService.hello());
		System.out.println("3:"+testService.hello());
		System.out.println("4:"+testService.hello());
	}
	
}
