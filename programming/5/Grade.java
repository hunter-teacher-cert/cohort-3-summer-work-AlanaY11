

import java.util.Scanner;
class Grade {
  private String ID;
  private double score;
  private double weight;

  public void setID (String id){
    ID = id; 
  } 

  public String getID ( ) {
    return ID ;
  }

  
  public  Grade() {
    ID = "";
    score =0.0;
    weight = 0.0;
  }
  public  Grade (String id, double s, double w){
   ID = id;
   score = s;
   weight = w ;
  }
  public void enterInfo(){
    Scanner input = new Scanner(System.in);
    System.out.print ("Enter ID: "); ID = input.nextLine();
    System.out.print ("Enter Score: "); score = input.nextDouble();
    input.nextLine();
    System.out.print ("Enter Weight: "); weight =input.nextDouble();
    input.nextLine();
  }
  public void showInfo(){
    System.out.println("ID: "+ID+
                       " Score: "+score+
                       " Weight: "+weight);
  }
}