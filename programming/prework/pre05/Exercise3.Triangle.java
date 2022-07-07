
import java.util.*;

//Chapter 6 Value Methods Exercise 3 
//If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

//If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
//Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.



//Chapter 6 Value Methods - Exercise 3

public class Exercise3 Triangle {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input side1: ");
  int s1 = in .nextInt();
  System.out.print("Input side2: ");
  int s2 = in .nextInt();
  System.out.print("Input side3: ");
  int s3 = in .nextInt();

  System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
 }
 public static boolean isValidTriangle(int a, int b, int c) {
  return (a + b > c && b + c > a && c + a > b);
 }
}






public class Exercise3 Triangle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the lengths of sides a,b,c:");
        a=sc.nextInt();                                            //read a,b,c values from user
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=0 || b<=0 ||c<=0)              //checking values less than or equal to 0 and printing error message
        {
            System.out.println("ERROR:lengths should not be less than or equal to zero");
        }
        else if(a<=b+c && b<=a+c && c<=a+b)       //conditions for forming a traingle
        {
            System.out.println("You can form a triangle");
        }
        else
        {
            System.out.println("You cannot form a triangle");
        }
    }
}j