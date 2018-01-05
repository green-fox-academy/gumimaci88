import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfPositives {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> squareList = numbers
            .stream()
            .filter(n -> n > 0)
            .map(n -> n * n)
            .collect(Collectors.toList());

    System.out.println(squareList);
    System.out.println(calculateSquareOfPositive(numbers));
  }

  public static List<Integer> calculateSquareOfPositive(List<Integer> inputList) {
    List<Integer> squaredPositives = new ArrayList<>();

    for (int n : inputList) {
      if (n > 0) {
        squaredPositives.add((int) Math.pow(n, 2));
      }
    }

    return squaredPositives;
  }
}
