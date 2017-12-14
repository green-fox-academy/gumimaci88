public class Tree extends Plant {

  public Tree() {
    waterAbsorb = 0.4;
    type = "Tree";
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean giveWater() {
    if (waterAmount < 10) {
      needsWater = true;
    } else needsWater = false;

    return needsWater;
  }
}
