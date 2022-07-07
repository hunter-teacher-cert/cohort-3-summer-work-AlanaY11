public class Time {
  
  public static void main (String[] args) {

  //Time.java 4: error missing method body, or declare abstract public static void main (String[] args); {
  String firstLine = "It's Time to check...";
  System.out.println(firstLine);

  //Exercise 3 Chap 2.12 - part 2 create variables hour, minute, second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14.
  int hour = 12;
  int minute = 59;
  int second = 30;

  System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
 

//Exercise 3 Chap 2.12 - part 3 make program calculate and display number of seconds since midnight.
  System.out.print("Number of seconds since midnight: ");
       System.out.println((hour * 60 * 60) + (minute * 60) + second);
 
//Exercise 3 Chap 2.12. part 4 Calculate and display the number of seconds remaining in the day.
  System.out.print("Seconds remaining in the day: ");
       System.out.println((24 * 60 * 60) -  ((hour * 60 * 60) + (minute * 60) + second));

//Exercise 3 Chap 2.12. part 5 Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.

  System.out.print("Percent of the day that has passed: ");
       System.out.println(((hour * 60 * 60) + (minute * 60) + second) * 100/ (24 * 60 * 60));

    
//Exercise 3 Chap 2.12 part 6 Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.

  }

  
  
}

