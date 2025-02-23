# 181.Create a calculator that supports multiple operations (addition, subtraction, etc.).
````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the two value");
	    int a=s.nextInt();
	    int b=s.nextInt();
		System.out.println("Enter the symbol");
		char c=s.next().charAt(0);
		switch(c){
		    case '+':
		        System.out.println("Addition: "+ (a+b));
		        break;
		     case '-':
		         System.out.println("Subtraction:"+ (a-b)); 
		        break;
		        
		    case '*':
		         System.out.println("Multiplication: "+(a*b)); 
		        break;
		    case '/':
		         System.out.println("Division: "+(a/b)); 
		        break;
		    case '%':
		         System.out.println(" module: "+(a%b)); 
		        break;
		     default:
		     System.out.println("Invalid Symbol");   
		}
	}
}

````

## OUTPUT:
````
Enter the two value
37
77
Enter the symbol
*
Multiplication: 2849

````
# 182.Implement a Fibonacci series generator using memoization.
````java []
import java.util.*;
public class Main {
public static int fib(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	
	return fib(n-1)+fib(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		System.out.println("Fibnacci of number " +n);
	    for(int i=0;i<n;i++) {
	    	int result=fib(i);
	    	System.out.print(result+" ");
	    }

	}

}

````
## OUTPUT:
````
Enter the value of n
10
Fibnacci of number 10
0 1 1 2 3 5 8 13 21 34 

````
# 183.Create a random password generator.
````java []

public class Main {
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int length = 8; 
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }
}
````
## OUTPUT:
````
Generated Password: &2DHSD0c

````
# 184.Create a simple command-line chat application.
````java []


class ChatApp {
    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Command-Line Chat Application");
        System.out.println("Type 'exit' to end the chat.");
        
        String message;
        do {
            System.out.print("You: ");
            message = scanner.nextLine();
            
            if (!message.equalsIgnoreCase("exit")) {
                System.out.println("Bot: " + generateResponse(message));
            }
        } while (!message.equalsIgnoreCase("exit"));
        
        System.out.println("Chat ended.");
        scanner.close();
    }
    
    private String generateResponse(String input) {
        if (input.toLowerCase().contains("hello")) {
            return "Hello! How can I assist you?";
        } else if (input.toLowerCase().contains("how are you")) {
            return "I'm just a bot, but I'm here to chat with you!";
        } else {
            return "That's interesting! Tell me more.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ChatApp chatApps = new ChatApp();
        chatApps.startChat();
    }
}
````
## OUTPUT:
````
Simple Command-Line Chat Application
Type 'exit' to end the chat.
You: hello
Bot: Hello! How can I assist you?
You: yes
Bot: That's interesting! Tell me more.
You: exit
Chat ended.


````
# 185.Implement a quiz program that uses arrays.
````java []
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the default value of an int variable in Java?",
            "Which keyword is used to define a constant variable in Java?",
            "Which of the following is not a valid access modifier in Java?",
            "What is the size of a char variable in Java?",
            "Which of these is used to handle exceptions in Java?"
        };

        String[][] options = {
            {"A. 0", "B. null", "C. undefined", "D. garbage value"},
            {"A. final", "B. constant", "C. static", "D. const"},
            {"A. public", "B. private", "C. protected", "D. internal"},
            {"A. 2 byte", "B. 1 bytes", "C. 4 bytes", "D. 8 bytes"},
            {"A. try-catch", "B. error-handler", "C. catch-block", "D. throws"}
        };

        char[] answers = {'A', 'A', 'D', 'B', 'A'}; 
        int score = 0;

    
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Over! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}

````
## OUTPUT:
````
Question 1: What is the default value of an int variable in Java?
A. 0
B. null
C. undefined
D. garbage value
Your answer: A
Correct!

Question 2: Which keyword is used to define a constant variable in Java?
A. final
B. constant
C. static
D. const
Your answer: B
Wrong! The correct answer is A

Question 3: Which of the following is not a valid access modifier in Java?
A. public
B. private
C. protected
D. internal
Your answer: D
Correct!

Question 4: What is the size of a char variable in Java?
A. 2 byte
B. 1 bytes
C. 4 bytes
D. 8 bytes
Your answer: B
Correct!

Question 5: Which of these is used to handle exceptions in Java?
A. try-catch
B. error-handler
C. catch-block
D. throws
Your answer: A
Correct!

Quiz Over! Your final score is: 4/5


````
# 186.Create a program to count words in a sentence.
````java []
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str=s.nextLine();
		System.out.println("User input=  " + str);
		if(str.length()==0) {
			System.out.println("Count of the words= 0");
			
		}
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(" Count of the words in the sentence= "+count);

	}

}
````

## OUTPUT:
````
Enter the sentence 
i will get placed in a good company
User input=  i will get placed in a good company
Count of the words in the sentence= 8

````
# 187.Implement string compression (e.g., "aaabbb" -> "a3b3").

````java []
import java.util.*;

class Application{
	public String compression(String str) {
		StringBuilder compress=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;			
			}
			else {
				compress.append(str.charAt(i)).append(count);
				count=1;
			}
		}
		return compress.length() < str.length() ? compress.toString() : str;			
	}	
}
public class Main {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	Application a=new Application();
	String com=a.compression(str);
	System.out.println("Compression String: "+com);
	}
}
````
## OUTPUT:
````
Enter the String
aaaabbbcccc
Compression String: a4b3c4

````
# 188.Create a program to generate the first N prime numbers.
````java []

import java.util.*;
public class Main {
         public static boolean isprime(int num){
             if(num<2){
                 return false;
             }
            int i=2;
        while(i<=num/2){
        if(num%i==0){
            return false;
        }
        i++;
   } 
        return true;
 }
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=s.nextInt();
        int num=2;
        while(num<=n){
            if(isprime(num)){
                System.out.print(num+" ");
            }
            num++;
        }
    }
}
        
        
        
````
## OUTPUT:
````
Enter the value
20
2 3 5 7 11 13 17 19 


````
# 189.Create an interactive program to show user details.

````java []
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter your phone number");
		long number=s.nextLong();
		s.nextLine();
		System.out.println("Enter you city");
		String city=s.nextLine();
		System.out.println("Enter you state");
		String state=s.nextLine();
		System.out.println("Enter you country");
		String country=s.nextLine();
		System.out.println("Enter you email");
		String email=s.nextLine();
		
		System.out.println(" ****USER DETAIL**** ");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Number: "+ number);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Country: "+ country);
		System.out.println("Email: "+ email);
	}

}
````

## OUTPUT:
````
Enter your name
Nanthini
Enter your age
20
Enter your phone number
9935365
Enter you city
Madurai
Enter you state
Tamilnadu
Enter you country
India
Enter you email
nan2@gmail.com
 ****USER DETAIL**** 
Name: Nanthini
Age: 20
Number: 9935365
City: Madurai
State: Tamilnadu
Country: India
Email: nan2@gmail.com


````
# 190 .Build a basic database system with file operations.

````java []
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
	String filename="example.txt";
		String con="hello Every One";
		
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(filename))){
			writer.write(con);
			System.out.println("File written Successfully");
		}
		catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

	}

}

````
## Output:
````
File written Successfully
Reading from file:
hello Every One


````
# 191.Implement a voting system using classes and loops.
````java []
import java.util.*;
class VotingSystem{
	String[] candidates= {"Candidate A","Candidate B","Candidate C"};
	int[] voting=new int[candidates.length];
	 public void votingCandidate(int choice) {
		 if(choice>=1 && choice<=candidates.length) {
			 voting[choice-1]++;
			 System.out.println("Successfully Voted by "+candidates[choice-1]);
		 }
		 else {
			 System.out.println("Not voted");
		 }
	 }
	 public void display() {
		 for(int i=0;i<candidates.length;i++) {
			 System.out.println(candidates[i]+": "+ voting[i]+" voted");
		 }
	 }
}
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	 VotingSystem v=new VotingSystem();
	 int choice;
	 do {
	 System.out.println("  VOTING SYSTEM  ");
	 System.out.println(" 1.Candidate 1");
	 System.out.println(" 2.Candidate 2");
	 System.out.println(" 3.Candidate 3");
	 System.out.println(" 4.Display");
	 System.out.println(" 5.Exit");
	 
	 System.out.println("Enter your choice");
	 choice=s.nextInt();

	 if (choice >= 1 && choice <= 3) {
         v.votingCandidate(choice);
     } else if (choice == 4) {
         v.display();
     } else if (choice != 5) {
         System.out.println("Invalid choice. Please try again.");
     }
    } while (choice != 5);
	 System.out.println("Thank you for participating in the vote.");

	}

}
````
## OUTPUT:
````
 VOTING SYSTEM  
 1.Candidate 1
 2.Candidate 2
 3.Candidate 3
 4.Display
 5.Exit
Enter your choice
1
Successfully Voted by Candidate A
  VOTING SYSTEM  
 1.Candidate 1
 2.Candidate 2
 3.Candidate 3
 4.Display
 5.Exit
Enter your choice
4
Candidate A: 1 voted
Candidate B: 0 voted
Candidate C: 0 voted
  VOTING SYSTEM  
 1.Candidate 1
 2.Candidate 2
 3.Candidate 3
 4.Display
 5.Exit
Enter your choice
3
Successfully Voted by Candidate C
  VOTING SYSTEM  
 1.Candidate 1
 2.Candidate 2
 3.Candidate 3
 4.Display
 5.Exit
Enter your choice
5
Thank you for participating in the vote.



````
# 192.Create a program to convert numbers to words.
````java []
import java.util.*;

public class Main {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (0-9999): ");
        int n = s.nextInt();
        System.out.println("In Words: " + convert(n));
        s.close();
    }

    public static String convert(int n) {
        if (n == 0) {
            return "Zero";
        }
        if (n < 10) {
            return units[n];
        }
        if (n < 20) {
            return teens[n - 10];
        }
        if (n < 100) {
            return tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : "");
        }
        if (n < 1000) {
            return units[n / 100] + " Hundred" + (n % 100 != 0 ? " " + convert(n % 100) : "");
        }
        return units[n / 1000] + " Thousand" + (n % 1000 != 0 ? " " + convert(n % 1000) : "");
    }
}
````
## OUTPUT:
````
Enter a number (0-9999): 
51
In Words: Fifty One


````
# 193 .Build a simple bank account system with balance checking.

````java []
import java.util.*;
 class BankAccount{
	  String AccountHolderName;
	  String AccountNumber;
	  double balance;
	  
	  BankAccount(String AccountHolderName,String AccountNumber,double balance){
		  this.AccountHolderName=AccountHolderName;
		  this.AccountNumber=AccountNumber;
		  this.balance=balance;
	  }
	  
	  public void deposit(double amount) {
		  if(amount>0) {
			  balance+=amount;
			  System.out.println("Deposit $ "+amount);
		  }
		  else {
			  System.out.println("invalid amount");
		  }
	  }
	  
	  public void withdraw(double amount) {
		  if(amount>0 && amount<=balance) {
			  balance-=amount;
			  System.out.println("Withdraw $ "+ balance);
		  }
		  else {
			  System.out.println("Invalid amount or insufficient balance");
		  }
	  }
	  
	  public void checkbalance() {
		  System.out.println("Balance Amount $ : " + balance);
	  }
	  public void detail() {
		  System.out.println("Account Holder Name: " + AccountHolderName);
		  System.out.println("Account Number: " + AccountNumber);
		  System.out.println("Balance Amount $ : " + balance);
	  }
 }
public class Main {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Account Holder Name");
	 String AccountHolderName=s.nextLine();
	 System.out.println("Enter the Account Number");
	 String AccountNumber=s.nextLine();
	 System.out.println("Enter the Initial Balance");
	 double  balance=s.nextDouble();
	 BankAccount b=new BankAccount(AccountHolderName,AccountNumber,balance);
     while(true) {
    	 System.out.println("\nChoose an operation:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Account Details");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         int choice = s.nextInt();
         
         switch(choice) {
         case 1:
        	 System.out.println("Enter the deposit amount");
        	 double amount=s.nextDouble();
        	 b.deposit(amount);
        	 break;
         
         case 2:
        	 System.out.println("Enter the withdraw amount");
        	 double withdrawamount=s.nextDouble();
        	 b.deposit(withdrawamount);
        	 break;
         
         case 3:
        	 b.checkbalance();
        	 break;
        
         case 4:
        	 b.detail();
        	 break;
        	 
         case 5:
        	 System.out.println("Thank you");
        	 return;
        default:
        	System.out.println("invalid choice, please Enter valid choice");
        
     }
	}
	}

}

````
## OUTPUT:
````
Enter the Account Holder Name
Nanthini
Enter the Account Number
957623
Enter the Initial Balance
2000

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 1
Enter the deposit amount
1000
Deposit $ 1000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 3
Balance Amount $ : 3000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 5
Thank you

````
# 194.Create a dynamic menu-driven program using loops.
````java []
import java.util.*;
 class BankAccount{
	  String AccountHolderName;
	  String AccountNumber;
	  double balance;
	  
	  BankAccount(String AccountHolderName,String AccountNumber,double balance){
		  this.AccountHolderName=AccountHolderName;
		  this.AccountNumber=AccountNumber;
		  this.balance=balance;
	  }
	  
	  public void deposit(double amount) {
		  if(amount>0) {
			  balance+=amount;
			  System.out.println("Deposit $ "+amount);
		  }
		  else {
			  System.out.println("invalid amount");
		  }
	  }
	  
	  public void withdraw(double amount) {
		  if(amount>0 && amount<=balance) {
			  balance-=amount;
			  System.out.println("Withdraw $ "+ balance);
		  }
		  else {
			  System.out.println("Invalid amount or insufficient balance");
		  }
	  }
	  
	  public void checkbalance() {
		  System.out.println("Balance Amount $ : " + balance);
	  }
	  public void detail() {
		  System.out.println("Account Holder Name: " + AccountHolderName);
		  System.out.println("Account Number: " + AccountNumber);
		  System.out.println("Balance Amount $ : " + balance);
	  }
 }
public class Main {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Account Holder Name");
	 String AccountHolderName=s.nextLine();
	 System.out.println("Enter the Account Number");
	 String AccountNumber=s.nextLine();
	 System.out.println("Enter the Initial Balance");
	 double  balance=s.nextDouble();
	 BankAccount b=new BankAccount(AccountHolderName,AccountNumber,balance);
     while(true) {
    	 System.out.println("\nChoose an operation:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Account Details");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         int choice = s.nextInt();
         
         switch(choice) {
         case 1:
        	 System.out.println("Enter the deposit amount");
        	 double amount=s.nextDouble();
        	 b.deposit(amount);
        	 break;
         
         case 2:
        	 System.out.println("Enter the withdraw amount");
        	 double withdrawamount=s.nextDouble();
        	 b.deposit(withdrawamount);
        	 break;
         
         case 3:
        	 b.checkbalance();
        	 break;
        
         case 4:
        	 b.detail();
        	 break;
        	 
         case 5:
        	 System.out.println("Thank you");
        	 return;
        default:
        	System.out.println("invalid choice, please Enter valid choice");
        
     }
	}
	}

}
````

## OUTPUT:
````
Enter the Account Holder Name
Nanthini
Enter the Account Number
957623
Enter the Initial Balance
2000

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 1
Enter the deposit amount
1000
Deposit $ 1000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 3
Balance Amount $ : 3000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 5
Thank you

````
# 195.Implement a Tic-Tac-Toe game with a simple AI.
````java []
import java.util.Scanner;

public class Main22 {
    private static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean won = false;
        int moves = 0;

        while (!won && moves < 9) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0 1 2): ");
            int row = s.nextInt();
            int col = s.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                moves++;
                won = checkWin();
                if (!won) {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        printBoard();
        if (won) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
     
    }

    private static void printBoard() {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) return true;
        return false;
    }
}


OUTPUT:


  0 1 2
0       
1       
2       
Player X, enter your move (row and column: 0 1 2): 
1
2

  0 1 2
0       
1     X 
2       
Player O, enter your move (row and column: 0 1 2): 
0
0

  0 1 2
0 O     
1     X 
2       
Player X, enter your move (row and column: 0 1 2): 
0
2

  0 1 2
0 O   X 
1     X 
2       
Player O, enter your move (row and column: 0 1 2): 
1
1

  0 1 2
0 O   X 
1   O X 
2       
Player X, enter your move (row and column: 0 1 2): 
1
0

  0 1 2
0 O   X 
1 X O X 
2       
Player O, enter your move (row and column: 0 1 2): 
2
2

  0 1 2
0 O   X 
1 X O X 
2     O 
Player O wins!

````
## 196. Build a currency converter program.

````java[]

package Nanthu;
import java.util.*;
public class Main13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double inrToUsd = 0.012;
        double inrToEur = 0.011;
        double inrToGbp = 0.009;
		System.out.println(" CURRENCY CONVERTOR");
		System.out.println("Enter the indian Money");
		double amt=s.nextDouble();
		double convertedAmount = 0;
        String currency = "";
        System.out.println("Choose currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                convertedAmount = amt * inrToUsd;
                currency = "USD";
                break;
            case 2:
                convertedAmount = amt * inrToEur;
                currency = "EUR";
                break;
            case 3:
                convertedAmount = amt * inrToGbp;
                currency = "GBP";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, currency);

	}

}

OUTPUT:

CURRENCY CONVERTOR
Enter the indian Money
50
Choose currency to convert to:
1. USD
2. EUR
3. GBP
Enter your choice: 1
Converted amount: 0.60 USD


````
## 197.Create a program to count the frequency of words in a sentence.
````java[]

package Nanthu;
import java.util.*;
public class Main11 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String sen=s.nextLine().toLowerCase();
	String[] words=sen.split("\\s+");
	boolean[] count=new boolean[words.length];
	System.out.println("Words Frequency");
	for(int i=0;i<words.length;i++) {
		words[i]=words[i].replaceAll("[^a-zA-Z]", "");
		if(!count[i] && !words[i].isEmpty()) {
			int count1=1;
			for(int j=i+1;j<words.length;j++) {
				words[j]=words[j].replaceAll("[^a-zA-Z]", "");
			if(words[i].equals(words[j])) {
				count1++;
				count[j]=true;
			}
		}
			System.out.println(words[i] +": "+count1);
	}
	}

	}

}

OUTPUT:

Enter the sentence
java is object oriented programming language, java is platform independance
Words Frequency
java: 2
is: 2
object: 1
oriented: 1
programming: 1
language: 1
platform: 1
independance: 1

````
## 198.Write a program to find the longest word in a string.
````java[]
package Nanthu;
import java.util.*;
public class Main12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen=s.nextLine();
		String[] words=sen.split("\\s+");
		String longest=" ";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println("longest word in the Sentence:  " +longest);

	}

}

OUTPUT:

Enter the sentence
I am Nanthini, I want to become a DataScientist.
longest word in the Sentence:  DataScientist.

````
## 199.Create a simple ATM simulation with deposit/withdraw functions.
````java[]



package Nanthu;
import java.util.*;
 class BankAccount{
	  String AccountHolderName;
	  String AccountNumber;
	  double balance;
	  
	  BankAccount(String AccountHolderName,String AccountNumber,double balance){
		  this.AccountHolderName=AccountHolderName;
		  this.AccountNumber=AccountNumber;
		  this.balance=balance;
	  }
	  
	  public void deposit(double amount) {
		  if(amount>0) {
			  balance+=amount;
			  System.out.println("Deposit $ "+amount);
		  }
		  else {
			  System.out.println("invalid amount");
		  }
	  }
	  
	  public void withdraw(double amount) {
		  if(amount>0 && amount<=balance) {
			  balance-=amount;
			  System.out.println("Withdraw $ "+ balance);
		  }
		  else {
			  System.out.println("Invalid amount or insufficient balance");
		  }
	  }
	  
	  public void checkbalance() {
		  System.out.println("Balance Amount $ : " + balance);
	  }
	  public void detail() {
		  System.out.println("Account Holder Name: " + AccountHolderName);
		  System.out.println("Account Number: " + AccountNumber);
		  System.out.println("Balance Amount $ : " + balance);
	  }
 }
public class Main {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Account Holder Name");
	 String AccountHolderName=s.nextLine();
	 System.out.println("Enter the Account Number");
	 String AccountNumber=s.nextLine();
	 System.out.println("Enter the Initial Balance");
	 double  balance=s.nextDouble();
	 BankAccount b=new BankAccount(AccountHolderName,AccountNumber,balance);
     while(true) {
    	 System.out.println("\nChoose an operation:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Account Details");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         int choice = s.nextInt();
         
         switch(choice) {
         case 1:
        	 System.out.println("Enter the deposit amount");
        	 double amount=s.nextDouble();
        	 b.deposit(amount);
        	 break;
         
         case 2:
        	 System.out.println("Enter the withdraw amount");
        	 double withdrawamount=s.nextDouble();
        	 b.deposit(withdrawamount);
        	 break;
         
         case 3:
        	 b.checkbalance();
        	 break;
        
         case 4:
        	 b.detail();
        	 break;
        	 
         case 5:
        	 System.out.println("Thank you");
        	 return;
        default:
        	System.out.println("invalid choice, please Enter valid choice");
        
     }
	}
	}

}
OUTPUT:

Enter the Account Holder Name
Nanthini
Enter the Account Number
957623
Enter the Initial Balance
2000

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 1
Enter the deposit amount
1000
Deposit $ 1000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 3
Balance Amount $ : 3000.0

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Exit
Enter choice: 5
Thank you


````
## 200.Write a program to manage student records.

````java[]

package Nanthu;
import java.util.*;
class Student{
	String name;
	int  roll_no;
	String dept;
	int mark;
	public Student(String name,int roll_no,String dept,int mark) {
		this.name=name;
		this.roll_no=roll_no;
		this.dept=dept;
		this.mark=mark;
	}
	
	public void display() {
	System.out.println("Name :"+name);
	System.out.println("Roll Number :"+roll_no);
	System.out.println("Department :"+dept);
	System.out.println("Mark :"+mark);
}
}
public class Main16 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ArrayList<Student> a=new ArrayList<>();
	while(true) {
		System.out.println("  Student Detail  ");
		System.out.println(" 1.Added Student ");
		System.out.println(" 2.Display Student Detail ");
		System.out.println(" 3.Exit ");
		System.out.println("Enter you choice ");
		int choice=s.nextInt();
		switch(choice) {
	
		case 1:
		    System.out.println("Enter your name");
		    s.nextLine(); 
		    String name = s.nextLine();
		    System.out.println("Enter your roll number");
		    int roll_no = s.nextInt();
		    System.out.println("Enter your Department");
		    s.nextLine(); 
		    String dept = s.nextLine();
		    System.out.println("Enter your Mark");
		    int mark = s.nextInt();
		    a.add(new Student(name, roll_no, dept, mark)); 
		    System.out.println("Successfully Added");
		    break;

		 
		case 2:
             System.out.println("\nStudent Records:");
             for (Student student : a) {
                 student.display();
             }
             break;
         case 3:
             System.out.println("Exiting... Goodbye!");
             return;
         default:
             System.out.println("Invalid choice. Please try again.");
			
		}
	}

	}

}

OUTPUT:

Student Detail  
 1.Added Student 
 2.Display Student Detail 
 3.Exit 
Enter you choice 
1
Enter your name
Nanthini
Enter your roll number
51
Enter your Department
cse
Enter your Mark
95
Successfully Added
  Student Detail  
 1.Added Student 
 2.Display Student Detail 
 3.Exit 
Enter you choice 
2

Student Records:
Name :Nanthini
Roll Number :51
Department :cse
Mark :95
  Student Detail  
 1.Added Student 
 2.Display Student Detail 
 3.Exit 
Enter you choice 
3
Exiting... Goodbye!


````
