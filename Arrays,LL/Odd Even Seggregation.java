import java.util.*;

public class Main {
    public static void segregateDigits(int num) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) even.add(digit);
            else odd.add(digit);
            num /= 10;
        }
        
        System.out.println("Odd digits: " + odd);
        System.out.println("Even digits: " + even);
    }

    public static void main(String[] args) {
        int num = 123456;
        segregateDigits(num);
    }
}
