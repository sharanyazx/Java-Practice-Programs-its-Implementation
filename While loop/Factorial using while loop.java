public class Main {
    public static void main(String[] args) {
      int i=1;
      int fact=1;
      int num=10;
      System.out.print("Factoial are ");
      System.out.println();
      while (i<=num) {
          fact=fact*i;
          System.out.println(i+"-->"+fact+" ");
          i++; 
        }
    }
}
/*Factoial are 
1-->1 
2-->2 
3-->6 
4-->24 
5-->120 
6-->720 
7-->5040 
8-->40320 
9-->362880 
10-->3628800 
*/
