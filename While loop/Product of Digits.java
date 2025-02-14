public class Main {
    public static void main(String[] args) {
     int pr=1;
     int n=413;
     int i=1;
      while (n>=i) {
          pr=pr*(n%10);
          n/=10;
          i++;
        }
        System.out.print("Product of Digits "+ pr);
    }
}
