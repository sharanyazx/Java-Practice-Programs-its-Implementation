public class Main {
    public static void main(String[] args) {
      int count =10;
      int num1=0;
      int num2=1;
      System.out.print("Fibonacci Series of "+count+" numbers:");

      int i=1;
      while (count>=i) {
          System.out.print(num1+" ");
          int temp=num1+num2;
          num1=num2;
          num2=temp;
          i++;
        }
        
    }
}
