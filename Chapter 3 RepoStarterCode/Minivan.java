
/**
 * takes a sequence, calculates if the doors can open
 *
 * Declan Doolin
 * 9/30/2021
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
        //calculates if all parts allow each door to open
        if (input.charAt(3) == '1' && input.charAt(8) == 'P') {      
            if (input.charAt(0) == '1'){
                 left = "Opens";
            }
            if (input.charAt(1) == '1'){
                right = "Opens";
            }
            if (input.charAt(2) == '0'){
                if (input.charAt(4) == '1')
                    left = "Opens";
                if (input.charAt(5) == '1')
                    right = "Opens";
            }
            if (input.charAt(6) == '1'){
                left = "Opens";
            }
            if (input.charAt(7) == '1'){
                right = "Opens";
            } 
            System.out.println("The left door "+left);
            System.out.println("The right door "+right );
        }
        //If car is not in park or master unlock is not on, doors cannot open
        else{
            System.out.print("Both doors stay closed");
        }
        
                                         
                                   
    }       
            
            
}            
            
               
        
    
