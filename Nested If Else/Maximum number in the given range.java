import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range of number ");
        int n = s.nextInt();
        System.out.print("Enter the number ");
        int max = s.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Enter the number ");
            int num = s.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is "+max);
    }
}
