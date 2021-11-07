package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloController.class)
@ExtendWith(SpringExtension.class)
class HelloControllerIntTest {
	
	@Autowired
	private MockMvc mvc; 

	@Test
	void testHello() throws Exception {
		mvc.perform(get("/hello")).andExpect(content().string("Hello Universe 2"));
	}

}
