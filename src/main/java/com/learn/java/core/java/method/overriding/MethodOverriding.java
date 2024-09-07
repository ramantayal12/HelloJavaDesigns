package com.learn.java.core.java.method.overriding;


/**
 * The Method_Overriding class is the entry point of the program. It creates instances of bike, car,
 * and vehicle classes and calls their respective run() methods.
 */
public class MethodOverriding {

  public static void main(String[] args) {

    Bike b1 = new Bike();
    b1.run(); // Calling the 'run' method of the 'bike' class

    Car c1 = new Car();
    c1.run(); // Calling the 'run' method of the 'car' class

    Vehicle vehicle = new Vehicle();
    vehicle.run(); // Calling the 'run' method of the 'vehicle' class

    Scooty scooty = new Scooty();
    scooty.run(); // Calling the 'run' method of the 'vehicle' class, bcoz run method isnt overridden in scooty class
  }
}


