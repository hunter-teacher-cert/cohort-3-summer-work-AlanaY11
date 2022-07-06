//daily/3/arr2d/skel/TwoDimArray.java
/** skeleton file for
 class twoDimArray
  ...practice working with 2D arrays
*/

public class TwoDimArray
{

  //print each row of 2D integer array a on its own line,
  // using a FOR loop
  public static void print1( int[][] a ) {

  }


  //print each row of 2D integer array a on its own line,
  // using a FOREACH loop
  public static void print2( int[][] a ) {

  }


  //return sum of all items in 2D integer array a
  public static int sum1( int[][] a ) {
  int sum = 0;
  for (int i =0; i<a.length; i++) {
  for (int j =0; j<a[0].length; j++) {
  sum += a[i] [j]; 
  }
  }
  return sum;
  }


  //return sum of all items in 2D integer array a
  // using helper fxn sumRow
  public static int sum2( int [][] m ) {

  }


  //return sum of all items on row r of 2D integer array a
  // using a FOR loop
  public static int sumRow( int r, int[][] a ) {

  }


  //return sum of all items on row r of 2D integer array a
  // using a FOREACH loop
  public static int sumRow2( int r, int[][] m ) {

  }


  public static void main( String [] args )
  {
		/* ~~~v~~~~~slide~me~down~as~you~test~~~~~~~~~~~~~~~v~~~
       int [][] m1 = new int[4][2];
       int [][] m2 = { {2,4,6}, {3,5,7} };
       int [][] m3 = { {2}, {4,6}, {1,3,5} };
       print1(m1);
       print1(m2);
       print1(m3);
       print2(m1);
       print2(m2);
       print2(m3);
       System.out.print("testing sum1...\n");
       System.out.println("sum m1 : " + sum1(m1));
       System.out.println("sum m2 : " + sum1(m2));
       System.out.println("sum m3 : " + sum1(m3));
       System.out.print("testing sum2...\n");
       System.out.println("sum m1 : " + sum2(m1));
       System.out.println("sum m2 : " + sum2(m2));
       System.out.println("sum m3 : " + sum2(m3));
       ~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~*/
  }//end main()

}//end class TwoDimArray
 88  
daily/3/cgol/skel/Cgol.java
@@ -0,0 +1,88 @@
import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

public class Cgol
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {

  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {

  }


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){

  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int r, int c) {

  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {

  }


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {

  }


  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class