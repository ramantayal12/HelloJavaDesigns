package CoreJava.MethodOverriding;

/**
 * Car class is a child class inheriting from vehicle class,
 * and it overrides the run() method to print a specific message for a car running.
 */
class Car extends Vehicle {
    void run() {
        System.out.println ("Car is Running");
    }
}
