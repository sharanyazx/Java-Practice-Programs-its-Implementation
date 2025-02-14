public class Main {
    public static void main(String[] args) {
      int n=386;
      int rev=0;
      int rem;
      int num=n;
      while (num!=0) {
          rem=num%10;
          rev=(rev*10)+rem;
          num/=10;
          
        }
        System.out.print(rev);
    }
}
