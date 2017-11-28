import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please give the 1st number: ");
        int input1 = input.nextInt();
        System.out.println("Please give the 2nd number: ");
        int input2 = input.nextInt();

        if (input1 >= input2) {
            System.out.println("The second number should be bigger.");
        } else {
            for (int a = input1; a < input2; a++) {
                System.out.println(a);
            }
        }
    }

}
