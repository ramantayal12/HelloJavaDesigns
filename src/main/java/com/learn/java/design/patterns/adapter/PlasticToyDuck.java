package com.learn.java.design.patterns.adapter;

public class PlasticToyDuck implements ToyDuck {


  @Override
  public void squeak() {
    System.out.println("Squeak Squeak");
  }
}
