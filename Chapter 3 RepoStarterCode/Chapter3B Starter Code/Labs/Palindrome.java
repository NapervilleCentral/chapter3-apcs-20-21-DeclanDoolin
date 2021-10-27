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
        while (input != ""){
            if (input.charAt(0) != input.charAt(length-1)){//if the first letter is not the same as last, cannot be palindrome
                    System.out.println("Not a palindrome");
                }
            else{
                for (int i = 0, j = (length-1); i < j; i++){
                    if (input.charAt(i) == input.charAt(length-i)){
                        System.out.println(input + "is a palindrome ");
                    }
                        
                  }
                }
        }
    
    }
}//tests each character with its matching character until they meet
                    
                
                
                //if (input.charAt(length-i) == input.charAt((length-i))){
                        //System.out.println("Palindrome!");   
                    
                    
            
        
    
                
            
             
            
                
                
        
