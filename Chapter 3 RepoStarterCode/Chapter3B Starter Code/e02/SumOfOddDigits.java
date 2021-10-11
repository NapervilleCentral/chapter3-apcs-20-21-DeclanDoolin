package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number: (type q to end)");      
      double sum = 0;
      String input = in.next();
      double num;
      
      while (! input.equals("q"))
      {
          num = Double.parseDouble(input);
          if (num%2!=(0))
            sum += num;
          input = in.next();
        }
      System.out.println("Sum is equal to:"+sum);
      

      // Get the input

      // The sum of odd digits of the input

         // Only add digit if it is odd


      // Output the result

   }
}
