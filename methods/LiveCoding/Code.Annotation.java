//Collaborators Alana Robinson

//Patti Elfers, Ed Hawkins, Kirk 

//Teacher Prompts

/* PROVIDE (P) :: code snippets or comments you definitely want to provide
STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
MUST-ANSWER-Q (MAQ) :: a question that must be resolved, that a majority of your class must understand before moving on
BIG-IDEA (BI) :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
BEEG-REVEAL (BR) :: this is gonna blow yer minds...
DELIBERATE-ERROR  (DE):: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
FIRSTDRAFT (FD) :: code that will work for now, but which you intend to replace later
REVISION vX (REV) :: better versions of firstdraft code...
  **/

//CODE: This method should search through data and return the index of the first time value appears in data. If value is not in data return -1.


//(MAQ) what do we call this (method, class?)
//(MAQ) - what do you think line 22 is doing? 
//Provide (P) remember what() this means - inside these () parenthesis are the parameters - what are the paremeters on line 23?
//Wh
public int linearSearch(int value, ArrayList<Integer> data) {

  // Provide (P) On line 20, we know that the data type is int, what else is   
  //happening? how is this line related to 19 above?
  //Is this a return value?
  int foundIndex = -1;

  //(MAQ) What is happening on line 27 below?
  //Provide (P) - is this a (for), (while) or (do) or (enhanced) Loop?
  //(MAQ) Why do you think we need this type of loop? 
  //Would you use another loop in this program?
  for (int i=0; i < data.size(); i++) {

   // 
    int element = data.get(i);// 

    if (element == value) { 
      foundIndex = i;
      break;// why do we need a break here? what does the break do - does it continue or stop the loop?
      }
    }
  return foundIndex;//(MAQ) what does this line do? what is it returning? 
}