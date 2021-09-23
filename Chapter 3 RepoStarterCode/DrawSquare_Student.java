


import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare_Student
{
public static void main(String[] args)
{
	Random gen = new Random();
	StandardPen pen = new StandardPen();

	// pen jumps to center of the graphics window
	//without drawing and points north
	pen.home();

	//draw with pen
	pen.setColor(Color.black);
	pen.move(130);
	pen.turn(90);
	pen.move(130);
	pen.turn(90);
	pen.move(130);
	pen.turn(90);
	pen.move(130);
	
	pen.turn(60);
	pen.move(150);
	pen.turn(60);
	pen.move(150);
	pen.turn(60);
	pen.move(150);
	pen.turn(60);
	pen.move(150);
	pen.turn(60);
	pen.move(150);
	pen.turn(60);
	pen.move(150);
	
	
	pen.home();
	pen.setColor(Color.blue);
	pen.turn(60);
	pen.move(50);
	pen.turn(60);
	pen.move(50);
	pen.turn(60);
	
	
	
	


	//pick up pen

	// move back home

	//turn the pen

	//draw with pen



}
}