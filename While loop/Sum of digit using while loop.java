public class Main {
    public static void main(String[] args) {
     int sum=0;
     int n=111;
      while (n!=0) {
          sum=sum+n%10;
          n/=10;
        }
        System.out.print("Sum of Digits "+ sum);
    }
}
