package Labs;


/**
 * Draws a four leaf rose
 *
 * Declan Doolin
 * 10/27/2021
 */

import java.util.*;
import TurtleGraphics.StandardPen;
public class FourLeafRose
{
    public static void main(String[] args)
    {
        StandardPen pen = new StandardPen();
        pen.home();
        int maximum = 100;
        for (int i = 0; i <= 100; i++){
            double theta = i * 2 * Math.PI / maximum;
            double r = Math.cos(2*theta);
            double x = 100 * r * Math.cos(theta);
            double y = 100 * r * Math.sin(theta); //creates x and y based on the equation
            
            pen.move(x,y); //draws rose   
            
                 //draws rose   
            
            }
        }
        
        
    }

