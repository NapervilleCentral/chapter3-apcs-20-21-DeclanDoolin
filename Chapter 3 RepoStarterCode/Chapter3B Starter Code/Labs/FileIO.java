package Labs;


/**
 * Finds total words and number of times a certain word was said
 *
 * Declan Doolin
 * 11/2/2021 */
import java.util.*;
import java.io.*;
public class FileIO
{
    public static void main (String[] args)throws IOException{
        Scanner key = new Scanner(System.in);
        System.out.println("Input a file to run: ");//Allows user to enter a file
        String userFile = key.nextLine();
        System.out.println("Input a word to find: ");//Allows user to enter a specific word
        String userWord = key.nextLine();
        // Speeches: labs/George Washington first inaugural.txt 
        // labs/tjefferson.txt
        // labs/jfk.txt
        // labs/AJackson independence of Texas.txt
        Scanner scanFile = new Scanner(new File(userFile));
        int count = 0;
        int usercount = 0;
        while (scanFile.hasNext()){
            String x = scanFile.next();
            count = count + 1; //Will add 1 word every time the loop runs
            if (x.equals(userWord)){
                usercount += 1;//adds 1 word every time that the loop has the specific word
            }
         }
        System.out.println("Total words in file: " + count);
        System.out.println("Number of times " +userWord+"was said: "+usercount);
        }
     }
    

        
        
    
    

