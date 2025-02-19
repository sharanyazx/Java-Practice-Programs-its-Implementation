
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		System.out.println(" Traffic Light System");
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. GREEN");
		System.out.println("4. EXIT");
		System.out.println("Enter you choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println(" RED : STOP");
		 break;
		case 2:
			System.out.println(" YELLOW: WAIT");
		 break;
		case 3:
			System.out.println(" GREEN : GO");
		 break;
		 
		case 4:
			System.out.println(" EXIT");
		 break;
		 default:
				System.out.println(" Invalid choice");	 
		 
		}
	}
}




