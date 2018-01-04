import main.java.Reservations.Reservation;

public class ReservationApp {
  public static void main(String[] args) {
    int reservationAmount = 10;

    for (int i = 0; i < reservationAmount; i++) {
      Reservation reservation = new Reservation();
      System.out.println(String.format("Booking# %s for %s", reservation.getCodeBooking(), reservation.getDowBooking()));
    }
  }
}
