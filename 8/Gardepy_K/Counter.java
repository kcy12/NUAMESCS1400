/**********************
Kacie Gardepy
Counter Program
Last Edited: 01/26/2018
**********************/
import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //initialize variables
      int start = 0;
      int end = 0;
      int count = 0;
      //greet the user
      System.out.print("Welcome to the Counter Program");
      System.out.println(" ");
      System.out.print("What number should I start at? ");
      //prompt for input x3
      start = input.nextInt();
      System.out.print("What number should I stop at? ");
      end = input.nextInt();
      System.out.print("What should I count by? ");
      count = input.nextInt();
      //save input x3
      //call counter method
      Counter.counter(start, end, count);
   }//end main function
   //counter
   public static void counter(int start, int end, int count){
      Scanner input = new Scanner(System.in);
      //for
      for(int i = start; i <= end; i += count){
         //show count
         System.out.print(" "+ i+ " ");
   }//end for loop
   }//end counter
}//end class
