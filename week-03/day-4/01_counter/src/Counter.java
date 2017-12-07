public class Counter {
  public static void main(String[] args) {
    int n = 6;
    System.out.print(countdown(n));
  }

  private static int countdown(int input) {
    if (input == 0) {
      return 0;
    } else {
      System.out.print(input + " ");
      return countdown(input - 1);
    }
  }
}