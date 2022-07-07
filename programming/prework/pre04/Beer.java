import java.io.*;
import java.util.*;
//The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods. Consider the first verse of the song “99 Bottles of Beer”:
//99 bottles of beer on the wall,
//99 bottles of beer,
//ya’ take one down, ya’ pass it around,
//98 bottles of beer on the wall.

//Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program. As you develop your code, test it with a small number of verses, like 3.

public class Beer {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
//Check the condition from while loop, from line 16 -28 
        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; // ONE bottle
            }

            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println("Take one down, pass it round " + beerNum + " " + word + " of beer");
            }
        }

        if (beerNum == 0) {
            System.out.println("No more bottles of beer");
        }

    }
}