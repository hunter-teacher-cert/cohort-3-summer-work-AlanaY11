/**
 * nth Fibonacci number generator by Team SumEmIfYaGotEm
 * Aasine Cassara
 * collaborators: Alana, Kiana, Jerusha
 */

public class Fib
{
  public static int fib (int n){
    if (n<=1) {//assume nonnegative n
      return n;
    }  
    else {  
      return fib(n-1) + fib(n-2);
    //we used an else for consistent logic but method could run without else
      //if it can't return n it will go to fib 
      } 
  }



  public static void main( String[] args )
  {


      System.out.println( fib(0) ); // -> 0
      System.out.println( fib(1) ); // -> 1
      System.out.println( fib(2) ); // -> 1
      System.out.println( fib(3) ); // -> 2
      System.out.println( fib(4) ); // -> 3
      System.out.println( fib(5) ); // -> 5

      //now go big:
      System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155
      System.out.println( fib(42) );// -> 267914296 tested out another large number, there was a pause as 42 compiled

  }//end main()

}//end class Fib