package Labs;


/**
 * Write a description of class Spiral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import TurtleGraphics.StandardPen;
public class Spiral
{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        int length = 5;
        for (int i = 0; i < 1000; i++){
            pen.setColor(Color.blue);
            pen.turn(90);
            pen.move(length);
            length += 4;
     
        }
        
    }
}
