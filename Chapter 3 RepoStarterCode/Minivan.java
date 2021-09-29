
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
        String right = "Closed";
        String left = "Closed";
        
        if (input.charAt(3) == 1 && input.charAt(8) == 'P') {      
            if (input.charAt(0) == 1){
                 left = "Opens";
            }
            else if (input.charAt(1) == 1){
                right = "Opens";
            }
            else if (input.charAt(2) == 0){
                if (input.charAt(4) == 1)
                    left = "Opens";
                if (input.charAt(5) == 1)
                    right = "Opens";
            }
            else if (input.charAt(6) == 1){
                left = "Opens";
            }
            else if (input.charAt(7) == 1){
                left = "Opens";
            } 
            System.out.println("The left door "+left);
            System.out.println("The right door "+right );
        }    
        else{
            System.out.print("Both doors stay closed");
        }
        
     
            
            
            
            
            
            
    }       
            
            
}            
            
               
        
    
