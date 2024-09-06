package com.learn.java.CoreJava.MethodOverriding;

/**
 * The MethodOverLoading class demonstrates method overloading, where the add() method is overloaded
 * to perform addition with two or three integers.
 */
class MethodOverLoading {

  // Method overloading: adds two integers and returns the sum
  public static int add(int a, int b) {
    return a + b;
  }

  // Method overloading: adds three integers and returns the sum
  public static int add(int a, int b, int c) {
    return a + b + c;
  }

}
