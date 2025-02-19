
import java.util.*;
public class Main {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("  WELCOME TO VENDING MACHINE  ");
	 
	    		    System.out.println("1. Chips - $2");
	    	        System.out.println("2. Soda - $3");
	    	        System.out.println("3. Chocolate - $4");
	    	        System.out.println("4. Tea - $4");
	    	        System.out.println("5. Coffee - $6");
	    	        System.out.println("6. Exit");
	    	        
	    	        System.out.println("Enter your choice");
	    	        int choice=s.nextInt();
	    	        
	    	        switch(choice) {
	    	        case 1:
	    	        	System.out.println("You selected chips!  please pay $ 2");
	    	        	break;
	    	        case 2:
	    	        	System.out.println("You selected soda!  please pay $ 3");
	    	        	break;
	    	        case 3:
	    	        	System.out.println("You selected chocolate!  please pay $ 4");
	    	        	break;
	    	        case 4:
	    	        	System.out.println("You selected Tea!  please pay $ 4");
	    	        	break;
	    	        	
	    	        case 5:
	    	        	System.out.println("You selected Coffee!  please pay $ 6");
	    	        	break;
	    	        case 6:
	    	        	System.out.println("  THANK YOU ");
	    	        	break;
	    	        default:
	    	        	System.out.println("Invalid input! Please select valid choice");
	    	        }

	}

}

