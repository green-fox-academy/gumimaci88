import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FrequencyString {
  public static void main(String[] args) {
    String shakespeareLine = "What's in a name? That which we call a rose, By any other name would smell as sweet.";
    Stream<String> quote = Stream.of(shakespeareLine);

    Map<String, Long> characterFrequency = quote
            .map(c -> c.split(""))
            .flatMap(Arrays::stream)
            .collect(groupingBy(identity(), counting()));

    System.out.println(characterFrequency);
    System.out.println(frequencyOfCharacters(shakespeareLine));
  }

  public static Map<Character, Integer> frequencyOfCharacters(String inputString) {
    Map<Character, Integer> outputFrequency = new HashMap<>();

    for (int i = 0; i < inputString.length(); i++) {
      int count = 0;
      for (int j = 0; j < inputString.length(); j++) {
        if (inputString.charAt(i) == inputString.charAt(j)) {
          count++;
        }
      }
      outputFrequency.put(inputString.charAt(i), count);
    }

    return outputFrequency;
  }
}
