/*********************
*Saxxon Whitaker 
*Counter Program
*Last Edited 1/26/2018
*********************/

import java.util.Scanner;

//class
public class Counter_Program{
   //main
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      //init vars
      int start = 0;
      int end = 0;
      int counting = 0;
      //greet user
      System.out.println("Welcome to the counter program!");
      System.out.println("I will ask what you wnat to count by,");
      System.out.println("when to start and when to end.");
      //prompt for starting input
      System.out.println();
      System.out.println("What do you want your starting value to be ");
      //save input
      start = input.nextInt();
      //prompt for input
      System.out.println();
      System.out.println("What do you want your ending value to be ");
      //save input
      end = input.nextInt();
      //prompt for input
      System.out.println();
      System.out.println("What do you want me to count by ");
      //save input
      counting = input.nextInt();
      //call counter method
      Counter_Program.counter(start, end, counting);
      
   }//end main function
   //start counter function
      public static int counter(int start, int end, int counting){
      //for
        for(int i=start; end>=i; i+=counting){
         System.out.println(i);
         }//end for loop
      return counting;
      }//end counter fuction
}//end class Counter Program