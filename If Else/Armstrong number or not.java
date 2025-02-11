import java.util.*;
public class Main
{
public static void main(String[] args) {
int n=9474;
int originalnumber=n;
        int rem;
        int temp=n;
        int t=n;
        int count=0;
       
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println("Count of Digit  "+count);
        int strong=0;
        while(t>0){
           
            rem=t%10;
            strong+=Math.pow(rem,count);
            t/=10;
        }
        if(strong==originalnumber){
            System.out.println("Yes it is armstrong number");
        }
        else{
            System.out.println("No it is armstrong number");
        }
       
}}
