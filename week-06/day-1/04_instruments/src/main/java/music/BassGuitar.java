package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
  }

  public BassGuitar(int inputStringNumber) {
    name = "Bass Guitar";
    this.numberOfStrings = inputStringNumber;
  }

  @Override
  public void sound() {
    this.sound = "Duum-duum-duum";
  }
}
