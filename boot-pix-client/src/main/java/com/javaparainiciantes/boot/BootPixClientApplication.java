package com.javaparainiciantes.boot;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.javaparainiciantes.boot.pix.api.CobApi;
import com.javaparainiciantes.boot.pix.api.PixApi;
import com.javaparainiciantes.boot.pix.model.CobsConsultadas;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class BootPixClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPixClientApplication.class, args);
	}

}
@AllArgsConstructor
@Component
class Runner implements ApplicationRunner {
	
	private final PixApi pixApi;
	private final CobApi cobApi;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		OffsetDateTime inicio = OffsetDateTime.of(2020, 4, 1, 0, 0, 0, 0, ZoneOffset.UTC);
		OffsetDateTime fim = OffsetDateTime.of(2020, 4, 1, 0, 0, 0, 0, ZoneOffset.UTC);
		CobsConsultadas cobGet = cobApi.cobGet(inicio, fim, null, null, null, null, null);
		System.out.println(cobGet);
	}
	
}