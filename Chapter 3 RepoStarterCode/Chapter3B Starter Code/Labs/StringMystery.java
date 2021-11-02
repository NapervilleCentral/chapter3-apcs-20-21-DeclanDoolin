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
        int start = Integer.parseInt(file.substring(0, 1));
        int finalnum = Integer.parseInt(file.substring(2195, 2196));
        int totalval = 0;
        int present;
        int second;
        int k = 0;
        if (finalnum == start){
            totalval += finalnum;
        }
        for(int i=0;i<file.length()-1;i++){
                present = Integer.parseInt(file.substring(i, i+1));
                second = Integer.parseInt(file.substring(i+1, i+2));
                if (present == second){
                    totalval += second;
                }
            }
        System.out.println(totalval);
        for(int i=0, j=0; i<file.length()-1;i++,j++){
            present = Integer.parseInt(file.substring(((file.length()-1)/2-j), j));
        }
        }
    }
                
                
           
  
    

