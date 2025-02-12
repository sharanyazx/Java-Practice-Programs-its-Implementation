import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = s.nextInt();
        int a[] = new int[n];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int unique = 0;
        for (int i : a) {
            unique ^= i;  // Correct XOR operation
        }

        System.out.println("Unique Element: " + unique);
        
        s.close(); // Close scanner to prevent resource leak
    }
}
