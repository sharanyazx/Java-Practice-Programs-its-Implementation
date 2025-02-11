import java.util.*;

public class Main {

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n); // Find square root of n
        return s * s == n; // Check if squaring back gives the original number
    }

    // Method to check if a number is a Fibonacci number
    public static boolean isFibonacci(int n) {
        // A number is Fibonacci if at least one of these expressions is a perfect square
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input

        // Check if the number is Fibonacci and print the result
        if (isFibonacci(num)) {
            System.out.println(num + " is a Fibonacci Number");
        } else {
            System.out.println(num + " is Not a Fibonacci Number");
        }
    }
}


