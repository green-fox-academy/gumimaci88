public class String1 {
  public static void main(String[] args) {
    System.out.println(switchxy("YXxxyyXxYYxXxY"));
  }

  private static String switchxy(String input) {
    if (input.length() == 0) {
      return "";
    }
    if (input.charAt(0) == 'x'){
      return "y" + switchxy(input.substring(1, input.length()));
    } else {
        return input.charAt(0) + switchxy(input.substring(1, input.length()));
      }
  }
}
