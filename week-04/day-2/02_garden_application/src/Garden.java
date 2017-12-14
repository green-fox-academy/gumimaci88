import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;
  double waterPortion;

  public Garden() {
    plants = new ArrayList<>();
    waterPortion = 0;
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void whatsUp() {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).giveWater()) {
        System.out.println("The " + plants.get(i).color + " " + plants.get(i).type + " needs water.");
      } else System.out.println("The " + plants.get(i).color + " " + plants.get(i).type + " doesn't need water.");
    }
    System.out.println();
  }

  public int thirstyPlantCount() {
    int thirstyPlant = 0;

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).giveWater()) {
        thirstyPlant += 1;
      }
    }
    return thirstyPlant;
  }

  public void gimmeWater(double waterAmount) {
    waterPortion = waterAmount/thirstyPlantCount();
    System.out.println("Watering with " + waterAmount);

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needsWater) {
        plants.get(i).waterAmount += waterPortion * plants.get(i).waterAbsorb;
      }
    }
  }

}