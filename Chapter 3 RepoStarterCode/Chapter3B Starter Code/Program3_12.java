
/**
 * Write a description of class Program3_12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program3_12
{
    public static void main(String[] args){       
        for (int i = 0 ;i < 10;i++){
            int space = 10;
            
        
            while (space > i){
                System.out.print(" ");
                space ++;
            }
            
            while (space<i){
                System.out.print("*");
                space --;
            }
            System.out.println("");
        } 
            
        
    }
}
