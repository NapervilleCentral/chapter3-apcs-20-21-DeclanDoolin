
/**
 * Write a description of class Planet_Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Planet_Program
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        char choice;
        System.out.print("What is your weight?");
        double weight = Keyboard.nextDouble();
        
       
        System.out.println("Please choose a planet/moon:");
        System.out.println("Moon: 1");
        System.out.println("Jupiter: 2");
        System.out.println("Mars: 3");
        System.out.println("Saturn: 4");
        System.out.println("Uranus: 5");
        System.out.println("Venus: 6");
        System.out.println("Mercury: 7");
        System.out.println("Neptune: 8");
        
        choice = Keyboard.next().charAt(0);
        
        switch(choice)
        {
            case '1':
                weight = (weight * .166);
                System.out.println("Your weight on the moon is: " + weight);
                break;
            case '2':
                weight = (weight * 2.36);
                System.out.println("Your weight on Jupiter is: " +weight);
                break;
            case '3':
                weight = (weight * .377);
                System.out.println("Your weight on Mars is: " +weight);
                break;
            case '4':
                weight = (weight * .916);
                System.out.println("Your weight on Saturn is: "+weight);
                break;
            case '5':
                weight = (weight * .889);
                System.out.println("Your weight on Uranus is: "+weight);
                break;
            case '6':
                weight = (weight * .907);
                System.out.println("Your weight on Venus is: "+weight);
                break;
            case '7':
                weight = (weight * .378);
                System.out.println("Your weight on Mercury is : "+weight);
                break;
            case '8':
                weight = (weight * 1.12);
                System.out.println("Your weight on Mercury is :"+weight);
                break;
            default:
                System.out.println("Not a valid input");
        
            }
    }
}
