import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int parameter = input.nextInt();

        try {
            int result = 10 / parameter;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
