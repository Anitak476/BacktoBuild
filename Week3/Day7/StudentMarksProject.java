package week3;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int[] marks;
    double avg;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateAverage();
    }

    void calculateAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        avg = (double) sum / marks.length;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Avg: " + avg);
    }
}

public class StudentMarksProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no and name: ");
            int roll = sc.nextInt();
            String name = sc.next();

            int[] marks = new int[3];
            System.out.println("Enter 3 subject marks:");
            for (int j = 0; j < 3; j++) marks[j] = sc.nextInt();

            students[i] = new Student(roll, name, marks);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students)
            s.display();

        sc.close();
    }
}
