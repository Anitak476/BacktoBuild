package week4;

abstract class Shape {
    abstract void draw();

    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.displayInfo();
        s1.draw();

        s2.displayInfo();
        s2.draw();
    }
}
