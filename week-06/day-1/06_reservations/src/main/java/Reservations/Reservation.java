package main.java.Reservations;

import java.util.Random;

public class Reservation implements Reservations {
  private static final String allCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

  String reservationCode;
  String day;

  public Reservation() {
    reservationCode = getCodeBooking();
    day = getDowBooking();
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
}
