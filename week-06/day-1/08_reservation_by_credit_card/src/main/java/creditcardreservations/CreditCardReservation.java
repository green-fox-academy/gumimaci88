package main.java.creditcardreservations;

import creditcards.*;
import reservations.main.java.Reservations.*;

import java.util.Random;

public class CreditCardReservation implements Reservationy, CreditCardy{
  private static final String allCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  String reservationCode;
  String day;
  String codeAccount;
  String cardholderName;

  CreditCardReservation(String name) {
    this.cardholderName = name;
    reservationCode = getCodeBooking();
    day = getDowBooking();
    codeAccount = createCodeAccount();
  }

  String getReservationCode() {
    return this.reservationCode;
  }

  String getDay() {
    return this.day;
  }

  @Override
  public String getDowBooking() {
    int index = new Random().nextInt(7);
    return DOW[index];
  }

  @Override
  public String getCodeBooking() {
    String output = "";

    for (int i = 0; i < 8; i++) {
      int index = new Random().nextInt(allCharacters.length());
      output += allCharacters.charAt(index);
    }

    return output;
  }

  @Override
  public String getNameCardholder() {
    return cardholderName;
  }

  @Override
  public String getCodeAccount() {
    return this.codeAccount;
  }

  public String createCodeAccount() {
    String CC = "";
    Random r = new Random();

    for (int i = 0; i < 16; i++) {
      CC += Integer.toString(r.nextInt(9));
    }

    return CC;
  }

  @Override
  public int getSumCVV() {
    return computeSumCVV(codeAccount);
  }

  @Override
  public int computeSumCVV(String codeAccount) {
    int output = 0;

    for (int i = 0; i < codeAccount.length(); i++) {
      output += Character.getNumericValue(codeAccount.charAt(i));
    }

    return output;
  }

  public String toString() {
    return String.format("Booking# %s for %s paid by NAME=%s CC#=%s CVV=%d", getCodeBooking(), getDowBooking(),
            cardholderName, getCodeAccount(), getSumCVV());
  }
}
