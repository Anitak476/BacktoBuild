package week4;

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats meat");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void sleep() {
        System.out.println("Puppy sleeps a lot");
    }
}

public class InheritanceAdvanced {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();    // overridden method
        p.bark();
        p.sleep();
    }
}
