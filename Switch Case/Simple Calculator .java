import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get number as input
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        
        // select operation
        System.out.print("Enter an operation ( +, -, *, / ): ");
        //input operation in Character
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + result);
    }
}
