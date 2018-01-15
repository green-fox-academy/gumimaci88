package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
  String name;
  double balance;
  String currency;
  String animalType;
  boolean king;
  String alignment;

  public BankAccount() {
  }

  public BankAccount(String name, float balance, String currency, String animalType, boolean king, String alignment) {
    this.name = name;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;
    this.king = king;
    this.alignment = alignment;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getCurrency() {
    return currency;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return king;
  }

  public String getAlignment() {
    return alignment;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

}
