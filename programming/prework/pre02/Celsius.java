import java.util.Scanner;
 
public class Celsius {


// Data Types Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
  
//Here is the formula. Be careful not to use integer division!
  public static void main(String[] args) {
    // Create new Scanner object
    Scanner input = new Scanner(System.in);
 
    // Prompt user to input a degree in double
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
 
    // Convert Celsius to Fahrenheit
    double fahrenheit = 9.0 / 5 * celsius + 32;
 
    // Display results
    System.out.println(celsius + " Celsius is " + fahrenheit
      + " Fahrenheit");
  }
}
