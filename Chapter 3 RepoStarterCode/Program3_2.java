
/**
 * Write a description of class Program3_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Program3_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a date: ");
        int date = in.nextInt();
        
        if (date <= 1582)
            System.out.println("Not a valid year");
        if (date >= 1582)
         if (date%4 == 0)
            if (date%100 == 0)
                if (date%400 == 0)
                    System.out.println("Leap year!");
                else 
                    System.out.println("Not a leap year");
            else
                System.out.println("Not a leap year");
         else
            System.out.println("Not a leap year");
        
            
            
            
                
          
            
            
        
        
        
        
        
    }
}
        
      
   
