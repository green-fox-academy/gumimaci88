package creditcards;

public class CreditCardApp {
  public static void main(String[] args) {
    ListCreator listOfCards = new ListCreator(10);

    for (CreditCard card : listOfCards.list) {
      System.out.println(card);
    }
  }
}
