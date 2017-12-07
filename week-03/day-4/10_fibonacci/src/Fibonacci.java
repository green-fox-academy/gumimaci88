import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Which element of the Fibonacci sequence would you like to know?");
    int n = input.nextInt();
    System.out.println("The " + n + " element of the Fibonacci sequence is: " + fibo(n));
  }

  private static int fibo(int input) {
    if (input == 0){
      return 0;
    }
    if (input == 1) {
      return 1;
    } else {
      return fibo(input-1) + fibo(input-2);
    }
  }
}
