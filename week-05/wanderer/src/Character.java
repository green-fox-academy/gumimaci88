import java.awt.*;

public class Character {
  int healthPoint, tempHealthPoint, defendPoint, strikePoint;
  int level = 1;
  Dice dice = new Dice();
  int coorX, coorY;
  int strikeValue;

  Image image;
  String fileName;

  public Character() {

  }

  public void move() {

  }

  public void levelUp() {
    level += 1;
  }

  public int getLevel() {
    return level;
  }

  public int getCoorX() {
    return coorX;
  }

  public int getCoorY() {
    return coorY;
  }

  public boolean isDead() {
    return tempHealthPoint <= 0;
  }

  public int calculateSV() {
    return strikeValue = this.strikePoint + 2 * dice.getDiceNumber();
  }

  public boolean attackSucceed(Character defender) {
    if (this.calculateSV() > defender.defendPoint) {
      return true;
    } else {
      this.tempHealthPoint -= defender.calculateSV() - this.defendPoint;
      return false;
    }
  }

}
