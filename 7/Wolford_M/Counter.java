/****************************************************
*Michael Wolford
*Counts from a number to a number by a certain number
*Last Edited: 1/30/18
*****************************************************/
import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //init vars
      int start = 0;
      int end = 0;
      int step = 0;
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the counter program!");
      //promt for start
      System.out.println("What number should we start at? ");
      //save start
      start = input.nextInt();
      //promt for end
      System.out.println("What number should we end at? ");
      //save end
      end = input.nextInt();
      //promt for step
      System.out.println("What number should we count by? ");
      //save step
      step = input.nextInt();
      //call counter method
      Counter.counter(start, end, step);
   }//end main method
   
   //Counter
   public static int counter(int start, int end, int step){
      //for loop
      for(int i = start; i <= end; i += step){
         System.out.print(i); 
      }//end for loop
      return step;
   }//end counter method
}//end Counter class