package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.models.DoUntil.DoUntil;
import com.greenfoxacademy.restbackend.models.DoUntil.DoUntilFactor;
import com.greenfoxacademy.restbackend.models.DoUntil.DoUntilSum;
import com.greenfoxacademy.restbackend.models.Error;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{what}")
  public Response doUntil(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) DoUntil doUntil) {
    Integer input = doUntil.getUntil();
    if (doUntil == null) {
      return new Error("Please provide a number!");
    } else {
      switch (what) {
        case "sum":
          return new DoUntilSum(input);
        case "factor":
          return new DoUntilFactor(input);
        default:
          return new Error("Please provide a number!");
      }
    }
  }
}
