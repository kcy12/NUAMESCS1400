/*********************************
*Teancum Price
*Count from one number, to another
*by a certain amount, all
*determined by the user
*Last Edit: 1/26/18
*********************************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init vars
      int start = 0;
      int end = 0;
      int count = 0;
      //greet the user
      System.out.println("Welcom to the BEST COUNTER EVER!!1!!1!");
      //prompt for input
      System.out.print("What number should I start at? ");
      //save input
      start = input.nextInt();
      //Print an empty line
      System.out.println();
      //prompt for input
      System.out.print("What number should I end at? ");
      //save input
      end = input.nextInt();
      //Print an empty line
      System.out.println();
      //prompt for input
      System.out.print("What number should I count by? ");
      //save input
      count = input.nextInt();
      //Print an empty line
      System.out.println();
      //call counter
      counter(start, end, count);
   }//end main method
   //Count method
   public static void counter(int start, int end, int count){
      //for
      for(int i = start; i <= end; i+= count){
         //print the number its at
         System.out.print(i + " ");
      }
   }//end counter method
}//end class Counter