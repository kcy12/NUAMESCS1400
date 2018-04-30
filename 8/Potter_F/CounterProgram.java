/****************************
*Faith Potter
*Counter Program
*Last Edited 1-26-18
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
      int count_by = 0;

      //greet the user
      System.out.println("Welcome to your own personal number counter!");
      System.out.println("Please give me a starting number, an ending number, and how much I should count by");
      
      //prompts for input x3
         //starting input
         System.out.println();
         System.out.println("What number would you like me to start with? ");
            //save input
            start = input.nextInt();
         //ending input
         System.out.println("What number would you like me to end with? ");
            //save input
            end = input.nextInt();
         //count_by input
         System.out.println("Finally, how much would you like me to count by? ");
            //save input
            count_by = input.nextInt();
            System.out.println();
            
      //call counter method
      CounterProgram.counter(start, end, count_by);
      
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