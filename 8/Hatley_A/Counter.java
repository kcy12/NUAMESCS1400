/********************************************
*Abigail Hatley
*Counter Program
*Last Edited: 1/26/18
********************************************/
import java.util.Scanner;
//class
public class Counter{
   //main
   public static void main(String[] args){
   
      //int vars
      int start = 0;
      int end = 0;
      int count = 0;
      Scanner in= new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the Counter Program!");
      //prompt for input x3
      System.out.println("What number would you like to start at? ");
      start = in.nextInt();
      System.out.println("What number would you like to end at? ");
      end = in.nextInt();
      System.out.println("What would you like to count by? ");
      count = in.nextInt();
      //save input x3
      //counter
      counter(start, end, count);
   }//end main
      //call counter method
   //counter
   public static void counter(int start, int end, int count){
  
      //for
      for(int i = start; i <= end; i += count){
         System.out.print(i + " ");
      }//end for loop
   }//end Counter 
}//end class