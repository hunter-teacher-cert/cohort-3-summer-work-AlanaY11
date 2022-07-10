import java.io.*;
import java.util.*;

/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */



/** ***** WHY DO WE WANT A SuperArray ANYWAY? ***** 
Regular arrays are cool.  We can store things in them and we can easily find out how many things we can store in them (capacity). However, if we want to know how many things are *actually* stored in array, we have to do extra work.  
We can keep track with a counter (another variable) to tell us how many elements we've stored in the array.  
If we want many, many arrays to store lots and lots of things, having to keep track of the arrays and each of their counters is annoying.  
So: we're going to write a class that will do this for us.  We can write the class once and then use it many, many times.
**/



/** ***** WHAT WILL SuperArray DO? ***** 
* It will store our information (in this case, integers) and keep count of how many integers we've stored.
With a SuperArray, we can:
  * get the value stored at a specified index
  * set a value at a specific index
  * write the SuperArray as a String, so we can easily print & read it
  * determine how many integers we've stored in our SuperArray (as opposed to the length, which tells us the capacity, not how many integers are stored!)
  * check if the SuperArray is empty
  * increase the size of our SuperArray
  * add an integer to the SuperArray (at the end or at a specified index)
  * remove the integer stored at a specified index from the SuperArray  
*/



/** ***** WHAT DO I DO MAKE A SuperArray? ***** 
* In the skeleton, there is a debug() function.  It is now placed as the last method in this class.  
* According to https://github.com/hunter-teacher-cert/cs-ed-cohort-3-summer-2022/tree/main/daily/6  as of 07.09.22 18:21
(added toString() in Basic as I didn't see it listed)
*
* ***Basic***
* Add/write:
* > #0:  SuperArray()
*     Basic constructor that:
      1. Creates a new array of size 10 and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > #1:   SuperArray(int size)
*     Constructor that:
*     1. Creates a new array of size and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > #2:   isEmpty()
*     return true if the SuperArray is empty, false otherwise.
* > #3:  add(int value)
*     adds value to the end of the SuperArray (after the last added element)
* > #4:  toString() 
*    return a String version of SuperArray in human-readable format
* ***Intermediate ***
* Add/write:
* > #0: grow() 
*   Enlarges the SuperArray. It should:
*      Create a new array, 5 units larger
*      Copy the old data to the new array
*      Set the data instance variable to point to the new array
*
* Modify:
* > #1: add(int value) 
*   Modify code so that if the data array is filled it will:
*     1. Grow the array using the grow method you just wrote.
*     2. Add the new value to the array.
* 
* Add/write:
* > #2: get(index) - return the value at location index 
*
*
* ***Advanced***
* Write:
* > #0: add(index,value) 
*     Adds value at location index. You should shift the data to create an open space if you need to and you can use grow() if you need to make the array larger.
* > #1: remove(index) 
    Removes the location at index by shifting all the elements after location index and subtracting one from numberElements
*
*/

public class SuperArray Kate
{
 
  //instance variables
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  
 // ************ START BASIC ************
  
  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  
  /** Basic #0: SuperArray()
  *
  * default constructor -- initializes capacity to 10 
  * EXAMPLE of setting capacity with regular array of integers
  *  int[] myArr = new int[6]; // capacity of 6
  *  int[] myArr2 = new int[40]; // capacity of 40
  **/
  public SuperArray()
  {
    // NOTE: variables are already declared above (likely lines 96 & 97); you only have to create/instantiate them
    
    // create an array of integers called data that has a capacity of 10
    // YOUR CODE HERE

    
    // set numberElements to 0  (we haven't stored any integers in our SuperArray yet)
    // YOUR CODE HERE

  } 

  /** Basic #1: SuperArray(int size)
  *
  * overloaded constructor -- takes in an integer called size which specifies the initial capacity
  * EXAMPLE of setting capacity with regular array of integers
  *  int[] myArr = new int[6]; // capacity of 6
  *  int[] myArr2 = new int[40]; // capacity of 40
  **/
  public SuperArray( int size )
  {
     // NOTE: variables are already declared above (likely lines 96 & 97); you only have to create/instantiate them
    
    // create an array of integers called data with capacity of size
    /* YOUR CODE HERE */

    // set numberElements to 0  (we haven't stored any integers in our SuperArray yet)
    /* YOUR CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~

  /** Basic #2: isEmpty() 
  *
  * Determines whether the SuperArray is empty (returns true if empty, false if not)
  */
  public boolean isEmpty()
  {
    // write code determine whether the SuperArray is empty or not
    /* YOUR CODE HERE */

    
    return false; // change this line!
  }


  
  /** Basic #3: add(int value) add the value & increment (no special cases)
  * Intermediate #1: add(int value) Modify to deal with special cases
  *
  * Takes in an integer called value, and appends the value to our SuperArray
  *
  * NOTE: You will write version of this for Basic, then modify it to deal with special cases in Intermediate
  */
  public void add( int value )
  {
    // INTERMEDIATE: test to see if we need to grow, then grow
    /* YOUR CODE HERE */

    
    // BASIC: 
    // add item to "end" (after last input integer)
    /* YOUR CODE HERE */

    // increment numberElements
    /* YOUR CODE HERE */
  }

  /** Basic #4: toString() 
  *
  * Returns a human-friendly String for our SuperArray 
  */
  public String toString()
  {
    // return a String version of SuperArray that is human-readable
    /* YOUR CODE HERE */
    
    return ""; // change this line!
  }


 // ************ END BASIC ************


// ************ START INTERMEDIATE ************ 

  /** Intermediate #0: grow()
  *
  * Enlarges capacity of SuperArray by 5:
  *   1. Create a new array that is 5 units larger (as specified!)
  *   2. Copy elements from old array into new one
  *   3. Set data equal to your new array
  */
  private void grow()
  {
    
    // create a new array that is 5 units larger (as specified!)
    /* YOUR CODE HERE */

    // copy elements from old array into new one
   /* YOUR CODE HERE */

    // set data equal to your new array
    /* YOUR CODE HERE */
    
  }

  /** Intermediate #1: Go back up to add(int value) and modify it to deal with special cases (if you need to grow, then grow) **/
  
  
  /** Intermediate #2: get(index)
  *
  * Takes in an integer, index, and returns the value at that index
  */
  public int get(int index)
  {
    // return the value stored at the specifed index
    /* YOUR CODE HERE */

    return 0; // change this line!
  }


  // ************ END INTERMEDIATE ************


  // ************ START ADVANCED ************ 

   /** Advanced #0: add(index, value)
  *
  * Takes in an integer called index and an integer called value.  
  */
  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR CODE HERE */

    // shift elements toward the end of the array
    /* YOUR CODE HERE */

    // insert new element
    /* YOUR CODE HERE */

    // increment numberElements
    /* YOUR CODE HERE */ 
  }

  /** Advanced #1: remove(int index) 
  *
  * Takes in an integer called index and removes the value at the given index. 
  */
  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* YOUR CODE HERE */

    // subtract fom numElements;
    /* YOUR CODE HERE */ 
  }

  // ************ END ADVANCED ************

 //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()






  
}//end class