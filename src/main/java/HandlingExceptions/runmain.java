
package HandlingExceptions;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
    
    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);
       
      try
      {
        int x=8 ,y=0;
        System.out.println(x/y);
      }
      catch(ArithmeticException ename)
      {
          System.out.println("Error, Devision by zero not allowed");
      }
      
      
//     
      int num1 ,num2;

      try
      {
          System.out.println("Enter two number for devision ....");
         num1=getInput.nextInt();
         num2=getInput.nextInt();
         System.out.println(num1/num2);
      }
      catch(ArithmeticException ename)
      {
          System.out.println("Error, Devision by zero not allowed");
      }
     catch(InputMismatchException ename)
       {
           System.out.println("Error, Please enter numeric values");
       }
//      
      
      try
      {
          int d = Integer.parseInt("fgf");
      }
      catch(Exception ename)
      {
          System.out.println("The following error occrred: " + ename.getMessage() );
      }
      
      
    }
    
}
