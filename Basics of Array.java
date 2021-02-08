import java.util.*;

public class Assign14_01_21 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        // 1. WAP to display sum and average of first 100 numbers i.e. from 1 to 100 which are divisible by 7

        double sum = 0, count = 0;
        for(int i=1;i<=100;i++){
            if( i%7 == 0 ){
                count += 1;
                sum += i;
            }
        }
        double average = sum/count;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);


        // 2. WAP to input a number from user & print its Factorial

        System.out.println("Please Enter Number to calculate its factorial ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }

        System.out.println("Factorial of Entered Number is "+fact);


        //3.WAP to input a number and its power from user & display the result

        System.out.println("Please Enter a Number for Power calculation ");
        int n2 = sc.nextInt();
        System.out.println("Please Power to calculate ");
        int power = sc.nextInt();

        int pow = 1;
        for(int i=0;i<power;i++){
            pow *= n2;
        }

        System.out.println("Number after Calculation is "+pow);


        //4. WAP to print sum of squares of numbers starting from 1 till n.

        int sum_of_squares = 0;
        System.out.println("Enter Number up to which you want to calculate sum od squares ");
        int n4 = sc.nextInt();
        for(int i=1;i<=n4;i++){
            sum_of_squares += (i*i);
        }
        System.out.println("Sum of Squares up to n is "+sum_of_squares);

        //5. WAP to input & display your First Name, age, stream, marks
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        System.out.println("Enter your stream");
        String stream = sc.next();
        System.out.println("Enter Your Marks ");
        int marks = sc.nextInt();

        System.out.println("Your name is "+name+"\n your age is "+age+" \n your Stream is "+stream+" \n Your Marks are "+marks);


        //6. WAP to declare, initialize & display an integer array, character array, float array & double array

        int []int_array = new int[5];
        for(int i=0;i<5;i++){
            int_array[i] = i;
        }

        char []char_array = new char[5];
        for(int i=0;i<5;i++){
            char_array[i] = (char)(i+48);
        }

        System.out.println("Displaying Integer Array ");
        for(int i=0;i<5;i++){
            System.out.println(int_array[i]);
        }

        System.out.println("Displaying Character Array ");
        for(int i=0;i<5;i++){
            System.out.println(char_array[i]);
        }


        /*
        7. WAP to input 10 numbers from the user and
        a. display its Sum
        b. display average
        c. number & sum of even numbers
        d. number & sum of odd numbers
         */


        System.out.println("Enter 10 Numbers ");
        int []arr = new int[10];
        double arr_sum = 0, arr_avg;
        int count_even = 0, count_odd = 0;
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0 ){
                count_even += 1;
            }
            else{
                count_odd += 1;
            }
            arr_sum += arr[i];
        }
        arr_avg = arr_sum/10;
        System.out.println("Array sum is "+arr_sum+" \n Array Average is "+arr_avg+"\n Number of Even Elements are "+count_even+"\nNumber of odd Element are"+count_odd);



    }
}
