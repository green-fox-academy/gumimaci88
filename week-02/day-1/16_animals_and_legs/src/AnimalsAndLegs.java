import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of your chickens: ");
        int inputChick = input.nextInt();

        System.out.println("Please enter the number of your pigs: ");
        int inputPig = input.nextInt();

        int totalLegs = inputChick*2 + inputPig*4;

        System.out.println("The total number of legs of your animals is: " + totalLegs);
    }
}
