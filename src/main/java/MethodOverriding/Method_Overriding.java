package MethodOverriding;

/**
 * Vehicle class represents the parent class for vehicles,
 * containing a run() method that prints a generic message indicating the vehicle is running.
 *
 * this can be implemented using interface also
 */
class Vehicle {

    void run(){
        System.out.println("Vehicle is Running");
    }
}

/**
 * Car class is a child class inheriting from vehicle class,
 * and it overrides the run() method to print a specific message for a car running.
 */
class Car extends Vehicle {

    int car_number;
    void run(){
        System.out.println("Car is Running");
    }
}

/**
 * bike class is another child class inheriting from vehicle class,
 * and it overrides the run() method to print a specific message for a bike running.
 */
class Bike extends Vehicle {

    void run(){
        System.out.println("Bike is Running");
    }
}


/**
 * The Method_Overriding class is the entry point of the program.
 * It creates instances of bike, car, and vehicle classes and calls their respective run() methods.
 */
public class Method_Overriding {

    public static void main(String []args){

        Bike b1 = new Bike ();
        b1.run(); // Calling the 'run' method of the 'bike' class

        Car c1 = new Car ();
        c1.run(); // Calling the 'run' method of the 'car' class

        Vehicle vehicle = new Vehicle ();
        vehicle.run (); // Calling the 'run' method of the 'vehicle' class
    }
}


/**
 * The MethodOverLoading class demonstrates method overloading,
 * where the add() method is overloaded to perform addition with two or three integers.
 */
class MethodOverLoading {

    // Method overloading: adds two integers and returns the sum
    public static int add(int a,int b){
        return a+b;
    }

    // Method overloading: adds three integers and returns the sum
    public static int add(int a,int b,int c){
        return a+b+c;
    }

}
