import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int d=s.nextInt();
        System.out.print("left Rotate "+leftRotate(str,d) );
    }
    public static String leftRotate(String str,int d){
        int len=str.length();
        d%=len;
        return str.substring(d)+str.substring(0,d);
    }
}


/*import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int d=s.nextInt();
         int len=str.length();
        d%=len;
        System.out.print("left Rotate "+str.substring(d)+str.substring(0,d));
    }
}
  */
