package Labs;


/**
 * Outputs the sequence using the users limit
 *
 * Declan Doolin
 * 11/1/2021
 */
import java.util.*;
public class Fibonacci
{
    public static void main (String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("How many numbers would you like?: ");
        int limit = k.nextInt();//Stops running when k is hit
        int a = 0;
        int b = 1;
        int newint = 0;
        for (int i = 0; i <= limit; i++){
            newint = b;//Shifts the new integer up one to add and create sequence
            b = (b+a);//b becomes the total of the previous 2
            a = newint;
            System.out.print(a + " ");
        }
    }
}
