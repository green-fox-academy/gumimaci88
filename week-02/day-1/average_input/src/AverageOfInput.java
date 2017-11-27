import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Please enter a number(in integer form): ");
            int input1 = input.nextInt();
            sum = sum + input1;
        }

        System.out.println("The sum of these numbers are: " + sum);

        double average = sum/5.0;
        System.out.println("The average of these numbers are: " + average);
    }
}
