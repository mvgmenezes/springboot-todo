package com.mmenezes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int idCounter = 0;
	
	
	static {
		todos.add(new Todo(++idCounter, "mmenezes", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "mmenezes", "Learn about MigroServices", new Date(), true));
		todos.add(new Todo(++idCounter, "mmenezes", "Learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll(){
		
		return this.todos;
		
	}
	
	public Todo save(Todo todo) {
		//se chegou -1 é para incluir o todo na lista
		if (todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {//realiza a alteracao 
			
			//fazendo a alteracao fake
			deleteById(todo.getId());
			todos.add(todo);
			
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if (todo == null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(long id) {
		
		for(Todo todo:todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
