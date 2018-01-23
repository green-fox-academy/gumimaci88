package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Response doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Response greeter(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return new Greeter(name, title);
    } else {
      return new Error("Please provide a name!");
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Response appendA(@PathVariable("appendable") String appendable) {
    if (appendable != null) {
      return new AppendA(appendable);
    } else {
      return null;
    }
  }
}
