/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;       //for File IO

public class ch3notes
{
    Integer one = 1;
    enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo}
    enum Grades {A,B,C,D,F}
    enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}

      public static void main (String [] args) throws IOException // required for File IO
   {
       //enum whatever(1,3,5,7,9); must be declared outside of main
       Scanner Keyboard = new Scanner(System.in);
       DecimalFormat fmt = new DecimalFormat ("0.###");
       Integer two = 2;

       Grades mygrade = Grades.F;
       Grades yourgrade = Grades.A;
       
       Week today = Week.Tuesday;
       Week realtoday = Week.Thursday;
       System.out.println(today.compareTo(realtoday));
       
       System.out.println(yourgrade.compareTo( mygrade) );
       String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                          "Thomas", "Charlie",
                          "heinz doofenshmirtz", "Michael",
                          "NoOne", "Bueller","Justin","David"};
       // enter numbers until user enters q
       String number;
       int num, total = 0;
       for (int i = 0; 1<5; i++){
       System.out.println("Enter a number");
       number = Keyboard.next(); //*5*
       num = Integer.parseInt(number);//converts "5" to int
    }
       
        /*
        System.out.println("You scedule is:");
        // new for loop to use with iterators
        //foreach loop
        for (Classes period: Classes.values())
            System.out.println(period);

        System.out.println("Your class roster is:");
        for(String student: people)
            System.out.println(student);




/*    int wordCount = 0, characterCount = 0;
             String line, word;
             StringTokenizer tokenizer;

             System.out.println ("Please enter text");

             line = Keyboard.readString();

                tokenizer = new StringTokenizer (line,"/");


        x = Integer.parseInt(input);
        System.out.print(x);





/* WHAT WILL OUTPUT?
    int k =0, j=0;

    System.out.println("k \tj");

    for(j=0; j<20; j+=k)
    {
        k++;
        System.out.println(k + "\t" + j);
    }

    System.out.println("After the loop \n k= " +k +"\tj= " +j);


/**/
    // Scanner file i/o defaults at the space
    // Scanner is an iterator 
    // absolute path is the direct link
    // relative path, the folder must be in the same DIR as this file
    Scanner scanFile = new Scanner(new File("speeches\\people.txt"));
    Scanner scanFile2 = new Scanner(new File("data/Debate12016.txt"));
    /*
    String name, address, phone;

    while(scanFile.hasNext())
    {
        name = scanFile.next();// up to the space, nextLine() reads until the \n
        address = scanFile.next();
        phone = scanFile.next();

        System.out.println(name + "---"+ phone);

    }
    /*
    String word;
    int total = 0;
     while(scanFile2.hasNext()) //hasNext until no more tokens
    {
        word = scanFile2.next();
        System.out.println(word);
        
        if (word.equals("ISIS"))
            total ++;

    }
    System.out.println("ISIS was said "+total);                                    








/**/


    //Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));

    //Scanner scanFile = new Scanner
    //  (new File ("data\\obamatakebackamerica.txt"));
    //Scanner scanFile = new Scanner
    //(new File ("data\\Debate12016.txt"));
    //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));

/*
    String word;
    int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;

    while ()
    {


        //count_words ++;

        //System.out.println(word  );



    }//end of while


//_______________________basic for and scope of i________________________
/*
        int i;
        //ini happens once
        //middle first things that happen in our loop
        //body 2nd thing that happens
        //last
        // ini          test     inc
    for(int i = 0 ; i < 20 ; i++ ) // emtpy is stalid valid
    {
        System.out.print("Hi" + i + "\n");
    }

    //System.out.print("After the Loop" + i + "\n"); //error- scope of I is in for loop

/*


//--- While loop and sentinel value

/*

    int test;
    System.out.println("Guess my favorite number \n" +
                            "it is between 1-20");
    test = Keyboard.nextInt();

    while (test != -9999)
    {
        if (test == 14)
            System.out.println
                ("it the age of my sons"+
                " Thomas and Charlie");
        else
            System.out.println("Guess again, or -9999 to end the program");

        test = Keyboard.nextInt();

    }



/*  int i =0;//#1 initialize

        while (true)//#2 have in condition
        {
            System.out.print( "i =" + i +"\n");
            i++;//#3 update
        }





/*  */

   }// end of main

}// end of class









