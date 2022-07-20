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
	ss.sort();
  System.out.println(ss);

      //System.out.print("hello \n hello2" ); test case to add another line


	      

    }
}