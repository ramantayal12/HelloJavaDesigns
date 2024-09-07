package com.learn.java.design.patterns.adapter;

/**
 * a concrete implementation of bird
 */
public class Sparrow implements Bird {

  @Override
  public void fly() {
    System.out.println("Sparrow is Flying");
  }

  @Override
  public void makeSound() {
    System.out.println(" Sparrow is making sound");
  }
}
