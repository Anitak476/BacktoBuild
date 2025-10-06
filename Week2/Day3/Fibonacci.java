// Week2 Day3 - Fibonacci Series using loop
import java.util.Scanner;

public class Fibonacci {

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int count = sc.nextInt();
        sc.close();

        if (count < 2) {
            System.out.println("Please enter a number greater than 1");
        } else {
            printFibonacci(count);
        }
    }
}
