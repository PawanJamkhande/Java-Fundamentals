package Training;

import java.util.Scanner;
public class Calculator {
    
    public static int sum(int a, int b){
        // int r is local variable bcz it is initialized inside a function 
        int r = a+b;
        return r;
    }
    public static float div(float a , float b){
        float r = a / b;
        return r;
    }
    public static int sub(int a, int b){
        int r = a-b;
        return r;

    }
    public static int mod(int a, int b){
        int r = a%b;
        return r;
    }
    //if we use static we needn't to make object of the class so we are not using static for multiplication so we called it using object
    int mul(int a , int b){
        int r = a*b;
        return r;

    }

    public static void main(String[] args){
        // if we initialized a variable in main. method it will be a global variable for all the functions
        Calculator cal = new Calculator();
        System.out.println("Addition: "+sum(10,20));
        System.out.println("Division: "+div(12,7));
        System.out.println("Modulus: "+mod(52,5));
        System.out.println("Subtraction: "+sub(125,50));
        System.out.println("Multiplication: "+cal.mul(20,10));

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("even");
        }else
            System.out.println("odd");

    }
}

