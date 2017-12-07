public class String3 {
  public static void main(String[] args) {
    System.out.println(insertStar("What's in a name? That which we call a rose. By any other name would smell as sweet."));
  }

  private static String insertStar(String input) {
    if (input.length() == 0) {
      return "";
    }
    if (input.charAt(0) == ' ') {
      return input.charAt(0) + insertStar(input.substring(1, input.length()));
    } else {
      return input.charAt(0) + "*" + insertStar(input.substring(1, input.length()));
    }
  }
}
