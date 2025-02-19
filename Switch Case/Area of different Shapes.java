
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("List of the shape");
	    
         System.out.println("1. Rectangle ");
         System.out.println("2. Square ");
         System.out.println("3. Cube ");
         System.out.println("4.  Circular");
         System.out.println("5.  Exit");
         int  choice=s.nextInt();
    
		switch(choice){
		    case 1:
		        System.out.println("Enter the length of rectangle");
		        int l=s.nextInt();
		        System.out.println("Enter the Breadth of rectangle");
		        int b=s.nextInt();
		        System.out.println("Area of Rectangle: "+(l*b));
		        break;
		     case 2:
		    	  System.out.println("Enter the value of a");
		    	  int a=s.nextInt();
		    	  System.out.println("Area of Square: "+(a*a));
		        break;        
		    case 3:
		    	 System.out.println("Enter the value of a");
		    	  int a1=s.nextInt();
		    	  System.out.println("Area of Square: "+(a1*a1*a1));
		        break;
		    case 4:
		    	  System.out.println("Enter the value of r");
		    	  int r=s.nextInt();
		    	  double res=Math.PI*r*r;
		    	  System.out.println("Area of Circular: "+ res);
		        break;
		    case 5:
		    	  System.out.println("Exit");
		        break;
		     	        
		     default:
		     System.out.println("Invalid ");   
		}
	}
}

