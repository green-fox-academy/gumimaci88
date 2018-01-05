import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfOdd {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    double average = numbers
            .stream()
            .filter(n -> Math.abs(n) % 2 == 1)
            .mapToDouble(n -> n)
            .average()
            .getAsDouble();

    System.out.println(average);
    System.out.println(calculateAverageOfOdds(numbers));
  }

  public static double calculateAverageOfOdds(ArrayList<Integer> inputList) {
    int sum = 0;
    int count = 0;

    for (int n : inputList) {
      if (Math.abs(n) % 2 == 1) {
        sum += n;
        count++;
      }
    }

    return (double) sum / count;
  }
}
