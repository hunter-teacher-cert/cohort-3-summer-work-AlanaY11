public class TestArrayInit {

  public static void main( String[] args ) {
    int theArray[];
    theArray = new int[17];

    for( int i=0; i<theArray.length; i++) {
      System.out.println(theArray[i]);
    }
  }
}