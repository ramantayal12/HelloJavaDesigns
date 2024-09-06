package com.learn.java.CoreJava.MethodOverriding;

/**
 * bike class is another child class inheriting from vehicle class, and it overrides the run()
 * method to print a specific message for a bike running.
 */
class Bike extends Vehicle {

  void run() {
    System.out.println("Bike is Running");
  }
}
