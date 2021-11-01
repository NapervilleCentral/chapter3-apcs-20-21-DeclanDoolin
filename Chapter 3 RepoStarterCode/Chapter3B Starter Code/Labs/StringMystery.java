package Labs;


/**
 * Write a description of class StringMystery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class StringMystery
{
    public static void main(String[] args)throws IOException{
        Scanner mys = new Scanner (new File("labs/String Mystery input.txt"));
        String file = mys.nextLine();
        int j = file.length()-1;
        int start = Integer.parseInt(file.substring(0, 1));
        int finalnum = Integer.parseInt(file.substring(2195, 2196));
        int totalval = 0;
        int i = 0;
        int present;
        int second;
        if (finalnum == start){
            totalval += finalnum;
        }
        for(i=0;i<file.length()-1;i++){
                present = Integer.parseInt(file.substring(i, i+1));
                second = Integer.parseInt(file.substring((j+i)/2, ((j+i)/2))+1);
                if (present == second){
                    totalval += second;
                }
                }
        
        System.out.println(totalval);    
            
            
            
        }
        
        
        
        
    }

