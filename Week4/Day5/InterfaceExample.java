package week4;

interface Vehicle {
    void start();
    void stop();
}

interface Electric {
    void charge();
}

class Car implements Vehicle, Electric {
    public void start() {
        System.out.println("Car starts with a key.");
    }

    public void stop() {
        System.out.println("Car stops when brakes applied.");
    }

    public void charge() {
        System.out.println("Car is charging...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.charge();
        c.stop();
    }
}
