package main.java.creditcardreservations;

public class CreditCardReservationApp {
  private static final int RESERVATIONS = 10;

  public static void main(String[] args) {
    for (int i = 0; i < RESERVATIONS; i++) {
      CreditCardReservation CCReservation = new CreditCardReservation("DEF" + i);
      System.out.println(CCReservation.toString());
    }
  }
}
