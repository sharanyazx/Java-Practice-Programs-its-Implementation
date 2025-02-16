import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
        
    }
}
