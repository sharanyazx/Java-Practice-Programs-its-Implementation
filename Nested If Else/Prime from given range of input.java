import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start range ");
        int start = s.nextInt();
        System.out.print("Enter end range ");
        int end = s.nextInt();

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num+ " ");
            }
        }
    }
}
