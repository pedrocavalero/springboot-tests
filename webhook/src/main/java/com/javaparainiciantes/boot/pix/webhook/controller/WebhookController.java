package com.javaparainiciantes.boot.pix.webhook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WebhookController {
	
	@GetMapping("/")
	public String hello() {
		log.info("Recebendo GET Hello /");
		return "Webhook Hello";
	}
	
	@PostMapping("/webhook/pix")
	public ResponseEntity<String> webhookPix(@RequestBody String body) {
		log.info("Recebendo um Post no /webhook/pix body {}",body);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/webhook")
	public ResponseEntity<String> webhook(@RequestBody String body) {
		log.info("Recebendo um Post no /webhook body {}",body);
		return ResponseEntity.ok().build();
	}

}
