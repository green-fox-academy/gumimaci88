public class Bunny1 {
  public static void main(String[] args) {
    int bun = 10;
    System.out.println(ears(bun));
  }

  private static int ears(int input) {
    if (input == 0) {
      return 0;
    } else {
      return ears(input -1) + 2;
    }
  }
}
