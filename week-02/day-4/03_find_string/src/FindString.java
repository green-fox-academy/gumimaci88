import java.util.*;

public class FindString {
    public static void main(String[] args) {
        //String input = "this is what I'm searching in";
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first string: ");
        String string1 = input.nextLine();
        System.out.println("Please enter the second string: ");
        String string2 = input.nextLine();

        System.out.println("The index where second string is in first string: ");
        System.out.println(findpart(string1, string2));
    }

    private static int findpart(String firstString, String secondString) {
        int index = 0;
        for(int i= 0; i < firstString.length() - secondString.length() + 1; i++) {
            if(firstString.substring(i, i + secondString.length()).equals(secondString)) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
