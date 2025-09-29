// Week1 Day3 - Simple Calculator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        sc.close();

        double result;

        if(op == '+') result = num1 + num2;
        else if(op == '-') result = num1 - num2;
        else if(op == '*') result = num1 * num2;
        else if(op == '/') result = num1 / num2;
        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
