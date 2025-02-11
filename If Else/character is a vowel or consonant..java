import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("enter value");
		char ch=sc.next().charAt(0);
		//int b= sc.nextInt();
		//System.out.print("enter value");
	  
		
		if((ch >= 'a' && ch <='z') || (ch >= 'a' && ch<='z' ))
		{
		    if((ch =='a'|| ch=='e'|| ch =='i'|| ch=='o' || ch =='u')||( ch=='A'||ch =='E'|| ch=='I'||ch =='O'|| ch=='U'))
		    {
		        System.out.print("vowel and alph");
		    }
		    else {
		        System.out.print(" alph");
		    }
		}
		    else{ 
		        System.out.print("not alph");
		    }
		    
		}
}
