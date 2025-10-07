package week3;

public class RecursionBasics {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of 1 to 5: " + sum(5));
        System.out.println("Fibonacci(6): " + fibonacci(6));
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
