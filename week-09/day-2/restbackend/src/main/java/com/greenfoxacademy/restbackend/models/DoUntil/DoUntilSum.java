package com.greenfoxacademy.restbackend.models.DoUntil;

import com.greenfoxacademy.restbackend.models.Response;

public class DoUntilSum extends Response {
  private int result;

  public DoUntilSum(int until) {
    this.result = until * (until + 1) / 2;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
