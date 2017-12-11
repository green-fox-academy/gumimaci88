public class rollDice {
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();

    for (int i = 0; i < myDice.dices.length; i++) {
      System.out.print(myDice.dices[i]);
    }

    System.out.println("\n");
    rollUntil6(myDice);
  }

  private static Dice rollUntil6(Dice input) {
    for (int i = 0; i < input.dices.length; i++) {
      while (input.dices[i] != 6) {
        input.reroll(i);
      }
    }

    for (int i = 0; i < input.dices.length; i++) {
      System.out.print(input.dices[i]);
    }

    return input;
    }

}