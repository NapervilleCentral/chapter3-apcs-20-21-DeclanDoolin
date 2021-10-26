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
        if (input != ""){
            if (input.charAt(0) != input.charAt(length-1))
                    System.out.println("Not a palidrome");
            else
                for (int i = 0; i < (length - 1); i++)
                    if (input.charAt(i) == input.charAt((length-1))-i)
                        System.out.println("Palindrome!");   
            }
        }
    }
                
            
             
            
                
                
        
