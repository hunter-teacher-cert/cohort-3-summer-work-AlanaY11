import java.util.Scanner;
import java.util.Random;

//  The goal of this exercise is to program a “Guess My Number” game. When it’s finished, it will work like this:
//I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?
//Type a number: 45 Your guess is: 45 The number I was thinking of is: 14 You were off by: 31

public class GuessStarter {
 
   public static void main(String[] args) {
 //pick a random number 
       int random, guess;
       Scanner keyboard = new Scanner(System.in);
       Random generator = new Random();
       random = generator.nextInt(100) + 1;
       
 //part 3 modify the program to prompt the user, then use a Scanner to read a line of user input. Compile and test the program.

       System.out.print("Mmm let's see...I am thinking of a number between 0 and 100, what do you think it is?");
 
       guess = keyboard.nextInt();
      
//part 4 read the user input as an integer and display the result. Again, compile and test.
  
     System.out.println(random + " " + "is the correct answer!" + " ");

//part 5 Compute and display the difference between the user’s guess and the number that was generated.
       System.out.println(Math.abs(random -guess) + " "  + "is the difference between the two numbers!");   
   }       
}


