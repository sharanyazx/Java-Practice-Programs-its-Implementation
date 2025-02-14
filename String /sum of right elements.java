import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("elements");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        System.out.print("Enter the index :");
        int index=s.nextInt();
        for(int i=index;i<a.length;i++){
            sum+=a[i];
        }
        System.out.print("Sum of right elements "+ sum);
    }
}
   
