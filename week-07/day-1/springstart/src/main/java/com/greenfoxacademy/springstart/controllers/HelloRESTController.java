package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", required = false) String name) {
    if (name == null) {
      name = "World";
    }
    Greeting hello = new Greeting(counter.incrementAndGet(), "Hello, " + name);
    return hello;
  }
}
