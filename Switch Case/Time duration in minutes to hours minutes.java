
import java.util.*;
public class Main {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the minutes");
	int min=s.nextInt();
	int hour=min/60;
	int minutes=min%60;
	
	switch (hour) {
    default:
        System.out.println(min + " minutes = " + hour + " hours and " + minutes + " minutes.");
}
	
}
}

