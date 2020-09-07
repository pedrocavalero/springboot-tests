package com.example.demo.controller;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RestController;

@Retention(RUNTIME)
@Target(TYPE)
@RestController
public @interface InboundAdapter {
	@AliasFor(annotation = RestController.class)
	String value() default "";
}
