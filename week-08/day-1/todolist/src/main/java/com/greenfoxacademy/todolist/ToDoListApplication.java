package com.greenfoxacademy.todolist;

import com.greenfoxacademy.todolist.models.ToDo;
import com.greenfoxacademy.todolist.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	@Bean
	public CommandLineRunner listToDos(ToDoRepository toDoRepository) {
	  return (String... args) -> {
	    toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
      toDoRepository.save(new ToDo("Get a good sleep."));
      toDoRepository.save(new ToDo("Finish exercises."));
      toDoRepository.save(new ToDo("Understand the material."));
    };
  }

}
