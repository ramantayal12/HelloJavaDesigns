package com.learn.java.design.patterns.adapter;

public class BirdAdapter implements ToyDuck {

  private Bird bird;

  @Override
  public void squeak() {
    System.out.println("Squeak Squeak");
  }

  public BirdAdapter(Bird bird) {
    this.bird = bird;
  }
}
