package com.greenfoxacademy.todolist.controllers;

import com.greenfoxacademy.todolist.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todoslist";
  }
}
