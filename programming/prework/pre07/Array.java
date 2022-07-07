import java.io.*;
import java.util.*;

//Chapter 8 Arrays - exercise 1 The goal of this exercise is to practice encapsulation with some of the examples in this chapter.

//Exercise 1 (part 1)- Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.


public class Array {
    public static void main(String[] args) {
        Array a = new Array();
        double[] g = a.powArray(new double[] { 1, 2, 3, 4, 5 }, 3);
        for (double i : g) {
            System.out.println(i);
        }
        int[] counter = a.histogram(new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3 }, 3);
        for (int c : counter) {
            System.out.println(c);
        }
    }

    public double[] powArray(double[] a) {
        return this.powArray(a, 2);
    }

    public double[] powArray(double[] a, int power) {
        double[] powers = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            powers[i] = Math.pow(a[i], power);
        }
        return powers;
    }

    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }





//Chapter 8 Arrays: Exercise 1 (part 2) - Starting with the code in Section 8.10, write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.

 public int[] histogram(int[] scores, int numCounters) {
        int[] counter = new int[numCounters + 1];
        for (int i = 0; i < scores.length; i++) {
            int value = scores[i];
            counter[value]++;
        }
        return counter;
    }
}



  



//for (int i = 0; i < values.length; i++) {
  //int value = values[i];
   // System.out.println(value);
//}

//for (int value : values) {
   // System.out.println(value);
//}