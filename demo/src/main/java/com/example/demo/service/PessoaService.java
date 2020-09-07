package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

@MeuServico
public class PessoaService {
	
	PessoaRepository repository;
	NiceComponent component;
	
	public PessoaService(PessoaRepository repository, NiceComponent component) {
		super();
		this.repository = repository;
		this.component = component;
	}

	public Pessoa salvar(Pessoa pessoa) {
		List<Pessoa> pessoas = repository.findByCpf(pessoa.getCpf());
		if(pessoas.size()>0) {
			throw new RuntimeException("Pessoa com este cpf já existe.");
		}		
		return repository.save(pessoa);
	}
	
	public List<Pessoa> listar(){
		System.out.println(component.doSomethingNice("Listar"));
		return repository.findAll();
	}
	
	public List<Pessoa> buscaPorCpf(String cpf){
		return repository.findByCpf(cpf);
	}
	
	public Optional<Pessoa> buscaPorId(Long id){
		return repository.findById(id);
	}

}
