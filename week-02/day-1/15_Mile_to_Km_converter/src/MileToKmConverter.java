import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the distance in km:");
        int inputKm = input.nextInt();

        double inputMile = 0.621371 * inputKm;

        System.out.println("The distance in miles is: " + inputMile);
    }
}
