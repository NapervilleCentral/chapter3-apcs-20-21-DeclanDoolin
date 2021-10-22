package Labs;


/**
 * Checks to see how many times the switching strategy works
 *
 * Declan Doolin
 * 10/22/2021
 */
import java.util.*;
public class Montyhall
{
    public static void main(String[] args){
        int s1 = 0;
        int s2 = 0;
        Random rand = new Random();   //establishes random class   
        for(int i = 0; i < 1000; i++){ //creates a loop to run the program 1000 times
            int userdoor = rand.nextInt(3);//Creates a random door that the user chooses
            int cardoor = rand.nextInt(3);//creates a random door that the car is behind
            if (userdoor == cardoor){//If the user's door is the car, S2 gets a point
                s2++;
            }
            if (userdoor != cardoor){//if the user's door is not the same door, s1 gets a point
                s1++;
            }
        }
            
        System.out.println("Strategy 1 worked "+s1+"times.");
        System.out.println("Strategy 2 worked "+s2+"times.");
                
            
            
        
            
        
        
        
    }
}
