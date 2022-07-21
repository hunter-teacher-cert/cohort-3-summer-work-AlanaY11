import java.io.*;
import java.util.*;
//Collaborators Room 12 Alana Robinson
//Vanessa Zou, LaToya Boland, Tanya Wardally & TA Luca & TA Kevin 
/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch {

    /* Sort project starts here */
    
    /* Instance Variables */
    public ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
  public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
  public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	  return this.data.get(index);
    }
    /*
      return the index of the smallest data item from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
	  int smallIndex = start;
      //given an index, want smallest number in array list starting from this index
      //create a temporary variable for smallest number = first index(value)
      //traverse the list with for loop
      //check if less than current number
      //at end of list will return smallestNumber
      int smallestNumber = data.get(start);
      //Becuase start is the starting index to search from, we want to set the corresponding value to be our starting smallest number
      
      for(int i = start + 1; i <data.size(); i++) 

      {
        if (data.get(i) < smallestNumber) 
// If the current value we're looking at with the for loop is less than our current smallestNumber, enter this statement
        {
          smallestNumber = data.get(i); 
  //reassign smallestNumber to new smallest number
          smallIndex = i; 
  //reassign index of smallest number to new index of smallest number
        }
      }
    return smallIndex;//returning the smallest value's location
    }

    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
    */
  
    public void sort(){
    
  //create an instance variable for the smallIndex   
  //this is a holder once you find the smallest index and it will always change when you loop through the array
      int tempInt = 0;//this variable is what you use to swap the holder or (int smallIndex)
      
      for(int i =0; i<data.size(); i++) {
//create a loop a variable that represents the ArrayList index from 0 to end of ArrayList -this is when the loop starts
     
       int smallIndex = findSmallestIndex(i); 
// this is finding the index of the smallest value within that range in the loop
//this variable was changed based on the demo from a classmate. It was originally set up with just int smallIndex = int temp. Originally my logic was that this was the smallIndex = to the temp and the temp, like Walker, allows it to loop through, check and compare whether there is the small element in the list. It was changed based on the demon This is  sets up the search through the arrayList to find the smallest index starting at 0
//which is what this i counter is
     tempInt = data.get(smallIndex); //lines 123-126 is the swapping part
    // this is the temp variable that acts as the walker in the array, that is it traversers through the list and helps you loop through and access each element in the arraylist
    data.set(smallIndex, data.get(i));// smallIndex is the index at the smallest
  //[3, 0, 1, 5 ]Example smallest index(position) is the location of the smallest value 
  //this is the starting point of the loop and you are setting i at 0 to start the loop
    data.set(i, tempInt);
  //this data is now the temp data
       
 
      }
      }
     
  //for each index, find the smallest from that location to the end of the array, swap it with that index

    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
  
// 7.21.22 @ 5pm fixed the code and it was able to compile, hopefully we can come back in the morning to discuss about it.  It was a code issue, we had extra codes and some codes repeated unnecessarily, it wasn't a curly bracket issue, it can be cause of the extra unneeded code.

    public int linearSearch(int value){
      //i is index: this is comparing the value and returning the i element
	    for(int i =0; i<data.size(); i++) {
        
        if (data.get(i) == value){
          return i;}// return the index of that element once the element is at i then you want to return that position
              }
      
      return -1; // return -1 is if the index at i value is not found then you're telling the computer that this is outside the array loop, it's like an error message
      
      }
    
	//  return 0; // replace this return
  //  }
    
    /**
       Implement a binary search as specified by the comments
//find the first coccurence without looping through the array the entire arary 
you will still need a loop but search from the middle
precondition is arry sorted from bigest to smallest or smallest to biggest
       
       This algorithm only works on sorted ArrayLists.
    */

  //
//   [0 1 2 3 4 5]
//   0 + 5 = 5 / 2 = 2.5 (int) = 2
//                     1 < 2
//   left = middle + 1;
// right = middle - 1;
  
  public int binarySearch(int value){
    //  Initialization outside the while loop
  int low = 0;
  int high = data.size() - 1;
	// create assign variables representing the high, low and middle indices 
    while (low < high) {

      /*
      This is a multiline comment
      Lines!
      */

      int middle = (low + high)/2;
      //System.out.println("middle: " + middle);
          
	// while we're not done:
  //for (int middle = (low + high)/2; middle<data.size(); middle--) {//this is starting the search in the middle of the array
    //int middle = (low + high)/2;// this code is  looking for the middle value and next we will find the middle from the left side of the array
    if (value == data.get(middle)) {
       return middle;
    }
     
    else if (value < data.get(middle)){
    //this is finding the middle value of the left side of the array
      high = middle - 1;
      middle = (low + high)/2;

    }

    else if (value > data.get(middle)) {
      low = middle + 1;
      middle = (low + high)/2;
     //int middle = (low +high)/2;

     {
        
      
    }
          
      
    }

    return -1; // Kevin: return -1 if value was never found inside array, this return is outside the while loop
  
  }

  public String toString(){
  return ""+data;
    
  }

} 
	// if the item is at data.get(middle), return middle
	// otherwise, update high, low, and middle

	//return 0;
	    
   // }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

//    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

// 	// refer to class discussion
	
// 	return 0;
	    
//    }
    
	


// public void builtinSort(){
// 	  Collections.sort(data;
// }
    

    