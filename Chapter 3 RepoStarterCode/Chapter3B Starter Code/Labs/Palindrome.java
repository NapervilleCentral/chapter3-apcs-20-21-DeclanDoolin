package Labs;



/**
 * Allows user to input a string, displays if it is a palindrome
 *
 * Declan Doolin
 * 10/27/2021
 */
import java.util.*;
public class Palindrome
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = in.nextLine();
        int length = input.length();  //inputs a string, finds length     
        boolean pal = true;
        input = input.replaceAll("\\s","");//removes all spaces
        for(int i = 0;i<input.length()/2;i++){
            if (input.charAt(i) != input.charAt(input.length()-i-1)){//if the chars are on the same as their matching char, not a palindrome
                pal = false;
            }
        }
        if (pal)
            System.out.println("Palindrome!");
        else
            System.out.println("Not a palindrome");     
        }
    }
    
    

                    
                
                
                
                    
                    
            
        
    
                
            
             
            
                
                
        
