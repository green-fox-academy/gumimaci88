public class Plant {
  String type;
  String color;
  double waterAmount;
  double waterAbsorb;
  boolean needsWater = true;

  public Plant() {
    waterAmount = 0;
  }

  public boolean giveWater() {
    return needsWater;
  }
}