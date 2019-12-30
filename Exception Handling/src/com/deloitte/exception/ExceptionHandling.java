package com.deloitte.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BufferedReader in= new BufferedReader(new InputStreamReader(System.in)); //for handling ioException
      int a,b;
      System.out.println("Enter values for a and b");
      try {
      a=Integer.parseInt(in.readLine());
      b=Integer.parseInt(in.readLine());
      double x=a/b;
      System.out.println("Result : "+x);
      }
      catch(IOException ex)
      {
    	  System.out.println("IO Exception occured");
      }
      catch(ArithmeticException ex)
      {
    	  System.out.println("Enter valid numbers");
      }
      catch(NumberFormatException ex)
      {
    	  System.out.println("Input should only be integers");
      }
      /* OR instead of all 3 catches, use single
       * catch(ArithmeticException | NumberFormatException | IOException ex)
       * {
       *   Sysout("Error Occurred : "+ex.getMessage());
       *  }
       */
      finally
      {
    	  System.out.println("Completed");
      }
	}

}
