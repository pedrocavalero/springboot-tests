package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pessoa;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{
	
	List<Pessoa> findByCpf(String cpf);
	
}
