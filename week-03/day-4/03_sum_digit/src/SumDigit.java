public class SumDigit {
  public static void main(String[] args) {
    int n = 126;
    System.out.println(sum(n));
  }

  private static int sum(int input) {
    if ( input == 0) {
      return 0;
    } else {
      return sum(input/10) + input%10;
    }
  }
}
