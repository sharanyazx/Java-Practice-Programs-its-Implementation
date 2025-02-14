public class Main {
    public static void main(String[] args) {
     int count=0;
     int num=455;
      while (num!=0) {
         num/=10;
         count++;
        }
        System.out.print("Count of Digits "+ count);
    }
}
