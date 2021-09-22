
/**
 * Asks for angles or sides, and figures out if the triangle is right, scalene, isosceles, or equilateral
 *
 * Declan Doolin
 * 9/22/2021
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to input angles or sides? (1 or 2)");
        int input = in.nextInt();
       // Checks if user wants angles
        if (input == 1){
            System.out.println("Please enter 3 angles: ");
            double angle1 = in.nextDouble();
            double angle2 = in.nextDouble();
            double angle3 = in.nextDouble();
            // calculates if triangle is a right triangle, and if it is isosceles or equilateral
            if (angle1 == 90 || angle2 == 90 || angle3 == 90)
                System.out.println("Right Triangle.");
            if (angle1 == angle2&&angle1!=angle3||angle1==angle3&&angle1!=angle2||angle2==angle3&&angle2!=angle1)
                System.out.println("Isosceles Triangle.");
            if (angle1 == angle2 && angle1 == angle3)
                System.out.println("Equilateral Triangle.");
                
            
            }
      
  // checks if user wants sides
        if  (input == 2){
            System.out.println("Please enter 3 sides: ");
            int side1 = in.nextInt();
            int side2 = in.nextInt();
            int side3 = in.nextInt();
            // Calculates if sides are equilateral, isosceles, or scalene
            if (side1 == side2 && side2 == side3)
                System.out.println("Equilateral Triangle");
            if ((side1 == side2 && side2 != side3|| (side1 != side2 && side2 == side3 || side1 == side3 && side2!=side3)))
                System.out.println("isosceles");
            if (side1 != side2 && side2 != side3)
                System.out.print("Scalene");
            if (side1+side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
                System.out.print("Not a triangle!");
            
            }
            
            
       
            
    
        
        
        
        
        
    }
}
