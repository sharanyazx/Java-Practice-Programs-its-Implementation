import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int odd =0,even = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        System.out.println("Odd digits: " + odd + " Even digits: " + even);
        
    }
}
