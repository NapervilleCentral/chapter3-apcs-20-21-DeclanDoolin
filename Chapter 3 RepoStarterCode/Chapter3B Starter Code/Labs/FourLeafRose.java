package Labs;


/**
 * Write a description of class FourLeafRose here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import TurtleGraphics.StandardPen;
public class FourLeafRose
{
    public static void main(String[] args)
    {
        StandardPen pen = new StandardPen();
        int maximum = 100;
        for (int i = 0; i <= 100; i++){
            double theta = i * 2 * Math.PI / maximum;
            double r = Math.cos(2*theta);
            double x = 100 * r * Math.cos(theta) + 200;
            double y = 100 * r * Math.sin(theta) + 200;
            if (i == 0){
                pen.move(x,y);       
            }
            else{
                pen.move(x,y);
            }
            }
        }
        
        
    }

