package e15;

import java.util.Scanner;
/**
   This program calculates the season for a given month and day.
*/
public class SeasonsDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter a date (month and day): " );
      int month = in.nextInt();
      int day = in.nextInt();
      String season = new String();
      //only used of writing class
      //Date date = new Date(month, day);
      if (month == 3 && day == 20 || month == 4 || month == 5 || month == 6 && 
      day == 20)
        season = "Spring";
      if (month == 6 && day == 21 || month == 7 || month == 8 || month == 9 && 
      day == 21)
        season = "Summer";
      if (month == 9 && day == 22 || month == 10 || month == 11 ||
      month == 12 && day == 20)
        season = "Fall";
      if (month == 12 && day == 21 || month == 1 || month == 2 || month
       == 3 && day == 19)
        season = "Winter";
        

      //. . .  your code here
      System.out.println("Season: " + season);
   }
}
