//if sq of 5-->25 (5 match with 25 last digit )   
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num; // Compute square of the number
        int temp = num; // Store the original number
        boolean isAutomorphic = true;

        // Check if the last digits of square match the original number
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        // Using if-else to print the result
        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is Not an Automorphic Number");
        }
        
        
    }
}
