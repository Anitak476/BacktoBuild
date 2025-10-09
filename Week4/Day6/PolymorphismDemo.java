package week4;

class Calculator {
    // Compile-time polymorphism
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Bank {
    // Runtime polymorphism
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getRateOfInterest() {
        return 7.0;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add (int): " + c.add(5, 10));
        System.out.println("Add (double): " + c.add(4.2, 6.8));

        Bank b;
        b = new SBI();
        System.out.println("SBI ROI: " + b.getRateOfInterest());

        b = new HDFC();
        System.out.println("HDFC ROI: " + b.getRateOfInterest());
    }
}
