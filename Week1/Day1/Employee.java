// Week1 Day1 - Employee Class Practice

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if(salary > 0) this.salary = salary;
    }

    // Print details
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Anita", 50000);
        Employee emp2 = new Employee(102, "Durga", 60000);

        emp1.printDetails();
        emp2.printDetails();

        // Update salary
        emp1.setSalary(55000);
        System.out.println("After salary update:");
        emp1.printDetails();
    }
}
