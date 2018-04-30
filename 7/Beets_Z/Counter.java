/**********************
*Zoey Beets
*Counter
*Last Edited: 1/27/18
**********************/
import java.util.Scanner;

//class
public class Counter{
   public static void main(String[] args){
      //scanner
      Scanner input = new Scanner(System.in);
      //init vars
      int start = 0; 
      int end = 0;
      int count = 0;
      //greet
      System.out.println("Welcome to the Counter Program!");

      //new line
      System.out.println();

      //user input and save x3
      System.out.println("What number should I START at?: ");
      start = input.nextInt();
      System.out.println("What number should I END at?: ");
      end = input.nextInt();
      System.out.println("What should I COUNT by?: ");
      count = input.nextInt();
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