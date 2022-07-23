import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	System.out.println("List:");	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	System.out.println();	
		
	// // Uncomment these to test part 2

  System.out.println("Smallest at Index 0:");
	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  System.out.println();

  System.out.println("Smallest at Index[]:");
	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  System.out.println();
  System.out.println("==========");
  System.out.println();
  
	// // Uncomment these to test part 3
  System.out.println("List:");
	System.out.println(ss);
  System.out.println();
  System.out.println("Sorted List:");
	ss.sort();
	System.out.println(ss);
  System.out.println();
  System.out.println("==========");
  System.out.println();

      

  //Search project
  //linear Search
  System.out.println("Linear Search:");
  System.out.println(ss);
  System.out.println("Index " + ss.linearSearch(3));
  System.out.println();
  
  //binary Search
  System.out.println("Binary Search:");
  System.out.println(ss);
  System.out.println("Index " + ss.binarySearch(11));
  System.out.println();    
    


  //Time () method - this is the time it takes to sort an array with int size 10000 elements  
  int size = 100; //instantiate size of arraylist 
  long start,elapsed; //instantiate start and elapsed long variables (no value currently)
  SortSearch ss2 = new SortSearch(size); //construct sortSearch object ss2 with given size
  ss2.sort();
	start = System.currentTimeMillis();  // this should go before sort if you want to calculate the time sort takes to run
	size = ss2.linearSearch(5);
  //size = ss2.binarySearch(5);
	elapsed = System.currentTimeMillis() - start;
  System.out.println("Size: " + size + " Time: " + elapsed);

  
        
    

   //System.out.print("hello \n hello2" ); test case to add another line


	    