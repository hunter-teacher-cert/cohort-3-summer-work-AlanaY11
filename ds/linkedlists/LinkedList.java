import java.io.*;
import java.util.*;
//Collaborators Mike Randazzo
//Aasine Cassara, Alana Robinson, Moo Joon "Mike" Park

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()

Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()

Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;// head is being preset to null because the linked list is empty
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */

  //adds() method adds a new node that is pointing to the head or front of the list and then this makes it the new head
  public void add(String value){

    //()node a - this creates a new node which points to the old node or head of the list
    Node a = new Node(value, head);
    head = a;
  }

  /**
  Returns the String in the node at location index.
  */
  //()get method returns the string at a specified index in the node
  //temp variable creates a temp reference for the while loop
  public String get(int index){

    int i=0;// i is the counter
    Node temp = head;
    while(i<index) {
      temp = temp.getNext();
//Create a temp variable which is similar to "walker" and allows you to traverse or travel through the linked list
      i += 1;
    }
    
    return temp.getData();
//we are going throught the list and finding a specific element and returning that element, which is ()getData.
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String list = "";// create a blank string
    Node temp = head;
    while(temp != null) {
      list = list+(temp);
  //this adds the value or a string version of the list
      temp = temp.getNext();
    }
    
    return list;//it returns all the string elements 
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    int i=0;
    Node temp = head;
    while(temp != null) {
      temp = temp.getNext();// ()getNext is a way to get the next value
      i += 1;
    }
    return i;//this i tells us how big the list is and we are using i to count every element in the list, i is the counter
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){
//this method is we are adding a string specified by the int value - the int is the location that tells us where to put it and the it is the string
  // Node I = new Node(value);
  // Node temp=head;
  // //set temp to word using a while loop

    
  // temp = I.setNext
  Node I = new Node(value);
		//I.setNext() = null;
		
		if(index==0)
		{
			add(value);
		}
		else{
		Node temp = head;
		for(int i=0;i<index-1;i++)
		{
			temp = temp.getNext();
		}
		I.setNext(temp.getNext()); 
		temp.setNext(I);
		}
    
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    Node temp = head;
      int i = 0;
      while (temp !=null){
    
        if (temp.getData()==value){
          return i;
        }
        else{
          i++;
          temp = temp.getNext();
        }
      }
    return -1;//this means it was not found, it is another way writing an error message
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  //we're going through and creating a for loop and then copying it. Creating a String temp variable copies the array. We used size to call the linked list
  public String[] toArray(){
    String [] a= new String[size()];// we are creating a blank array the same size as the linked list
    Node temp=head;
    for (int i=0; i<size(); i++){//this is how we are counting through the array
     a[i]=temp.getData();//it's copying the walker as the walker is going down the linked list; it's taking the getData from that "i" p
      temp=temp.getNext();
    }
    
    return a;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}
