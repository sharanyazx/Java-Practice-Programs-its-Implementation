import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int count=0;
        while(n!=0){
            count+=(n & 1);
            n>>=1;
        }
        System.out.print("Count of 1's :"+ count);
    }
}
