
/**
 * Write a description of class StringDigits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StringDigits
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = in.nextLine();
        int n = 100;
        String digits = "";
        for (int i = 0; i < n; i++){
            if ((input.charAt(i) >= '0')&&(input.charAt(i) <= '9')){
                digits = "All digits";
            }
            else{
                digits = "Not all digits";
            }
        }
        System.out.println(digits);
                
                
                
                
        
    }    
}

