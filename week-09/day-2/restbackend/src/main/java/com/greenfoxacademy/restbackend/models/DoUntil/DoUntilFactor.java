package com.greenfoxacademy.restbackend.models.DoUntil;

import com.greenfoxacademy.restbackend.models.Response;

public class DoUntilFactor extends Response{
  private int result;

  public DoUntilFactor(int until) {
    this.result = calculateFactor(until);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int calculateFactor(int input) {
    if (input == 1) {
      return 1;
    }

    return input * calculateFactor(input - 1);
  }

}
