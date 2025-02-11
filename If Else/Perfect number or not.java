// if number's divisor are sum together that has same number is called perfect number
// n = 6
// Proper Divisors of 6 are 1, 2 and 3.
// Sum = 1+2+3 = 6 = 6
// ⇒ 6 is a perfect number
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0) sum+=i;
        }
        if (sum==num) {
            System.out.println(num + " is a perfect Number");
        } else {
            System.out.println(num + " is Not a perfect Number");
        }
    }
}


