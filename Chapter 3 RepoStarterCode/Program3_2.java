
/**
 * Takes a inputted year, outputs if it is a leap year or not
 *
 * Declan Doolin
 * 9/20/2021
 */
import java.util.Scanner;
public class Program3_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a date: ");
        int date = in.nextInt();
        
        // Calculates if the year is above 1582, if it is divisible by 4,
        // and if the date is divisible by 100 but not 400.
        if (date <= 1582)
            System.out.println("Not a valid year");
        if (date >= 1582)
         if (date%4 == 0)
            if (date%100 == 0 && date% 400==0)
                System.out.println("This is a leap year!");
            else if (date%100==0)
                System.out.println("This is not a valid leapyear.");
            else
                System.out.println("This is a valid leapyear.");   
                
    }
}
        
      
   
