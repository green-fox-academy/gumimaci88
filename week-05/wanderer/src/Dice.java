public class Dice {
  int rollDice;

  Dice() {
    rollDice = (int)(Math.random() * 6) + 1;
  }

  public int getDiceNumber() {
    return rollDice;
  }
}
