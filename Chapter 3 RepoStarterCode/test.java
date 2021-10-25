
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;

public class test
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rdm = new Random();
        
        System.out.println("Please enter a number");
        
        int num = keyboard.nextInt();
        int total = 0;
        
        total = (num + rdm.nextInt(9));
        
        System.out.print(total);
        
    
        
        
        
        
        
    
    
    }
}
