public class Power {
  public static void main(String[] args) {
    int b = 6;
    int p = 3;
    System.out.println(powerN(b, p));
  }

  private static int powerN(int base, int power) {
    if (power == 0) {
      return 1;
    } else {
      return powerN(base, power-1) * base;
    }
  }
}
