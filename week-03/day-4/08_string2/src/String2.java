public class String2 {
  public static void main(String[] args) {
    System.out.println(removeX("Uxnxdexrstxaxnd Xxxenxa"));
    System.out.println(removeX("Xxavxier xwanxtsx pxxeacxxe"));
  }

  private static String removeX(String input) {
    if (input.length() == 0) {
      return "";
    }
    if (input.charAt(0) == 'x') {
      return removeX(input.substring(1, input.length()));
    } else {
      return input.charAt(0) + removeX(input.substring(1, input.length()));
    }
  }
}
