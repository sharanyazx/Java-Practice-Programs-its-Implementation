
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b and c");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int res=(b*b)-(4*a*c);
		int choice=(res>0)?1:(res==0)?2:3;
		switch(choice) {
		case 1:
			double r1=(-b+ Math.sqrt(res))/(2*a);
			double r2=(-b- Math.sqrt(res))/(2*a);
			System.out.println("Two Distinct Root"+ r1 +" ,"+ r2);
			break;
	
		case 2:
			double r3=-b/(2*a);
			System.out.println(" One root "+r3);
			break;
		
		case 3:
			double r4=-b/(2*a);
			double imag=Math.sqrt(-res)/(2*a);
	
			System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + r4 + " + " + imag + "i");
            System.out.println("Root 2 = " + r4 + " - " + imag + "i");
			break;
		default:
			System.out.println(" Invalid input");
		}

	}

}





