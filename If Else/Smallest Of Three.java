import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a<b && a<c) System.out.print(a+ " is SmallestOfThree ");
        else if(b<a && b<c)  System.out.print(b+ " is SmallestofThree ");
        else System.out.print(c+ " is SmallestOfThree ");
    }
}
