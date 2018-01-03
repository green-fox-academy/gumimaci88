package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int inputStringNumber) {
    name = "Electric Guitar";
    this.numberOfStrings = inputStringNumber;
  }

  @Override
  public void sound() {
    this.sound = "Twang";
  }
}
