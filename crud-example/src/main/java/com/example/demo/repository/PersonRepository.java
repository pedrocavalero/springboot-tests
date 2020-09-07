package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Person findByNome(String nome);
	Person findByAge(int age);
	List<Person> findByAgeGreaterThanEqual(int age);
	List<Person> findByNomeLike(String nome);
	List<Person> findByNomeContaining(String nome);
}
