

import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	 int i;
	 i = ss.findSmallestIndex(0);
    System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss + "\n");

	 i = ss.findSmallestIndex(3);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss + "\n");

    i = ss.findSmallestIndex(10);// added a new test care element 10 is the starting index of your test 
    System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss + "\n");
      
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();//this only needs the array, it doesn't take any parameters
  //System.out.println(ss);
  System.out.println("Binary search for 5: " + ss.binarySearch(5) + " " + ss);

   //Time () method - this is the time it takes to sort an array with int size 10000 elements  
  int size = 100000; //instantiate size of arraylist 
  long start,elapsed; //instantiate start and elapsed long variables (no value currently)
  SortSearch ss2 = new SortSearch(size); //construct sortSearch object ss2 with given size
  ss2.sort();
	start = System.currentTimeMillis();
	size = ss2.linearSearch(5);
  //size = ss2.binarySearch(5);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);

  
        
    

      //System.out.print("hello \n hello2" ); test case to add another line


	      

    }
}