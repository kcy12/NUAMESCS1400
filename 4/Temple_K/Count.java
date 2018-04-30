/********************
*Kyler Temple
*Counter Program in Java
*
*Last Edited 1/25/18
*******************/

import java.util.Scanner;
//class
public class Count
   {
   //main
   public static void main(String[] args)
      {
      //create scanner object
      Scanner in = new Scanner(System.in);
      //initialize variables
      int start = 0;
      int end = 0;
      int increment = 0;
      //greet user
      System.out.println("Welcome to the Counter Program!");
      //prompt for values
      //then save the values
      System.out.println("What number should I start at: ");
         start = in.nextInt();
      System.out.println("What number should I end at: ");
         end = in.nextInt();
      System.out.println("What number should I count by: ");
         increment = in.nextInt();
      
      //call counting method
      public static int counting(start , end , increment)
         {
         for(int i = start; i <= end; i+= increment);
         
         }//end of ocunting method
      }//end main
   
   }// end count class
   
   //counting method
      //for loop
      //    for(int i = startvalue;while i<=ending point;i+=theincrementtocountby)
      //       {
      //       }
         //print the count
//expected output
//welcome to counter program
//what number should i start at 1
//what number should i end at 10
//what should i count by 1
// ...numbers....