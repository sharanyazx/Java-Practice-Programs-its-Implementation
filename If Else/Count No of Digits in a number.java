import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = sc.nextInt();
        int count =0;
        while(num!=0){
            num/=10;
            ++count;
        }
            System.out.print("No of Digits "+count);
    }
}

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits: " + String.valueOf(num).length());
    }
}
