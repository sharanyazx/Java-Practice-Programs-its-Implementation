import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Temperature Conversion Menu");
	    
         System.out.println("1. Celsius to Fahrenheit ");
         System.out.println("2. Fahrenheit to Celsius ");
         System.out.println("3.  Exit");
         System.out.println("Enter your choice");
         int  choice=s.nextInt();
		switch(choice){
		    case 1:
		    	System.out.print("Enter temperature in Celsius: ");
                double celsius = s.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
                break;
		     case 2:
		    	 System.out.print("Enter temperature in Fahrenheit: ");
	                double fi = s.nextDouble();
	                double co = (fi- 32) * 5/9;
	                System.out.println("Temperature in Celsius: " + co + "°C");
		        break;        
		    case 3:
		    	  System.out.println("Exit");
		        break;
		     	        
		     default:
		     System.out.println("Invalid Option");   
		}
	}
}

