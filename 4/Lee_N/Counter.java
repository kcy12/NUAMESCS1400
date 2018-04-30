/************************
*Nick Lee
*Counter Program
*
*Last Edited: 1-25-2018
************************/

import java.util.Scanner;

//class
public class Counter{
   //main
   public static void main(String[] args){
      //init vars
      Scanner in = new Scanner(System.in);
      int start = 0;
      int endpoint = 0;
      int count = 0;
      //greet user
      System.out.println("Welcome to the Counter Program");
      //propmt valuex3 and save valuex3
      System.out.print("What number should I start at? ");
      start = in.nextInt();
      System.out.print("\nWhat number should I end at? ");
      endpoint = in.nextInt();
      System.out.print("\nWhat should I count by? ");
      count = in.nextInt();
      //call counting method
      counter(start, endpoint, count);
   }//end main
   public static int counter(int start, int endpoint, int count){
      System.out.print("\n");
      //for
      for(int i = start; i <= endpoint; i += count){
         //print count
         System.out.print(i + " ");
      }//end for loop
      return start;
   }//end counter method
}//end class Counter