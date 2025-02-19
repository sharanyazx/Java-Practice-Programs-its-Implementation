# Print numbers from 1 to 10 using do-while loop.
````java []

public class Main{
	public static void main(String[] args) {
	    int i=1;
    	do  {
		    System.out.print(i+" ");
		    i++;
		}	while(i<=10);
	}
}
````

## Output:
````

1 2 3 4 5 6 7 8 9 10 
````

# Sum of all even numbers using do-while loop.
````java []


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int i=1;
	    System.out.println("sum of Even numbers");
	    int sum=0;
        do	{
		   if(i%2==0){
		       sum+=i;
		   }
		   i++;
		}	while(i<=n);
		System.out.println(sum);
	}
}
````
## Output:
````
Enter the value of n
10
sum of Even numbers
30


````

# Print all odd numbers in a range using do-while loop.
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int i=1;
	    System.out.println("Even numbers");
      do{
		   if(i%2!=0){
		       System.out.print(i+" ");
		   }
		   i++;
		}while(i<=n);
	}
}
````
## Output:
````
Enter the value of n
20
Even numbers
1 3 5 7 9 11 13 15 17 19

````

# Calculate the factorial of a number using do-while loop.
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int fact=1;
	    int i=1;
    	do{
		   fact=fact*i;
		   i++;
		}	while(i<=n);
		System.out.println("factorial of "+n+"is :"+fact);
	}
}
````
## Output
````
Enter the value of n
7
factorial of 7is :5040


````

# Reverse a number using do-while loop.
````java []


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int b=0;
		do{
		    int a=n%10;
		    b=b*10+a;
		    n/=10;
		}	while(n!=0);
		System.out.print("Reverse a digit "+n+" is: "+b);
	}
	}
````

# Output:
````
Enter the value of n
826419
Reverse a digit 826419  is: 914628

````

# Count the number of digits in a number using do-while loop.
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int count=0;
		do{
		    int a=n%10;
		    count++;
		    n/=10;
		}while(n!=0);
		System.out.print("count of the digit "+n+" is: "+count);
	}
	}
````
## Output
````
Enter the value of n
76281
count of the digit 76281 is: 5

````
# Check if a number is prime using do-while loop.

````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=s.nextInt();
        int flag=0;
        int i=2;
       do {
        if(n%i==0){
            flag=1;
            break;
        }
        i++;
        } while(i<=n/2);
        
        if(flag==0){
            System.out.println(n +" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
    }
````

## Output:

````
Enter the value
7
7 is prime number


````
# Find the GCD of two numbers using do-while loop.
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the two value");
		int n1=s.nextInt();
		int n2=s.nextInt();
		do{
            if(n1>n2){
                n1-=n2;
            }
            else{
                n2-=n1;
            }
        }	while(n1!=n2);
        System.out.println("Gcd of numbers "+n1);
	}
}
````
# Output:
````
Enter the two value
20
30
Gcd of numbers 10


````
# Print Fibonacci series up to n terms using do-while loop.

````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int a=0;
	    int b=1;
	    System.out.println("fibonacci of "+n+" is :");
	    System.out.print(a+" "+b+" ");
	    int i=1;
	 do	{
		  int c=a+b;
		  a=b;
		  b=c;
		
		System.out.print(c+" ");
		i++;
	}while(i<=n);
	}
}
````
## Output
````
Enter the value of n
20
fibonacci of 20 is :
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946

````
# Check if a string is a palindrome using do-while loop.
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Ënter the String");
      String str=s.next();
      String rev="";
      int i=str.length()-1;
      do{
          rev+=str.charAt(i);
          i--;
      }while(i>=0);
      
      if(rev.equals(str)){
      System.out.println("Palindrome");
      }
      else{
          System.out.println("Not Palindrome");
      }
	}
}
````
# Output
````
Enter the String
sas
Palindrome


````

## Sum all the digits of a number using do-while loop.

````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int sum=0;
		do{
		    int a=n%10;
		    sum+=a;
		    n/=10;
		}while(n!=0);
		System.out.print("sum of the digit "+n+" is: "+sum);
	}
	}
````
## Output:
````
Enter the value of n
87263
sum of the digit 87263 is: 26
````
# Reverse a string using do-while loop.
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Ënter the String");
      String str=s.next();
      String rev="";
      int i=str.length()-1;
      do{
          rev+=str.charAt(i);
          i--;
      }while(i>=0);
      
     System.out.println("Reverse of the String " + rev);
	}
}
````
## Output:
````
Enter the String
jasmin
Reverse of the String nimsaj


````

# Find the largest prime number in a given range using do-while.

````java []

import java.util.*;
public class Main {
         public static boolean isprime(int num){
             if(num<2){
                 return false;
             }
            int i=2;
        do{
        if(num%i==0){
            return false;
        }
        i++;
   } while(i<=num/2);
        return true;
 }
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  start value");
        int start=s.nextInt();
        System.out.println("Enter the end value");
        int end=s.nextInt();
        int num=end;
        int last=-1;
        do{
            if(isprime(num)){
              last=num;
              break;
            }
            num--;
        }while(start<=num);
        System.out.println("Largest prime number "+last);
    }
}
````
## Output:
````
Enter the  start value 2
Enter the end value  20
Largest prime number 19


````
## 114.Print all numbers divisible by 5 within a range using do-while.

```` java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the start value");
	int start=s.nextInt();
		System.out.println("Enter the end value");
	int end=s.nextInt();
	System.out.println(" numbers in divisible by 5 within a range");
	int i=start;
		do{
		    if(i%5==0){
		        System.out.print(i+" ");
		    }
		    i++;
		
		}while(i<=end);
		
}
}

````
## Output:
````
Enter the start value  4
Enter the end value  50
 numbers in divisible by 5 within a range
5 10 15 20 25 30 35 40 45 50 


````
# Calculate the sum of squares of numbers in a range using do-while.

````java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the start value");
	int start=s.nextInt();
		System.out.println("Enter the end value");
	int end=s.nextInt();
	int sum=0;
	System.out.println("sum of square number");
	int i=start;
		do{
		    sum+=(i*i);
		    i++;
		
		}while(i<=end);
		System.out.print(sum);
		
}
}
````
## Output:
````
Enter the start value
5
Enter the end value
2 15
sum of square number
1210

````
# Print the Fibonacci sequence up to a given limit using do-while

````java []


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=s.nextInt();
	    int a=0;
	    int b=1;
	    System.out.println("fibonacci of "+n+" is :");
	    System.out.print(a+" "+b+" ");
	    int i=1;
    do	{
		  int c=a+b;
		  a=b;
		  b=c;
		
		System.out.print(c+" ");
		i++;
	}	while(i<=n);
	}
}
````

## Output:
````
Enter the value of n
10
fibonacci of 10 is :
0 1 1 2 3 5 8 13 21 34 55 89

````
# Print a pattern of stars using do-while loop.
````java []


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		do{
		    int j=1;
		    do{
		    
		             System.out.print("* ");
		             j++;
		    }while(j<=i);
		    System.out.println();
		    i++;
		}while(i<=n);
	}
}
````
## Output:
````
5
* 
* * 
* * * 
* * * * 
* * * * * 


````
# Check if a number is a perfect number using do-while loop.
````java []

import java.util.*;
public class Main {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=s.nextInt();
        int temp=n;
        int sum=0;
        for(int i=1;i<n;i++){
            int rem=n%i;
          if(rem==0){
              sum+=i;
          }
    
        }
        if(temp==sum){
            System.out.println(n+ " is Perfect number");
        }
        else{
            System.out.println(n+" is not perfect number");
        }
    
    }
    
}
````

## OUTPUT:
````
Enter the value   28
28 is Perfect number


````

# Find the Armstrong number in a range using do-while loop.

````java []


import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the start value");
   int start=s.nextInt();
      System.out.println("Enter the end value");
   int end=s.nextInt();
   int i=start;
   do{
       int temp=i;
    int count=(int)Math.log10(i)+1;
	 int a;
	 double result=0;
	 int num=temp;
     do	{
	     a=num%10;
         result+=Math.pow(a,count);
	     num/=10;
	}while(num!=0);
	if (result== temp) {
                System.out.println(temp + " is an Armstrong number.");
            }
	i++;
	
   }while(i<=end);
   
}
}
````
# OUTPUT:
````
Enter the start value
100
Enter the end value
500
153 is an Armstrong number.
370 is an Armstrong number.
371 is an Armstrong number.
407 is an Armstrong number.


````
# Create a menu-driven program using a do-while loop.

````java []
import java.util.*;
public class Main {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     int choice;
	     do {
	     System.out.println("  WELCOME TO VENDING MACHINE  ");
	 
	    		    System.out.println("1. Chips - $2");
	    	        System.out.println("2. Soda - $3");
	    	        System.out.println("3. Chocolate - $4");
	    	        System.out.println("4. Tea - $4");
	    	        System.out.println("5. Coffee - $6");
	    	        System.out.println("6. Exit");
	    	        
	    	        System.out.println("Enter your choice");
	    	         choice=s.nextInt();
	    	        
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
	    	        	System.out.println("** THANK YOU **");
	    	        	break;
	    	        default:
	    	        	System.out.println("Invalid input! Please select valid choice");
	    	        }
	    	        
	     }  while(choice !=6);

	}

}
````

## Output
```
 WELCOME TO VENDING MACHINE  
1. Chips - $2
2. Soda - $3
3. Chocolate - $4
4. Tea - $4
5. Coffee - $6
6. Exit
Enter your choice
 1
You selected chips!  please pay $ 2
  WELCOME TO VENDING MACHINE  
1. Chips - $2
2. Soda - $3
3. Chocolate - $4
4. Tea - $4
5. Coffee - $6
6. Exit
Enter your choice
 4
You selected Tea!  please pay $ 4
  WELCOME TO VENDING MACHINE  
1. Chips - $2
2. Soda - $3
3. Chocolate - $4
4. Tea - $4
5. Coffee - $6
6. Exit
Enter your choice
6
** THANK YOU **
```

