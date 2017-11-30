import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give the number of entries: ");
        int num = input.nextInt();

        String[] result = new String[num];

        for (int i = 0; i < num; i++) {
        System.out.println("Please enter a word: ");
        result[i] = input.next();
    }
    printer(result);
}
    public static String printer(String[] input){
        String result = "";
        for (int i = 0; i < input.length; i++) {
            result = result + input[i] + " ";
            System.out.println(result);
        }
        return result;
    }

    /*public static String printer(String input) {
        System.out.println(input);
        return input;
    }*/
}
