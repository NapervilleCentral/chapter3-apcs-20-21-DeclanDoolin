package e02;

public class SumSquares
{
   public static void main(String[] args)
   {
      int sum = 0;
      // The sum of all squares between 1 and 100
      for (int i = 0; i <= 3; i++)
      {
          sum+= Math.pow(2,i);
        }

      // Output the result
      System.out.println("The sum is " + sum);
   }
}
