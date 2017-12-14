public class Flower extends Plant {

  public Flower() {
    waterAbsorb = 0.75;
    type = "Flower";
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean giveWater() {
    if (waterAmount < 5) {
      needsWater = true;
    } else needsWater = false;

    return needsWater;
  }

}
