import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please give a number: ");
        int inputNumber = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + inputNumber + " = " + inputNumber*i);
        }
    }
}
