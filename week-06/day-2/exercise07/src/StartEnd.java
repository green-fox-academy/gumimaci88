import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartEnd {
  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI",
            "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    numbers.stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .forEach(System.out::println);

    System.out.println(checkStartEnd(numbers));
  }

  public static List<String> checkStartEnd(List<String> inputList) {
    List<String> outputList = new ArrayList<>();

    for (String city : inputList) {
      if (city.startsWith("A") && city.endsWith("I")) {
        outputList.add(city);
      }
    }

    return outputList;
  }
}
