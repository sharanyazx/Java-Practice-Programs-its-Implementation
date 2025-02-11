import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Start year  ");
        int start = s.nextInt();
         System.out.print("Enter End year   ");
        int end = s.nextInt();

        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap year "+year);
            }
        }
    }
}
