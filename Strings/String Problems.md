# 01.String Declaration and Initialization
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="Sharanya";
		System.out.println(name);
	}
}

```
## Output
```
Sharanya
```
# 02.Check if a String is Empty
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="Sharanya";
	    String nums=" ";
	    String num="";
	    System.out.println(name.isEmpty());
		System.out.println(nums.isEmpty());
		System.out.println(num.isEmpty());
	}
}

```
## Output
```
false
false
true

```
# 03.Concatenate Two Strings
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="Sharanya";
	    String nums="Sharan";
	    System.out.println(name+nums);
		
	}
}

```
## Output
```
SharanyaSharan
```
# 04.Find the Length of a String
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="Sharanya";
	    System.out.println(name.length());
		
	}
}

```
## Output
```
8

```
# 05.Convert String to Uppercase and lowerCase 
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="sharanya";
	    System.out.println(name.toUpperCase());
	    System.out.println(name.toLowerCase());
		
	}
}

```
## Output
```
SHARANYA
sharanya
```

# .Convert a String to Character Array
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name="sharanya";
	    char []ch =name.toCharArray();
	    System.out.println(ch);
	    for (char c : ch) { 
     	System.out.print(c+" "); 
   }

		
	}
}

```
## Output
```
sharanya
s h a r a n y a 
```
# 08.Check if Two Strings are Equal
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name1="sharanya";
	    String name2="sharanya";
	    System.out.print(name1.equals(name2)); 
   

		
	}
}

```
## Output
```
true
```
# 09.Compare Two Strings Lexicographically

``` java []
public class Main
{
	public static void main(String[] args) {
	    String name1="sharanya";
	    String name2="sharanya";
	    String name3="Aashif";
	    String name4="Hari";
	    String name5="navanith";
	    String name6="Vinoth";
	    
	    System.out.println(name1.compareTo(name2)); 
	    System.out.println(name1.compareTo(name3)); 
	    System.out.println(name1.compareTo(name4)); 
	    System.out.println(name1.compareTo(name5)); 
	    System.out.println(name1.compareTo(name6)); 
   

		
	}
}

```
## Output
```
0
50
43
5
29

```
# 10.String to Integer Conversion (ParseInt)
``` java []
public class Main
{
	public static void main(String[] args) {
	    String name1="12345";
	    
	    System.out.println(Integer.parseInt(name1)); 
   

		
	}
}

```
## Output
```
12345
```

# 11.Integer to String Conversion (ValueOf)
``` java []
public class Main
{
	public static void main(String[] args) {
	     int name1=12345;
	    
	    System.out.println(String.valueOf(name1)); 
   

		
	}
}

```
## Output
```
12345
```

# 12.Substring Extraction
``` java []
public class Main
{
	public static void main(String[] args) {
	     String name1="Sharanya";
	    
	    System.out.println(name1.substring(0,5)); 
   

		
	}
}
```
## Output
```
Shara

```
# 13.Trim Whitespaces from String
``` java []
public class Main
{
	public static void main(String[] args) {
	     String name1="  Sharanya  ";
	    System.out.println(name1); 
	    System.out.println(name1.trim()); 
   

		
	}
}
```
## Output
```
  Sharanya  
Sharanya

```
# 14.String Contains Substring
``` java []
public class Main
{
	public static void main(String[] args) {
	     String name1=" hello, Sharanya  ";
	    System.out.println(name1.contains("hello")); 
	    System.out.println(name1.contains("bye")); 
   

		
	}
}
```
## Output
```
true
false

```
# 15.Check if a String Starts with a Specific Prefix
``` java []
```
## Output
```
```
# 16.Check if a String Ends with a Specific Suffix
``` java []
```
## Output
```
```
# 17.Replace a Substring in a String
``` java []
```
## Output
```
```
# 18.Find the Index of a Character in a String
``` java []
```
## Output
```
```
# 19.Find the Last Index of a Character in a String
``` java []
```
## Output
```
```
# 20.Convert a String to a Byte Array
``` java []
```
## Output
```
```
# 21.Split a String into an Array
``` java []
```
## Output
```
```
# 22.Join an Array of Strings
``` java []
```
## Output
```
```
# 23.Convert String to ArrayList
``` java []
```
## Output
```
```
# 24.Check if a String is Palindrome
``` java []
```
## Output
```
```
# 25.Find the Frequency of a Character in a String
``` java []
```
## Output
```
```
# 26.Count the Number of Words in a String
``` java []
```
## Output
```
```
# 27.Reverse a String
``` java []
```
## Output
```
```
# 28.Check if Two Strings are Anagrams
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
#
``` java []
```
## Output
```
```
