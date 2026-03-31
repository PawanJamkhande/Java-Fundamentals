package OOPS.Polymorphism;

//Compile-time Polymorphism ( Method Overloading )
class Calculator {
    // Calculate area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculate area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double rectangleArea = calc.calculateArea(5.0, 3.0);
        double circleArea = calc.calculateArea(4.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }

}
