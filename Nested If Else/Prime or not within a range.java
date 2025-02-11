import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println("Prime numbers in the range:");
        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
