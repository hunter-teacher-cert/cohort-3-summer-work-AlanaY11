/**
 class Scrambler
 for quick shuffling of a class list
 USAGE:
 $ java Scrambler < TEXTFILEOFNAMES-1PERLINE
 */

import java.io.*;
import java.util.*;

public class Scrambler
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner( System.in );

    String name = "";
    ArrayList<String> names = new ArrayList<String>();

    //System.out.println("reading in names...");
    //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    while ( input.hasNextLine() ) {
      name = input.nextLine();
      //System.out.println( name );
      names.add(name);
    }

    //shuffle the collection
    for( int i=0; i<names.size(); i++ ) {
      int r = (int)(Math.random()*names.size() );
      names.set( r, names.set(i, names.get(r)) ); //swap(i,r)
    }

    //print scrambled collection
    for( String n : names ) {
      System.out.println(n);
    }
  }
}