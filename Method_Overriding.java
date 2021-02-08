class vehicle{

    void run(){
        System.out.println("Vehicle is Running");
    }
}

class car extends vehicle{

    int car_number;
}
class bike extends vehicle{

    void run(){
        System.out.println("Bike is Running");
    }
}

public class Method_Overriding {

    public static void main(String []args){

        bike b1 = new bike();
        b1.run();

        car c1 = new car();
        c1.run();
    }
}
