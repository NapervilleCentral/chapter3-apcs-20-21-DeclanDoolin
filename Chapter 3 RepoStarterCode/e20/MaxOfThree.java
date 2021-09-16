package e20;

import java.util.Scanner;
/**
 * Read three floating-point numbers and print
 * the largest of the three.
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter three numbers: ");
      double largest = 0.0;
      
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      
      if ( a > b && a > c)
       largest = a;
       
      if (b > a && b > c)
       largest = b;
      
      if (c > a && c > b)
       largest = c;
       
      if (a == b && a ==c)
       largest = a;
        
      
      
      // Place your work here
      
      
      
      
      
      
      
         
      System.out.println("The largest number is " + largest + ".");
   }
}
