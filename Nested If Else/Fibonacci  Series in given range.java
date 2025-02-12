import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Start range ");
        int start = s.nextInt();
        System.out.print("End Range ");
        int end = s.nextInt();
        int a = 0, b = 1, c = 0;
        
        System.out.print("Fibonacci series from Start range to end range are ");
        while (c <= end) {
            if (c >= start) {
                System.out.print(c+ " ");
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
