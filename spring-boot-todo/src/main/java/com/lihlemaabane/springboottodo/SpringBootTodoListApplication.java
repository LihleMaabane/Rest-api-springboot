package com.lihlemaabane.springboottodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lihlemaabane.springboottodo.Module.Todo;
import com.lihlemaabane.springboottodo.Module.User;
import com.lihlemaabane.springboottodo.Repository.TodoRepository;
import com.lihlemaabane.springboottodo.Repository.UserRepository;

import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class SpringBootTodoListApplication implements CommandLineRunner {
	
	@Autowired
    private UserRepository userRepository;
    @SuppressWarnings("unused")
	@Autowired
    private TodoRepository todoRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootTodoListApplication.class, args);
	}
	
	 @Override
	    public void run(String... args) throws Exception {

	        User user = new User();
	        user.setPassword("Should be hashed");
	        user.setUsername("Lihle");

	        Todo todo  = new Todo();
	        todo.setContent("Do some work");

	        user.getTodoList().add(todo);

	        userRepository.save(user);
	    }

}
