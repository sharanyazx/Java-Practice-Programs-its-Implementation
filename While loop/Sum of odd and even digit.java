import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        num = Math.abs(num);
        
        int sumOdd = 0;
        int sumEven = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;  
        }
        
        System.out.println("Sum of odd digits: " + sumOdd);
        System.out.println("Sum of even digits: " + sumEven);
        
        
    }
}
