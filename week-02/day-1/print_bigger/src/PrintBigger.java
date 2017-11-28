import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 1st number: ");
        int input1 = input.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int input2 = input.nextInt();

        if (input1<input2) {
            System.out.println(input2 + " is the bigger.");
        }
        else if (input1>input2){
            System.out.println(input1 + " is the bigger.");
        }
        else {
            System.out.println("The numbers are equal.");
        }

    }

}
