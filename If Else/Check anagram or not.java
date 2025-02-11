import java.util.*;
public class Main {
    public static void main(String[] args) { 
        String str1="eat";
        String str2="ate";
        char[] aa = str1.toLowerCase().toCharArray();
        char[] bb = str2.toLowerCase().toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
      System.out.print(Arrays.equals(aa, bb));
      if(Arrays.equals(aa,bb))  System.out.println("Anagram");
      else  System.out.println(" not Anagram");
    }

    
    }

