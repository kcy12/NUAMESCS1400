/****************************
*Julia Ludlow
*8th Period
*Counter Program
*Last Edited 1-30-18 (Had to do it later because I didn't understand till now)
****************************/

import java.util.Scanner;

//class
public class CounterProgram{
   
   //main
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //init vars
      int start = 0;
      int end = 0;
      int countBy = 0;

      //greet the user
      System.out.println("Welcome to the number counter!");
      System.out.println("Please give me a starting number, an ending number, and how much I shall count by");
      
      //prompts for input x3
         //starting input
         System.out.println();
         System.out.println("What number would you like me to start at? ");
            //save input
            start = input.nextInt();
         //ending input
         System.out.println("What number would you like me to end at? ");
            //save input
            end = input.nextInt();
         //count_by input
         System.out.println("How much would you like me to count by? ");
            //save input
            countBy = input.nextInt();
            System.out.println();
            
      //call counter method
      CounterProgram.counter(start, end, countBy);
      
   }//end main function
   //counter
      public static int counter(int start, int end, int count_by){
      
      //for
      for(int i=start; end>i; i+=count_by){
      System.out.println(i);
      
      }//end counter
      return start;
   }     
  }//end class Counter Program