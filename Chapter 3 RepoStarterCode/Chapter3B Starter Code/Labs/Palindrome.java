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
        String space = input.replace(" ", "");
        int j = space.length()-1;  //inputs a string, finds length     
        int pal = 1;
        for(int i = 0;i<(space.length()/2);i++,j--){
            if (space.charAt(i) != space.charAt(j)){
                pal = 2;
            }
                //if the chars are on the same as their matching char, not a palindrome
            }
        if (pal == 1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }     
        }
    
    
    

                    
                
                
                
                    
                    
            
        
    
                
            
             
            
                
                
        
