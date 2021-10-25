
/**
 * Write a description of class Mexico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mexico
{
    public static void main(String[] args){
       double pop = 89.2;
       int year = 1990;
       while (pop <= 120){
           pop = (pop+(pop*.23));
           year += 1;
           if (pop == 120){
               System.out.println("The population of mexico reaches "+pop+"in "+year);
       }   
     }
    }
}
    
    

