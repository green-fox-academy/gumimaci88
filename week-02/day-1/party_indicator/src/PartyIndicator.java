import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please tell me how many gals are at the party: ");
        int gals = input.nextInt();
        System.out.println("Please tell me how many guys are at the party: ");
        int boys = input.nextInt();

        int sum = gals + boys;

        if (gals == 0)
        {
            System.out.println("Sausage party");
        }
        else if (gals == boys && sum > 20)
        {
            System.out.println("The party is excellent!");
        }
        else if (gals != boys && sum > 20)
        {
            System.out.println("Quite cool party!");
        }
        else if (sum < 20)
        {
            System.out.println("Average party...");
        }

    }
}
