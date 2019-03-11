package com.mmenezes.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository<BEAN , PRIMARY KEY>
@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{

	//criando um mentodo para retornar a lista de todos de um username
	//ao colocar o findby e o nome do campo da tabela o JPA já reconhece a coluna
	List<Todo> findByUsername(String username);
}
