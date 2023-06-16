package MethodOverriding;

// Parent class representing a vehicle
// this can be implemented using interface also
class vehicle{

    void run(){
        System.out.println("Vehicle is Running");
    }
}

// Child class representing a car
class car extends vehicle{

    int car_number;
    void run(){
        System.out.println("Car is Running");
    }
}

// Child class representing a bike
class bike extends vehicle{

    void run(){
        System.out.println("Bike is Running");
    }
}

public class Method_Overriding {

    public static void main(String []args){

        bike b1 = new bike();
        b1.run(); // Calling the 'run' method of the 'bike' class

        car c1 = new car();
        c1.run(); // Calling the 'run' method of the 'car' class

        vehicle vehicle = new vehicle();
        vehicle.run (); // Calling the 'run' method of the 'vehicle' class
    }
}
