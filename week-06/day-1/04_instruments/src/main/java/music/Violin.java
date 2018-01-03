package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
  }

  public Violin(int inputStringNumber) {
    name = "Violin";
    this.numberOfStrings = inputStringNumber;
  }

  @Override
  public void sound() {
    this.sound = "Screech";
  }
}
