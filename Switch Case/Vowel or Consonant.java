
import java.util.*;
public class Main {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character");
	char ch=s.next().toLowerCase().charAt(0);
	
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch+" is vowel");
	break;
	default:
		if(Character.isLetter(ch)) {
			System.out.println(ch+" is consonant");
		}
		else {
			System.out.println("Invalid input");
		}
	 
}
   
}
}
