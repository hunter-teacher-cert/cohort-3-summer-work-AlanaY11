import java.io.*;
import java.util.*;

//Chapter 6 Value Methods Exercise 8 The Ackerman Function
//The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:
//Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.

//Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).

	
  //Chapter 6 Value Methods Exercise 8 Ackerman - The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows: Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
  // Assumes n >= 0, m >= 0
	public class Ackerman {
  //Ackerman Function
    public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		}
		else if (n == 0) {
			return ack(m - 1, 1);
		}
		else {
			return ack(m - 1, ack(m, n - 1)); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("A(0, 0) = " + ack(0, 0));
		System.out.println("A(0, 1) = " + ack(0, 1));
		System.out.println("A(1, 0) = " + ack(1, 0));
		System.out.println("A(2, 1) = " + ack(2, 1));
		System.out.println("A(1, 1) = " + ack(1, 1));
		System.out.println("A(2, 2) = " + ack(2, 2));
	}
  }