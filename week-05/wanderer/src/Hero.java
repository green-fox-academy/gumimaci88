public class Hero extends Character{
  String fileUp;
  String fileDown;
  String fileLeft;
  String fileRight;

  Hero() {
    healthPoint = 20 + 3 * dice.getDiceNumber();
    defendPoint = 2 * dice.getDiceNumber();
    strikePoint = 5 + dice.getDiceNumber();
    tempHealthPoint = healthPoint;

  }

}
