package Labs;


/**
 * Write a description of class Drunkwalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import TurtleGraphics.StandardPen;
public class Drunkwalk
{
    public static void main(String[] args){
        Random ran = new Random();
        StandardPen pen = new StandardPen();
        for (int i = 0; i <1000; i++){
            int x = ran.nextInt(4);
            if (x == 1){
                pen.turn(90);
                pen.move(10);
            }
            if (x==2){
                pen.move(10);
            }
            if (x == 3){
                pen.turn(-90);
                pen.move(10);
            }
            if (x == 4){
                pen.turn(180);
                pen.move(10);
            }
            
        }
            
        
    }
}
