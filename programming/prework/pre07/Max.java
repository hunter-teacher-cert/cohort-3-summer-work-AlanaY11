import java.io.*;
import java.util.*;
// Chapter 8 Arrays:  Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not? Yes, you can rewrite the method using an enhanced for loop by adding a counter integer.  An enhanced for loop is a better, more generalized way, of you looping through arrays and generally you don't have access to the index of arrays, only have access to the numbers. So the loop goes through the arrays. See below
public class Max {
    // public static void main(String[] args){

    public static int indexOfMax(int[] a) {
        // store the index of maximum element
        int index = -1;
        // store the maximum value in the array
        int max = Integer.MIN_VALUE;
        // making it an enhanced for loop by removing the a[i], a which is the index
        // (which is the location), the location in the array
        // external counter
        int counter = 0;
        for (int i : a) {
            // if current element is greater the maximum element till now
            if (i > max) {
          // making it an enhanced for loop by removing the a[i] a which is the index, the
          //location in the array
                max = i;
                index = counter;
            }
          counter++;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 6, -1 };
        int index = indexOfMax(arr);
        System.out.println("Index of Maximum Element : " + index);
    }

}
