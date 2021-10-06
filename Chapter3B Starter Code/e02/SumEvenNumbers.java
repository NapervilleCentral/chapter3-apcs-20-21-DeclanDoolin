package e02;

public class SumEvenNumbers
{
   public static void main(String[] args)
   {
      int sum = 0;
      // The sum of all even numbers between 2 and 100
      for (int i =2; i<=100; i+=2)
      {
          sum += i;

        }
      

      // Output the result
      System.out.println(sum);

   }
}