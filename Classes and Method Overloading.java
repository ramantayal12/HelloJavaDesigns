import java.util.*;

class Student {

    int roll_no,marks,age;
    String name;

    void get_data(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name");
        this.name = in.next();
        System.out.println("Enter your Roll No.");
        this.roll_no = in.nextInt();
        System.out.println("Enter your Age");
        this.age = in.nextInt();
        System.out.println("Enter your marks");
        this.marks = in.nextInt();
    }

    void display(){
        System.out.println("Your name is "+name);
        System.out.println("Your Roll No. is "+roll_no);
        System.out.println("Your Age is "+age);
        System.out.println("Your marks are "+marks);
    }
}


class Bike {

    int bikeNumber, phone ,days, charge;
    String name;

    void input(){
        System.out.println("Enter Bike Number ");
        Scanner sc = new Scanner(System.in);
        bikeNumber = sc.nextInt();
        System.out.println("Enter Phone Number ");
        phone = sc.nextInt();

        System.out.println("Enter Owner Name ");
        name = sc.next();
    }

    void display(){
        System.out.println("Bike Number "+ bikeNumber);
        System.out.println("Phone Number "+phone);
        System.out.println("Name "+name);
        System.out.println("No. of days "+days);
        System.out.println("Charge "+charge);
    }
}

class classes {

    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String []args ){

        //1. WAP to create a class Student with 4 attributes, at least two methods
        //input and display. Demonstrate with the help of two objects

        Student stud = new Student ();
        stud.get_data();
        stud.display();


        //2. Demonstrate Method overloading.
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));

    }
}
