import java.util.*;


public class Trace {

  public static void main(String[] args) {
    String h = hailstone(5);
    System.out.println(h);

    System.out.println(gcd( 39, 24));
  }//main


  public static String hailstone(int n) {
    String series = n + " ";
    int[] harray = new int[3];
    int hcount = 0;

    while (n != 1) {
      harray[hcount] = n;
      hcount++;

      if (n % 2 == 0)
        n = n / 2;
      else
        n = (3 * n) + 1;
      series+= n + " ";

    }
    return series;
  }

  public static int gcd(int a, int b) {
    int r = 0;
    while (a % b != 0) {
      r = a % b;
      a = b;
      b = r;
    }//mod check loop
    return b;
  }//gcd


}//Trace class