public class Bunny2 {
  public static void main(String[] args) {
    int bun = 17;
    System.out.println(sumEars(bun));
  }

  private static int sumEars(int input) {
    if (input == 0) {
      return 0;
    } else
      if (input % 2 != 0) {
        return sumEars(input-1) + 2;
      } else {
        return sumEars(input-1) + 3;
      }
  }
}
