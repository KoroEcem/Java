package com.ecemkoro.donguler;

public class ObjectOriented {

  String model;
  int year;

  public ObjectOriented(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public void displayInfo() {
    System.out.println(model + " " + year);
  }
}
