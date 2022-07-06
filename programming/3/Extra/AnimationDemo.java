public class AnimationDemo {

  static String CLEAR_SCREEN =  "\033[2J";
  static String TO_TOP_OF_SCREEN = "\033[1;1H";
  static String HIDE_CURSOR = "\033[?25l";

  /**
   * This is just to slow down the printing. 
   * The specifics are not critical for your understanding. 
   */
  public static void wait(int millis){
    try{
        Thread.sleep(millis);
    }catch(InterruptedException e){}
  }

  /** Draw a rectangle */
  public static void printBox(char c) {
    for(int i = 0; i < 20; i++){
      for(int j = 0; j < 20; j++)
        System.out.print(c);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //Do this once before you print anyting
    System.out.println(CLEAR_SCREEN + HIDE_CURSOR);

    for(int i = 0 ; i < 26; i++){
      //Do this each time you want to display a board
      //and overwrite the old version.
      System.out.println(TO_TOP_OF_SCREEN);
      printBox((char)('A'+i));
      wait(150);
    }
  }
}