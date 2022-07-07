//Chapter 7 Loops 
/*  Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.

As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to 
 calculate the absolute value of the difference. 
*/

//Exercise 1  Chapter 7 Loops
//Consider the following methods:


public class Exercise1 {  

public static void main(String[] args) {
    System.out.println(squareRoot(10));
}

    public static double squareRoot(double n) {
        double sqroot = n / 2;
        double temp = 0;

        while (temp - sqroot != 0) {
            temp = sqroot;
            sqroot = (temp + (n / temp)) / 2;
        }
        return sqroot;
    }
  
}
  

    //while (i > 1) {
        //System.out.println(i);
        //if (i % 2 == 0) {
            //i = i / 2;
        //} else {
           // i = i - 1;
       // }
  //  }



//Exercise 1 - Part1 - Draw a table that shows the value of the variables i and n during the execution of loop. The table should contain one column for each variable and one line for each iteration.

//Exercise 1 - Part 2 - What is the output of this program? The square root that is 3.16

//Exercise 1 - Part 3 - Can you prove that this loop terminates for any positive value of n? Yes, if the difference between the current number and the sum of the squareroots is 0, then it will terminate.

