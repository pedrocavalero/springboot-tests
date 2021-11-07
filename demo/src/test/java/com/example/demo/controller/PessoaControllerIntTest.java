package com.example.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

@WebMvcTest(PessoaController.class)
@ExtendWith(SpringExtension.class)
class PessoaControllerIntTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private PessoaService pessoaService;
	
	@Test
	void testBuscaPorCpf() throws Exception {
		when(pessoaService.buscaPorCpf("1")).thenReturn(List.of(new Pessoa("Pedro", "1"))); 
		mvc.perform(get("/pessoa/cpf/1")).andExpect(content().json("[{\"nome\":\"Pedro\",\"cpf\":\"1\"}]"));
	}

}
