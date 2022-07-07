import java.io.*;
import java.util.*;

public class Date {
  public static void main (String[] args){
    //Exercise 2 Date -  number 1 section Create Hello World
    System.out.println("Hello world! Here we go...");

   //Exercise 2 Date  - number 2 section write a program that create variables day, date, month, year 
    String day = "Saturday";
    int date = 29;
    String month = "January";
    int year = 2022;
  //Exercise 2 Date - number 3 section display each var on a line by itself
  System.out.println(day);
  System.out.println(date);
  System.out.println(month);
  System.out.println(year);

  //Exercise 2 Date - number 4 section display standard american format
  System.out.println("American Format:");
  System.out.println("Saturday" + " "+ "January " + " " + "29" +" " + "2022");

  //Exercise 2 Date - number 5 display european format
  System.out.println("European Format:");
  System.out.println(day + " " + date + " " + month + " " + year + " ");
  }

}




