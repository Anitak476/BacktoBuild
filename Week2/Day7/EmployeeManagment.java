// Week2 Day7 - Employee Management System (OOP Project)

class Employee {
    private int empId;
    private String empName;
    private double salary;

    // Constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getters and Setters
    int getEmpId() { return empId; }
    String getEmpName() { return empName; }
    double getSalary() { return salary; }

    void setSalary(double salary) { this.salary = salary; }

    // Display Employee details
    void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: " + salary);
    }
}

// Manager class (Inheritance)
class Manager extends Employee {
    private double bonus;

    Manager(int empId, String empName, double salary, double bonus) {
        super(empId, empName, salary);
        this.bonus = bonus;
    }

    double getTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus + ", Total Salary: " + getTotalSalary());
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Anita", 50000);
        Manager m1 = new Manager(201, "Durga", 70000, 15000);

        System.out.println("Employee Details:");
        e1.displayDetails();

        System.out.println("\nManager Details:");
        m1.displayDetails();
    }
}
