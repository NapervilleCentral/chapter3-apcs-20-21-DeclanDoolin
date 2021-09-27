
/**
 * Write a description of class Minivan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Minivan
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the sequence: ");
        String input = keyboard.nextLine();
        boolean right = false;
        boolean left = false;
        
        if (input.charAt(3) == 1 && input.charAt(8) == 'P'){
            if (input.charAt(1) == 1){
                right = true;
            }
            if (input.charAt(0) == 1){
                left = true;
            }
        }    
        else{
            System.out.print("Doors cannot open, car is not in park or master lock is on");
        }
     
            
            
            
            
            
            
    }       
            
            
}            
            
               
        
    
