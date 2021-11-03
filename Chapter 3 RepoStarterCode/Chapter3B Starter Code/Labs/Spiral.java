package Labs;


/**
 * Draws a square spiral
 *
 * Declan Doolin
 * 11/1/2021
 */
import java.awt.*;
import TurtleGraphics.StandardPen;
public class Spiral
{
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        int length = 5;
        for (int i = 0; i < 100; i++){//runs 100 times
            pen.setColor(Color.blue);
            pen.turn(90);
            pen.move(length);
            length += 4;//length gets expoentially bigger
     
        }
        
    }
}
