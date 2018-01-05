import static java.lang.Character.isUpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseFinder {
  public static void main(String[] args) {
    String quote = "What's in a name? That which we call a rose, By any other name would smell as sweet.";
    List<Character> upChars = quote
            .chars()
            .mapToObj(c -> (char) c)
            .filter(p -> isUpperCase(p))
            .collect(Collectors.toList());

    System.out.println(upChars);
    System.out.println(filterUppercase(quote));
  }

  public static List<Character> filterUppercase(String inputString) {
    List<Character> output = new ArrayList<>();

    for (char c : inputString.toCharArray()) {
      if (isUpperCase(c)) {
        output.add(c);
      }
    }

    return output;
  }
}
