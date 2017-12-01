import java.util.*;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.next();


        System.out.println(paliBuilder(word));
    }

    private static String paliBuilder(String inputWord) {
        StringBuilder temp = new StringBuilder(inputWord).reverse();
        String output = inputWord + temp;
        return output;
    }
}
