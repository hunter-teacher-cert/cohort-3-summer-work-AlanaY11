import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?

 * collaborators: Patti Elfers, Alana Robinson, William LaMorie, Qianhui Vanessa Zou
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  
  public static char[][] createNewBoard( int rows, int cols )
  { // pretty much identical to creatBoard from 2dArray
   char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]='.';
      }
    }
    return board;
  }
  

  //print the board to the terminal
  public static void printBoard( char[][] board )
  { // same as print board in 2d array
    for (int r=0; r<board.length; r++){
      for (int c=0; c<board[r].length; c++){
        System.out.print(board[r][c]);
      }
      System.out.println();
    } 
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  { // single line set the value of the board to 'val'- give it a val (modified cell to give a value-space)
    board[r][c] = val;  
    // board[0][0] = 'X';
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int row, int col )
  { // same logic for finding area around as explode -same as ExplodeSquare method from 2DArray
    //traverse through the elements in row and column 
    // this explodeSquare method was used in Cgol's countNeighbor method
    int total = 0;
    //the goal is to find the area around the grid finding the squares around your target "x"
    for (int i=0; i<board.length; i++){
      for (int j=0; j<board[i].length; j++){
        // if ((i>=row-1 && i<row+1) && (j>=col-1 && j<=col-1) && (i!=row || j!= col))
        if (i>=row-1 && i<=row+1) //this line traverse/is looking through the row of the entire board, check these rows which are my   
          if(j>=col-1 && j<=col+1)//this line traverse/is looking through the column of the entire board
            if(i!=row || j!= col)
              //----------
              //-----+++--
              //-----+H+--
              //-----+++--
              //----------
              
              // +++
              // +H+
              // +++
              // now we are looking for "living neighbors in the + area above"
              // a living neighbor is an 'X'
              // so we want to see if board[i][j] is an 'X' and if so, add it to the total
              if(board[i][j] == 'X'){ 
                total ++;
              }
        
      }
    } 
    return total;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     Survivals:
     * A living cell with 2 or 3 living neighbours will survive for the next generation. Otherise they die
     
     (alive 'X', dead ' ')
     Births:
     * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next 
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {  
    // use countNeighours right here
    int n = countNeighbours(board, r, c);
    
    // if living & if 2 or 3 living neigbors, survive 
    if(board[r][c] == 'X'){
      if(n == 2){ 
        return 'X';
      }
      if(n == 3){
        return 'X';
      }
    }

    // if dead, if 3 neigbors, come to life
    if(board[r][c] == '.'){ // then this location is dead
      if(n == 3 ){
        return 'X'; // a new life
      }
    }
    
    return '.'; // the base is that there is no life
  }


  //generate and return a new board representing next generation
  
  public static char[][] generateNextBoard( char[][] board )
  { 
    // make a new board
    char[][] newBoard = createNewBoard(5,5);

    // check each "cell" on the old board
    //i = row; j = column
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        // fill the new board with their info from getNextGenCell
        //board[0] to show all the other columns is the same length assuming we know it is a rectangular shape
        char cell = getNextGenCell(board, i, j);
        newBoard[i][j] = cell;
        // newBoard[i][j] = getNextGenCell(board, i, j); but java does not like it
      }
      
    }
      

    // return new board
    return newBoard;
  }
  

  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    char[][] board;
    board = createNewBoard(5,5);
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
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*
    char[][] board;
    board = createNewBoard(5,5);// changed from 25 x 25 to 5 x 5 based on classmate's presentation, makes board more managable
   // setCell(board, 1, 1, 'H'); // for visualization in countNeighbours code, same position
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    printBoard(board);
    int neightest = countNeighbours(board, 1, 1); // where the test is happening
    System.out.println(neightest);
    char alive = getNextGenCell(board, 1, 1); // test at where H was
    System.out.println("1,1 will be: " + alive);
    */
  }//end main()

}//end class
 