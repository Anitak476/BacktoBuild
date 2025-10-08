package week4;

class Student {
    static String schoolName = "ABC High School";
    final int rollNo;
    String name;

    static {
        System.out.println("Static block executed once when class loads.");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void changeSchool(String newName) {
        schoolName = newName;
    }

    void display() {
        System.out.println("Roll: " + rollNo + ", Name: " + name + ", School: " + schoolName);
    }
}

public class StaticFinalDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anita");
        Student s2 = new Student(102, "Durga");

        s1.display();
        s2.display();

        Student.changeSchool("XYZ Global School");
        System.out.println("\nAfter changing school:");
        s1.display();
        s2.display();
    }
}
