import java.io.*;
import java.util.*;

//Chapter 7 Loops: - Exercise 2 

//For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and x3 = 3.00091. So it converges quickly on the correct answer.
//Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.

//As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference.


public class Loops {
  public static double squareRoot(double n) {
        double sqroot = n / 2;
        double temp = 0;

        while (temp - sqroot != 0) {
            temp = sqroot;
            sqroot = (temp + (n / temp)) / 2;
        }
        return sqroot;
    } 
 
 

//Chapter 7 Loops: - Exercise 3  
//In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.
//Aforementioned Exercise 9 Write a recursive method called power that takes a double x and an integer n and returns xn.

//Hint: A recursive definition of this operation is xn = x · xn−1. Also, remember that anything raised to the zeroth power is 1.
//ThIS IS EXERCISE 9 Write a recursive method called power that takes a double x and an integer n and returns xn.
//Hint: A recursive definition of this operation is xn = x · xn−1. Also, remember that anything raised to the zeroth power is 1. Optional challenge: you can make this method more efficient, when n is even, 
//using xn = ( xn/2 )2.

   public static double power(double x, int n) {
        if (n > 0) {
            return (x * power(x, n - 1));//power is the recursive call
        }
        return 1;// this is the base case
    }
  


//Chapter 7 Loops: - Exercise 4
//Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial.
//From 6.7 from the book

public static int factorial(int n) {
    if (n == 0) {
        return 1;// base case
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
} 
//Another version factorial with recursion
//public static long factorial(int number){ 
  //base case - factorial of 0 or 1 is 1 
//if(number <=1){ return 1; } return number*factorial(number - 1); 
}

