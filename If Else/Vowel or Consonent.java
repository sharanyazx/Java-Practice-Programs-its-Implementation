import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = sc.next().trim().toLowerCase();
        sc.close();

        // Check if input is a single letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = input.charAt(0);
            
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input! Please enter a single alphabet.");
        }
    }
}
