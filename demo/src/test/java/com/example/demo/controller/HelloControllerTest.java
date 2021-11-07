package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
	void testHello() {
		HelloController hc = new HelloController();
		assertEquals("Hello Universe 2", hc.hello());
	}

}
