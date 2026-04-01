package OOPS.Polymorphism;

public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output : "Drawing a square"
    }
}   