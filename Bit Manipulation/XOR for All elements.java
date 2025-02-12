import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n []= {1,2,3,4,5};
		int xor=0;
		for(int i:n){
		    xor ^=i;
		}
		System.out.print("Xor for given Array "+xor);
	}
}
