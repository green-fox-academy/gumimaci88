package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {

  List<BankAccount> listOfAccounts = new ArrayList<>();

  @RequestMapping(value = "/show")
  public String showFirstAccount(Model model) {
    BankAccount firstAccount = new BankAccount("Simba", 2000, "zebra", "lion", true, "Good One");
    model.addAttribute("name", firstAccount.getName());
    model.addAttribute("balance", firstAccount.getBalance());
    model.addAttribute("currency", firstAccount.getCurrency());
    model.addAttribute("animalType", firstAccount.getAnimalType());
    model.addAttribute("king", firstAccount.isKing());
    model.addAttribute("alignment", firstAccount.getAlignment());
    return "show_simba";
  }

  @RequestMapping(value = "/text")
  public String testHTMLception(Model model) {
    String textToShow = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", textToShow);
    return "htmlception";
  }

  @GetMapping(value = "/multipleaccounts")
  public String showMultipleAccounts(Model model) {
    listOfAccounts.add(new BankAccount("Simba", 5000, "zebra", "lion", true, "Good One"));
    listOfAccounts.add(new BankAccount("Mufasa", 10000, "gnu", "lion", false, "Good One"));
    listOfAccounts.add(new BankAccount("Scar", 7000, "hyena", "lion", false, "Bad Guy"));
    listOfAccounts.add(new BankAccount("Timon", 3333, "bug", "meerkat", false, "Good One"));
    listOfAccounts.add(new BankAccount("Pumbaa", 4444, "bug", "warthog", false, "Good One"));
    listOfAccounts.add(new BankAccount("Nala", 2000, "antelope", "lion", false, "Good One"));
    listOfAccounts.add(new BankAccount("Rafiki", 2, "kingfisher", "mandrill", false, "Good One"));

    model.addAttribute("accountlist", listOfAccounts);

    return "multiple_accounts";
  }

  @RequestMapping(value = "/accounts/raisebalance", method = RequestMethod.POST)
  public String raiseBalance(@ModelAttribute BankAccount bankAccount, Model model) {
    for (BankAccount account : listOfAccounts) {
      if (account.isKing()) {
        account.setBalance(account.getBalance() + 100);
      } else {
        account.setBalance(account.getBalance() + 10);
      }
    }
    model.addAttribute("accountlist", listOfAccounts);
    return "multiple_accounts";
  }

}
