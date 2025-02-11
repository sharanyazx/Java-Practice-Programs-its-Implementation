import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = sc.nextInt();
        int sr=(int)Math.sqrt(num);
        if(sr*sr==num) System.out.println("Perfect Square");
        else System.out.println("Not perfect");
    }
}
