
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
        double tax = 0.0;
        double tax1 = 0.0;
        double tax2 = 0.0;
        double newincome = 0.0;
        
        //Creates if statement, calculates the tax depending on level of income
        if (income < 50000.0){            
            tax = (income*.01);
        }
        else if (income >= 50000.0 && income < 75000.0){
            newincome = (income - 50000.0);
            tax1 = (newincome*.02);
            tax2 = (income *.01);
            tax = (tax1+tax2);
        }      
        else if (income >= 75000.0 && income < 100000.0){
            newincome = (income - 75000.0);
            tax1 = (newincome*.03);
            tax2 = (income *.01);
            tax = (tax1+tax2);
        }
        else if (income >= 100000.0 && income < 250000.0){
            newincome = (income-100000.0);
            tax1 = (newincome*.04);
            if (newincome >= 100000.0){
                tax2 = (income*.04);
            }
            if (newincome >= 75000.0){
                tax2 = (income *.03);
            }
            if (newincome>= 50000.0){
                tax2 = (income *.02);
            }
            else{
                tax2 = (income *.01);
            }
            tax = (tax1+tax2);
        }
        else if (income >= 250000.0 && income < 500000.0){ 
            newincome = (income-250000.0);
            tax1 = (newincome*.05);            
            if (newincome >= 100000.0){
                tax2 = (income*.04);
            }
            if (newincome >= 75000.0){
                tax2 = (income *.03);
            }
            if (newincome>= 50000.0){
                tax2 = (income *.02);
            }
            else{
                tax2 = (income *.01);
            }
            tax = (tax1+tax2);
        }
        else{
            newincome = (income-500000.0);
            tax1 = (newincome*.06);
            if (newincome >= 500000.0){
                tax2 = (income *.06);
            }
            if (newincome >= 250000.0){
                tax2 = (income*.05);
            }
            if (newincome >= 100000.0){
                tax2 = (income*.04);
            }
            if (newincome >= 75000.0){
                tax2 = (income *.03);
            }
            if (newincome>= 50000.0){
                tax2 = (income *.02);
            }
            else{
                tax2 = (income *.01);
            }
            tax = (tax1+tax2);
        }
        
        
            
        //Prints yearly income, and corresponding tax
        System.out.println("Income of "+income);
        System.out.println("Tax:" +tax);
        System.out.println("Expected: " + tax);
            
        
    
    }
}
