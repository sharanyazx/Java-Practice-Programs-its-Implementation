# LCM

```java []
public class Main{
public static void main(String[] args){
	        int a=2;
	        int b=3;
	        int lcm;
	        if(a>b){
	                lcm=a;
	        }
	        else{
	                lcm=b;
	        }
	        while(true){
	                if(lcm%a==0 && lcm%b==0){
	                        System.out.print(lcm);
	                        break;
	                }
	                lcm++;
	        }
	}
}

```
##  Triperfect


```java []
public class Main{
public static void main(String[] args){
	        int n=120;
	        int sum=0;
		for(int i=1;i<=n;i++){
		        if(n%i==0){
		                sum+=i;
		                }
		                }if(sum==3*n){
		        System.out.print("perfect");
		}
		else{
		        System.out.print("not perfe");
		}
	}
}

```
## betrothed
```
public class Main{
public static void main(String[] args){
	        int a=48;
	        int b=75;
	        int n1=0,n2=0;
	       for(int i=1;i<a;i++){
	               if(a%i==0){
	                        n1+=i;
	               }
	       }
	         for(int j=1;j<a;j++){
	               if(b%j==0){
	                        n2+=j;
	       }
	         }
	       if((n1-1)==b && (n2-1)==a){
	               System.out.print("betrothed number");
	       }
	       else{
	       System.out.print("not b");
	       }
	}
}


```
## Ambical number
``` java []
public class Main{
public static void main(String[] args){
	        int a=220;
	        int b=284;
	        int n1=0,n2=0;
	       for(int i=1;i<a;i++){
	               if(a%i==0){
	                        n1+=i;
	               }
	       }
	         for(int j=1;j<a;j++){
	               if(b%j==0){
	                        n2+=j;
	       }
	         }
	       if(n1==b && n2==a){
	               System.out.print("Ambical number");
	       }
	       else{
	       System.out.print("not  ambical");
	       }
	}
}
```
