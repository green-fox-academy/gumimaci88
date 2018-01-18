package com.greenfoxacademy.todolist;

import com.greenfoxacademy.todolist.models.ToDo;
import com.greenfoxacademy.todolist.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	@Autowired
	ToDoRepository toDoRepository;

	@Override
	public void run(String... strings) throws Exception{
	    toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
      toDoRepository.save(new ToDo("Get a good sleep."));
      toDoRepository.save(new ToDo("Finish exercises."));
      toDoRepository.save(new ToDo("Understand the material."));
    }

}
