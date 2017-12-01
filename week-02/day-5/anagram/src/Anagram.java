import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type in the first word: ");
        String firstWord = input.next();
        System.out.println("Please type in the second word: ");
        String secondWord = input.next();

        //anagram(firstWord, secondWord);

        if (!anagram(firstWord, secondWord)) {
            System.out.println("The two words are not anagram.");
        } else {
            System.out.println("The two words are anagram.");
        }
    }

    private static boolean anagram(String firstInput, String secondInput) {
        if (firstInput.length() != secondInput.length()) {
            return false;
        }

        firstInput = firstInput.toLowerCase();
        secondInput = secondInput.toLowerCase();

        char[] temp1 = firstInput.toCharArray();
        char[] temp2 = secondInput.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        String output1 = new String(temp1);
        String output2 = new String(temp2);

        return output1.equals(output2);
    }
}