package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong counter = new AtomicLong(0);

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag," +
          "Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste",
          "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao",
          "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
          "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};
  String[] colors = {"red", "blue", "yellow", "green", "purple", "orange", "black", "lime", "pink", "brown", "cyan",
          "AliceBlue", "Aqua", "CadetBlue", "Chartreuse", "Chocolate", "Coral", "CornflowerBlue", "Crimson", "DarkBlue",
          "DarkCyan", "DarkGreen", "DeepSkyBlue", "FireBrick", "ForestGreen", "Gold", "Indigo", "LawnGreen", "Maroon",
          "MidnightBlue", "Navy", "Olive", "Peru", "RebeccaPurple", "RoyalBlue", "Teal", "Tomato", "SteelBlue"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("hello", hellos[(int)(Math.random() * hellos.length)]);
    model.addAttribute("color", colors[(int)(Math.random() * colors.length)]);
    model.addAttribute("size", (int)(Math.random() * 50)+ 10);
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    return "greeting";
  }
}
