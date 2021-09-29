
/**
 * Asks user for weight, and a planet choice, outputs weight on that planet
 *
 * Declan Doolin
 * 9/28/2021
 */
import java.util.*;
import java.text.*;
public class Planet_Program
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        int choice;
        DecimalFormat form = new DecimalFormat("0.00");
        System.out.print("What is your weight?");
        double weight = Keyboard.nextDouble();
        String planet = new String();
        
       // creates menu for user
        System.out.println("Please choose a planet/moon:");
        System.out.println("Moon: 1");
        System.out.println("Jupiter: 2");
        System.out.println("Mars: 3");
        System.out.println("Saturn: 4");
        System.out.println("Uranus: 5");
        System.out.println("Venus: 6");
        System.out.println("Mercury: 7");
        System.out.println("Neptune: 8");
        System.out.println("Pluto: 9");
        
        
        
        
        choice = Keyboard.nextInt();
        //Establishes switch, calculates weight for each planet
        switch(choice)
        {
            case 1:
                weight = (weight * .166);
                planet = "Moon";
                break;
            case 2:
                weight = (weight * 2.36);
                planet = "Jupiter";
                break;
            case 3:
                weight = (weight * .377);
                planet = "Mars";
                break;
            case 4:
                weight = (weight * .916);
                planet = "Saturn";
                break;
            case 5:
                weight = (weight * .889);
                planet = "Uranus";
                break;
            case 6:
                weight = (weight * .907);
                planet = "Venus";
                break;
            case 7:
                weight = (weight * .378);
                planet = "Mercury";
                break;
            case 8:
                weight = (weight * 1.12);
                planet = "Neptune";
                break;
            case 9:
                weight = (weight * .071);
                planet = "Pluto";
                break;
                
                
                
            default:
                System.out.println("Not a valid input");
        
            }
            System.out.println("Your weight on the " + planet + " is "+form.format(weight)+ "pounds");
            
    }
}
