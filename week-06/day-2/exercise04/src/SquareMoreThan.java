import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareMoreThan {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    List<Integer> squareMoreThan20 = numbers
            .stream()
            .filter(n -> (n * n) > 20)
            .collect(Collectors.toList());

    System.out.println(squareMoreThan20);
    System.out.println(ifSquareMoreThan20(numbers));
  }

  public static List<Integer> ifSquareMoreThan20(List<Integer> inputList) {
    List<Integer> outputList = new ArrayList<>();

    for (int n : inputList) {
      if (n * n > 20) {
        outputList.add(n);
      }
    }

    return outputList;
  }
}
