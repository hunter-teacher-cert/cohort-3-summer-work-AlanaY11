import java.io.*;
import java.util.*;
import java.util.Random.*;
import java.lang.Math.*;
 //Chapter 9 Strings and Things - String Manipulation
//You will write a program named Craps.java that will play a simplified game of craps. There should be at least three static methods in addition to main. 

public class Craps {    
//There should be at least three static methods: One named roll which accepts an integer parameter and returns a random number //between 1 and that number, inclusive. 
    public static void main(String[] args) {
      System.out.println(shoot(4,20));
      }
  
    public static int roll(int number){
        Random random = new Random();  // create an object of Random class   
        int x = random.nextInt(number)+1; //int x = random.nextInt(6);  
        return x;
      }
      
//There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.  
    public static int shoot(int number, int maxValue){
     int sum = 0;
      for(int i = 0; i < number; i++){ //I = 0, is I less the number it runs the code then adds 1 to it, then checks and adds one 
        sum += roll(maxValue); 
        }
        return sum;  
    }
}
//The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses. Only two states so use boolean
    public static boolean round(){
      boolean isWinner = false;
      boolean isWinner = true;    
    }
//A round is played as follows:
//Use if-else if- else statement 
//The shooter shoots (rolls) the dice.
//Use if else statement
//If he rolls a 2,3, or 12,that’s Craps and he loses.
//If he rolls a 7 or 11, that’s a Natural and he wins.
//Otherwise:

//the value he rolled is now called the Point
//the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.
//The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.*/

