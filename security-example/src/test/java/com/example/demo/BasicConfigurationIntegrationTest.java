package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BasicConfigurationIntegrationTest {
 
	TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort 
    int port;
 
    @BeforeEach
    public void setUp() throws MalformedURLException {
        restTemplate = new TestRestTemplate("user", "password");
        base = new URL("http://localhost:" + port+ "/hello");
    }
 
    @Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject(base.toURI(),
				String.class)).contains("hello");
	}
    @Test
    public void whenLoggedUserRequestsHomePage_ThenSuccess()
     throws IllegalStateException, IOException {
        ResponseEntity<String> response =
          restTemplate.getForEntity(base.toString(), String.class);
 
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("hello"));
    }
 
    @Test
    public void whenUserWithWrongCredentials_thenUnauthorizedPage() 
      throws Exception {
 
        restTemplate = new TestRestTemplate("user", "wrongpassword");
        ResponseEntity<String> response =
          restTemplate.getForEntity(base.toString(), String.class);
 
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
    }
}