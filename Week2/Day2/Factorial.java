// Week2 Day2 - Factorial using Loop and Recursion
import java.util.Scanner;

public class Factorial {

    // Method 1: using loop
    static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method 2: using recursion
    static int factorialRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Factorial using loop: " + factorialLoop(num));
        System.out.println("Factorial using recursion: " + factorialRec(num));
    }
}
