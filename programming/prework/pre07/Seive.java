import java.io.*;
import java.util.*;
import java.util.Scanner;

//Chapter 8 Arrays Exercise 5  The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

//public class Seive {
  //public static void main(String[] args){
    //System.out.println("Hello world!");
 // }
//}
// Java program to print all
// primes smaller than or equal to
// n using Sieve of Eratosthenes

public class Seive {
	void sieveOfEratosthenes(int n)
	{
		// Create a boolean array
		// "prime[0..n]" and
		// initialize all entries
		// it as true. A value in
		// prime[i] will finally be
		// false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++)
		{
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[p] == true)
			{
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

	// Main Method so you can see your code when you run it
	public static void main(String args[])
	{
		int n = 30;
		System.out.print(
			"Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);
	}
}


/**public class SievePrimeFactors  {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      boolean[] bool = new boolean[num];
     
      for (int i = 0; i< bool.length; i++) {
         bool[i] = true;
      }
      for (int i = 2; i< Math.sqrt(num); i++) {
         if(bool[i] == true) {
            for(int j = (i*i); j<num; j = j+i) {
               bool[j] = false;
            }
         }
      }
      System.out.println("List of prime numbers upto given number are : ");
      for (int i = 2; i< bool.length; i++) {
         if(bool[i]==true) {
            System.out.println(i);
         }
      }
   }
}*/