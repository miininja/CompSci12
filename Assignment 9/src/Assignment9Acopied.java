import java.util.*;
class Assignment9Acopied
{
//----------------------------------- main method ----------------------------------------------------
   public static  void main ( String[]   args)			
  {
    //Scanner input = new Scanner (System.in);
    double x,y,result;    
    x=get();   
    y=get();   
    result=add(x,y);
    print(x,y,result,"sum");
    result=subtract(x,y);
    print(x,y,result,"difference");
    result=multiply(x,y);
    print(x,y,result,"product");
    result=divide(x,y);
    print(x,y,result,"quotient");
  }
/** Get a number from the user
 *  Returns the number to the main method
 */
  public static  double get( )
  { Scanner input = new Scanner (System.in);
    double number;
    System.out.println("Type in a number");
    number=input.nextDouble(); 
    return(number);    
   }
// Add two numbers
  public static  double add(double a, double b )
  {
    double sum;
    sum=a+b;	
    return(sum);
   }
// Divide two numbers
  public static  double divide(double a, double b )
  {
    double quotient;
    quotient=a/b;
    return(quotient);  
   }
  public static  double subtract(double a, double b )
  {
    double difference;
    difference=a-b;
    return(difference);  
   }
  public static  double multiply(double a, double b )
  {
    double product;
    product=a*b;
    return(product);  
   }
// Print answers
 public static  void print(double a, double b, double answer, String word )
  {
    System.out.println("The "+word+" of "+a+" and "+b+" is "+answer);	    
   }

}
