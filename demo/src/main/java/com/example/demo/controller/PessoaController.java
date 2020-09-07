package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

@InboundAdapter
public class PessoaController {
	
	PessoaService pessoaService;
	
	public PessoaController(PessoaService pessoaService) {
		super();
		this.pessoaService = pessoaService;
	}

	@RequestMapping(path="/pessoa", method = RequestMethod.POST)
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@RequestMapping(path="/pessoa", method = RequestMethod.GET)
	public List<Pessoa> buscarTodas(){
		return pessoaService.listar();
	}

	@RequestMapping(path="/pessoa/cpf/{cpf}", method = RequestMethod.GET)
	public List<Pessoa> buscarPorCpf(@PathVariable String cpf){
		return pessoaService.buscaPorCpf(cpf);
	}

	@RequestMapping(path="/pessoa/{id}", method = RequestMethod.GET)
	public Optional<Pessoa> buscarPorCpf(@PathVariable Long id){
		return pessoaService.buscaPorId(id);
	}
}
