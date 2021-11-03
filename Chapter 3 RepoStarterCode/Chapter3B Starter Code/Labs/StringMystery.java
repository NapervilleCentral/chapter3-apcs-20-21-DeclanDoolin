package Labs;


/**
 * Finds if adjecent numbers are matching, adds them if true, also finds if pairs are matching, adds them if true.
 *
 * Declan Doolin
 * 11/2/2021
 */
import java.util.*;
import java.io.*;
public class StringMystery
{
    public static void main(String[] args)throws IOException{
        Scanner mys = new Scanner (new File("labs/String Mystery input.txt"));
        String file = mys.nextLine();
        int start = Integer.parseInt(file.substring(0, 1)); //Finds first number
        int finalnum = Integer.parseInt(file.substring(2195, 2196));//Finds seconds number
        int totalval = 0;
        int present;
        int second;
        int j = file.length()-1;
        int k = j/2;
        if (finalnum == start){
            totalval += finalnum;//If the first and last are equal, adds those together
        }         
        for(int i=0;i<file.length()-1;i++){
             present = Integer.parseInt(file.substring(i, i+1));//creates current number
             second = Integer.parseInt(file.substring(i+1, i+2));//creates second number
             if (present == second){
                    totalval = (totalval + second);//if present and second are equal, adds
                }
            }
        System.out.println(totalval);
        for(int i=0;i<(file.length()-1)/2;i++){
            present = Integer.parseInt(file.substring(i, i+1));//First number
            second = Integer.parseInt(file.substring(i+k, i+(k+1)));//Total/2+1,continues as present continues
            if (present == second){
                totalval = (totalval +second);//if equal, adds together
            }
            }
        System.out.println(totalval);
        }
        }
        
    
    


        
                
           

        
        
        
        

    

