package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  String whatDoesTheFoxSay;
  String breedType;

  public String getName() {
    return this.name;
  }

  public String breed() {
    return this.breedType;
  }

  public String getWhatDoesTheFoxSay() {
    return this.whatDoesTheFoxSay;
  }

}
