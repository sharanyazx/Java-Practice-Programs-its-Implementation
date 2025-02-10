import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else
            System.out.println("Not divisible by 3 and 5");
    }
}
