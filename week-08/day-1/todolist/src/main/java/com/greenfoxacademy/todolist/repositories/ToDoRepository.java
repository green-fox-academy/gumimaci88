package com.greenfoxacademy.todolist.repositories;

import com.greenfoxacademy.todolist.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
