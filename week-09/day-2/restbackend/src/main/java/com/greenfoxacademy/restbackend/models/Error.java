package com.greenfoxacademy.restbackend.models;

public class Error extends Response {
  private String error;

  public Error() {

  }

  public Error(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
