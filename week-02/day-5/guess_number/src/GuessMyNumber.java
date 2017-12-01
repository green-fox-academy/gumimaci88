import java.util.*;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int life = 5;
        int number = (int) (Math.random() * 10);
        System.out.println(number);
        System.out.println("I've the number between 1-100. You have 5 lives.");

        for(int i = 0; i < 5; i++ ) {
            System.out.println("Enter your number: ");
            int guess = input.nextInt();
            if(guess == number && life > 0){
                System.out.println("Congratulations! You win!");
                break;
            } else if(guess < number && life> 0){
                life = life - 1;
                if(life == 0) {
                    System.out.println("Sorry! You are a loser!");
                    break;
                }
                System.out.println("Too low. You have " + life + " lives left.");
            } else if(guess > number && life> 0) {
                life = life - 1;
                if(life == 0) {
                    System.out.println("Sorry! You are a loser!");
                    break;
                }
                System.out.println("Too high. You have " + life + " lives left.");
            }
        }
    }
}