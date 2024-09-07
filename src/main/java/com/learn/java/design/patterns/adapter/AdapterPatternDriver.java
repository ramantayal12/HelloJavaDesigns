package com.learn.java.design.patterns.adapter;

public class AdapterPatternDriver {

  public static void main(String[] args) {

    Bird bird = new Sparrow();
    bird.makeSound();

    ToyDuck toyBird = new BirdAdapter(bird);
    toyBird.squeak();
  }
}
