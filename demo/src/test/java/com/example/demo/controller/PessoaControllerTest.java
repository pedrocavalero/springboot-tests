package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

@ExtendWith(MockitoExtension.class)
class PessoaControllerTest {

	@Mock
	private PessoaService pessoaService;
	@InjectMocks
	private PessoaController pessoaController;
	
	
	@Test
	void testBuscaPorCpf() {
		Pessoa pessoa = new Pessoa("Pedro", "1");
		when(pessoaService.buscaPorCpf("1")).thenReturn(List.of(pessoa));
		List<Pessoa> resultado = pessoaController.buscarPorCpf("1");
		assertEquals(1, resultado.size());
		assertEquals(pessoa, resultado.get(0));
	}

}
