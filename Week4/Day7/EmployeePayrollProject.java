package week4;

abstract class Employee {
    int empId;
    String name;
    double baseSalary;

    Employee(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return baseSalary + (hoursWorked * hourlyRate);
    }
}

public class EmployeePayrollProject {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(101, "Anita", 30000, 5000);
        PartTimeEmployee p1 = new PartTimeEmployee(102, "Durga", 10000, 20, 500);

        f1.displayDetails();
        System.out.println("Total Salary: " + f1.calculateSalary());

        p1.displayDetails();
        System.out.println("Total Salary: " + p1.calculateSalary());
    }
}
