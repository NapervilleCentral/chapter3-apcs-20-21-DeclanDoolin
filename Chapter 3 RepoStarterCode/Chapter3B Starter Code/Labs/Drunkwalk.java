package Labs;


/**
 * Will create a pattern similar to a drunken walker
 *
 * Declan Doolin
 * 11/1/2021
 */
import java.awt.*;
import java.util.*;
import TurtleGraphics.StandardPen;
public class Drunkwalk
{
    public static void main(String[] args){
        Random ran = new Random();
        StandardPen pen = new StandardPen();
        for (int i = 0; i <100000; i++){//Runs the loop 100000 times
            int x = ran.nextInt(4);//generates a random value 1-4
            if (x == 1){//if 1, pen moves 90 to the right
                pen.turn(90);
                pen.move(10);
            }
            if (x==2){//if 2, pen goes straight
                pen.move(10);
            }
            if (x == 3){///if 3, pen moves to the left
                pen.turn(-90);
                pen.move(10);
            }
            if (x == 4){//if 4, pen turns around
                pen.turn(180);
                pen.move(10);
            }
            
        }
            
        
    }
}
