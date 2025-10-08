package week4;

class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Anita", 27);
        Person p3 = new Person(p2);

        System.out.println("Default:");
        p1.display();
        System.out.println("Parameterized:");
        p2.display();
        System.out.println("Copy:");
        p3.display();
    }
}
