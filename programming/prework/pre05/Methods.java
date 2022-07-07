import java.util.*;

//Chapter 6 Value Methods: Exercise 2 Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

public class Methods {
//Declare method - saying what the method would do
    public static boolean isDivisible(int n, int m) {
		if (n%m == 0) { 
			return true;
		}
		return false;
	}


//Chapter 6 Value Methods: Exercise 3 Triangle - If you are given three sticks, you may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. Fore any three lengths, there is a simple test to see if it is possible to form a triangle: If any of the three lengths is greater thatn the sum of the other two, you cannot form a triange. 
//Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triange from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.

  //main method
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input side1: ");
  int s1 = in.nextInt(); //input from the user
  System.out.print("Input side2: ");
  int s2 = in.nextInt();
  System.out.print("Input side3: ");
  int s3 = in.nextInt();
//Calling the isValidTriangle method - the method will do something
  System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
 
  
    }
 //Declare Method - isValidTriangle method equal these arguments (arguments) will say true or false
  public static boolean isValidTriangle(int a, int b, int c) {
  return (a + b > c && b + c > a && c + a > b);
 }

//Chapter 6 Value Methods Exercise 8 Ackerman - The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows: Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
  
	// Assumes n >= 0, m >= 0
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
	
	/**public static void main(String[] args) {
	  System.out.println("A(0, 0) = " + ack(0, 0));
	  System.out.println("A(0, 1) = " + ack(0, 1));
		System.out.println("A(1, 0) = " + ack(1, 0));
		System.out.println("A(2, 1) = " + ack(2, 1));
		System.out.println("A(1, 1) = " + ack(1, 1));
		System.out.println("A(2, 2) = " + ack(2, 2));
	}*/
} 


