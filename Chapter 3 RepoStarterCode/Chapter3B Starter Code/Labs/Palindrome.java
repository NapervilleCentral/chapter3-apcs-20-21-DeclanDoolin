package Labs;


/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Palindrome
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = in.nextLine();
        int length = input.length();        
        String normal = "";
        String reversed = "";
        if (input != ""){
            for (int i = 0; i < (length+1); i++){
                if (input.charAt(length-1) == i)
                    reversed = "yes"; 
            if (reversed == "yes")
                System.out.println("Palindrome!");
                   
                
                
                 
                
                
                
            }
                
            
             
            
                
                
        }
        else{
            System.out.println("Please enter a string");
        }
           
        
        
        
    }
}
