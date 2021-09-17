package e21;

import java.util.Scanner;

/**
   This program sorts three strings.
*/
public class StringSorterDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String small = "", middle = "",large = "";

      System.out.print("Please enter three strings:");
      String str1 = in.next();
      String str2 = in.next();
      String str3 = in.next();
      
      int result1 = str1.compareTo(str2);
      int result2 = str1.compareTo(str3);
      int result3 = str2.compareTo(str3);
      int result4 = str3.compareTo(str2);
      
      
      if (result1 > 0 && result2 > 0){
        large = str1;
        middle = str2;
        small = str3;
    }
      if (result3 > 0 && result1 < 0){
        large = str2;
        middle = str1;
        small = str3;
    }
      if (result3 < 0 && result1 < 0){
        large = str3;
        middle = str2;
        small = str1;
    }
   
      

    

      System.out.println("Smallest is"+ small + "\n"
      + "In the Middle is" + middle+ "\n"
      + "The Largest is" + large);



   }
}
