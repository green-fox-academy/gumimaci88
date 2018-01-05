import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    System.out.println(numbers.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())));

    Map<Integer, Long> frequencyList = numbers
            .stream()
            .collect((Collectors
            .groupingBy(n -> n, Collectors.counting())));

    System.out.println(frequencyList);
    System.out.println(frequencyOfNumbers(numbers));
  }

  public static Map<Integer, Integer> frequencyOfNumbers(ArrayList<Integer> inputList) {
    Map<Integer, Integer> outputMap = new HashMap<>();

    for (int i = 0; i < inputList.size(); i++) {
      int count = 0;
      for (int j = 0; j < inputList.size(); j++) {
        if (inputList.get(i) == inputList.get(j)) {
          count++;
        }
      }
      outputMap.put(inputList.get(i), count);
    }

    return outputMap;
  }
}
