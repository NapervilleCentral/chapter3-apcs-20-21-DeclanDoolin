
/**
 * Asks the user for their yearly income, calculates and prints tax
 *
 * Declan Doolin
 * 9/29/2021 */
import java.util.*;
public class Taxes
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your yearly income?");
        double income = in.nextDouble();
        double tax = 0.00;
        
        //Creates if statement, calculates the tax depending on level of income
        if (income < 50000.00){
            tax = (income*.01);
        }
        if (income >= 50000.00){
            tax = ((income-50000.00)*.02) + (50000.00 * .01);
        }      
        if (income >= 75000.00){
            tax = ((income-75000.00)*.03) + (25000.00 * .02) + (50000.00 * .01);
        }
        if (income >= 100000.00){
            tax = ((income-100000.00)*.04) + (25000.00 * .03) + (25000.00 *.02) + (50000.00 * .01);
        }
        if (income >= 250000.00){
            tax = ((income-250000.00)*.05) + (150000.00 * .04) + (25000.00 * .03) + (25000.00 *.02) + (50000.00 *.01);
        }
        if (income >= 500000.00){
            tax = ((income-500000.00) * .06) + (250000.00 * .05) + (150000.00 * .04) + (25000.00 * .03) + (25000.00 * .02) + (50000.00 *.01);
        }
        
        //Prints yearly income, and corresponding tax
        System.out.println("Income of "+income);
        System.out.println("Tax:" +tax);
        System.out.println("Expected: " + tax);
            
        
    
    }
}
