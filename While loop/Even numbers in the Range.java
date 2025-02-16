import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Start range ");
        int  start=s.nextInt();
        System.out.print("Enter end range ");
        int end=s.nextInt();
        while (start<=end) {
          if(start%2==0) System.out.println(start);
          start++; 
        }
    }
}
