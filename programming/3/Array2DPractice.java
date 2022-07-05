//daily/3/Array2DPractice.java

import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 
 * collaborators: Aasine Cassara, Amanda Lee, Sam Lojacono, Alana Robinson
 */

/**

   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard(int rows, int cols, char value)
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard(char[][] board)
  {
    // for board.length, default row is always the row value
    for (int i = 0; i < board.length; i++)
    {
       for (int j = 0; j < board[i].length; j++)
       {
         System.out.print(board[i][j]);
       }
       System.out.println(); 
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
      0123
     0xxxx
     1xxxx
     2@@@@
     3xxxx
  */
  public static void setRow(char[][] board, int row, char value)
  {                                            // 2nd, to be 'O'
    for (int i = 0; i < board[0].length; i++)
    {
      board[row][i] = value;
    }
  }

  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard(char[][] original)
  {
    int row = original.length;
    int column = original[0].length
    char[][] copyCat = new char[row][column];
    //create 2D array of char

      //transverse again
      //>>inside the for loop, copy(1,1) = original(1,1)
  }
  


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare(char[][] board, int row, int col) //(b, 2, 2)
  {
    //traverse through the elements in row and column 
    for (int i=0; i<board.length; i++){
      for (int j=0; j<board[i].length; j++){
        // if ((i>=row-1 && i<row+1) && (j>=col-1 && j<=col-1) && (i!=row || j!= col))
        if (i>=row-1 && i<=row+1)    
          if(j>=col-1 && j<=col+1)
            if(i!=row || j!= col)
              // change those letters into Xs
              // arrayName[i][j] = the change
              board[i][j] = 'x';
        
            
      }
    } 
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array

     qqzqq        (0,2)
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     ...
     explodeAllchar(board,'z')
     will change board to

     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz

  */
  public static void explodeAllChar(char[][] board, char c)
  {
    /* YOUR AWESOME CODE HERE */
      //transverse through the elements in the array and see if they match the char c
      for(int i=0; i<board.length; i++){
        for(int j= 0; j<board[i].length; j++)
        {
          if (board[i][j]==c) //if they match Z
          {
              //explode the neighbors of Z
              //explodeSquare(board,0,2)
            explodeSquare(board, i, j);
              
          }
        }
      }
      

      
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    
    System.out.println("");
    setRow(b,2,'c');
    //calling the method
    printBoard(b);

    System.out.println("\nExplode below");
    explodeSquare(b,2,2);
    printBoard(b);


    char[][] board = buildBoard(5,5,'O');
    board[1][1] = 'Z';
    board[3][4] = 'Z';
    System.out.println("\nBelow is the board for explode char");
    printBoard(board); //this is the first 5

    System.out.println("\nExplode char Z");
    explodeAllChar(board, 'Z');
    printBoard(board);//last 5

      //it should work, lemme know if it does or doesn't
      //printed out looks like 10 rows, not five rows
    /* //go to line199, 
//works!!
        OOOOO
        OZOOO
        OOOOO
        OOOOZ
        OOOOO

      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}