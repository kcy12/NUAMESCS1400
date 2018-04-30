/***************************
*Grant Arave
*Counter Program
*Last Edited: 1/26/18
***************************/

import java.util.Scanner;

//class
public class CounterProgram
{
   //main
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      //init vars
      int start = 0;
      int end = 0;
      int count = 0;
      //greet the user
      System.out.println("Welcome to the counter program");
      //prompt for input x3
      System.out.println("What is the starting number?: ");
      start = input.nextInt();
      System.out.println("What is the ending value?: ");
      end = input.nextInt();
      System.out.println("What is this counting by?: ");
      count = input.nextInt();
      //Counter
      counter(start, end, count);
   }//end main method
      //call counter method
      public static void counter(int start, int end, int count)
      {
      //for loop
         for(int i = start; i <= end; i += count)
         {
            System.out.print(i +" ");
            
         }   
      }//end counter method
}//end CounterProgram class      