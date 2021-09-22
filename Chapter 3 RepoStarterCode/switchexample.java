import java.util.Scanner;
public class switchexample
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            
            char choice; 
            


       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");
            
            
            choice = Keyboard.next().charAt(0);
            
            
            //switch can use char, int, String, cannot use a boolean,  double
            
            // find the true statement and then cascade down
            switch(choice)
            {
                case 'f':
                    System.out.print(".99");
                    break;
                case 'c':
                    System.out.print("1.50");
                    break;
                case 's':
                    System.out.print(".79");
                    break;
                    
                    
                default://replaces else
                    System.out.print("Error on input");
                }
                
            
            
            
            
            
               
         
            
            
            
            
            
            
       




    }//endo of main

}//end of class