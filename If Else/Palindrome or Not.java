import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev="";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            rev+=ch;
            }
            System.out.println("Reversed ="+rev);
            if(str.equals(rev)) System.out.println("Palindrom");
            else System.out.println("Not Palindrom");
    }
}
