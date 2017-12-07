public class NumberAdder {
  public static void main(String[] args) {
    int n = 10;
    System.out.println(countdown(n));
  }

  private static int countdown(int input) {
    if (input == 1) {
      return 1;
    } else {
      return input + countdown(input-1);
    }
  }
}
