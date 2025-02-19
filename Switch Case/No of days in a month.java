
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Month");
	    String monthname=s.nextLine();

		switch(monthname){
		    case "January":
		        System.out.println("31");
		        break;
		     case "February":
		    	  System.out.println("28 or 29");
		        break;        
		    case "March":
		    	  System.out.println("31");
		        break;
		    case "April":
		    	  System.out.println("30");
		        break;
		      case "May":
		            System.out.println("31");
		         break;
		      case "June":
		            System.out.println("30");
		         break;
		      case "July":
		            System.out.println("31");
		         break;
		      case "August":
		            System.out.println("31");
		         break;
		      case "September":
		            System.out.println("30");
		         break;
		      case "October":
		            System.out.println("31");
		         break;
		      case "November":
		            System.out.println("30");
		         break;
		      case "December":
		            System.out.println("31");
		         break;
		         
		     default:
		     System.out.println("Invalid Option");   
		}
	}
}
