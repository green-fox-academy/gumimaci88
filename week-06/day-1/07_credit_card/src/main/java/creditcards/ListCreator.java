package main.java.creditcards;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {
  List<CreditCard> list = new ArrayList<>();

  public ListCreator(int cardAmount) {
    for (int i = 0; i < cardAmount; i++) {
      list.add(new CreditCard("ABC" + i));
    }
  }
}
