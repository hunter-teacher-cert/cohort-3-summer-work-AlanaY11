/**
 * Rational class by Team 5
 * Patti Elfers
 * collaborators: Thea Williams, Alana Robinson, Joshua Higgins
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - toStringj
   - default constructor ✅
   - multiply
   - divide
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  //this method is giving the default value of 0 and 1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
    
    /* YOUR ELEGANT CODE HERE */
  }

  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, you should print a message and set the number to 0/1. This is the constructor method
  public Rational( int n, int d )
  {
    /* YOUR ELEGANT CODE HERE */
    if(d!=0) 
    {
      this._denominator = d;
      this._numerator = n; 
    }
    else 
    {
      System.out.println("The rational number can't have a denominator of 0");  
      _numerator = 0;//we are setting the constructor to 0
      _denominator = 1;// we are setting the constructor to 1
    }
  }

  // getNumerator
  // return the current _numerator value
    public int getNumerator()
    {
      return this._numerator;
    }

    public int getDenominator()
    {
      return this._denominator;
    }

  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return (this._numerator + "/" + this._denominator);
    //return " "; // dummy code
    /* YOUR ELEGANT CODE HERE */
  }


  // floatValue
  // returns floating point approximation of the number - floating point is a decimal number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (1.0*(double)_numerator/_denominator);//type-casting by changing one number to a double. (double) is the code to type-cast!
    //return 1.0; // dummy code
    /* YOUR ELEGANT CODE HERE */
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */

    //This is Josh, just one hint. Since _numerator is private
    //this may not work politely. We need to make a "getter"
    //method that will help us out and "get" _numerator and
    //_denominator!
    this._numerator *= r.getNumerator();
    this._denominator *= r.getDenominator();
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */
    if (r._numerator != 0)
    {
      this._numerator *= r.getDenominator();
      this._denominator *= r.getNumerator();
    }
    else
    {
      System.out.println();
    }
  }

}//end class