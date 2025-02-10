import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a>b && a>c) System.out.print(a+ " is LargestOfThree ");
        else if(b>a && b>c)  System.out.print(b+ " is LargestOfThree ");
        else System.out.print(c+ " is LargestOfThree ");
    }
}
