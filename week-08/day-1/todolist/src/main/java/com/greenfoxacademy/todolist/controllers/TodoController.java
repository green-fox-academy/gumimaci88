package com.greenfoxacademy.todolist.controllers;

import com.greenfoxacademy.todolist.models.ToDo;
import com.greenfoxacademy.todolist.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoRepository toDoRepository;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    List<ToDo> todosList = new ArrayList<>();
    toDoRepository.findAll().forEach(todosList::add);
    model.addAttribute("todos", todosList);
    return "todoslist";
  }
}
