/**************
*Niklas Sorenson
*
*Counts
*Last edited 1/25/18
**************/

import java.util.Scanner;
//class
public class Counter {
   //main
   public static void main (String[] args){
      //init vars
      Scanner in = new Scanner(System.in); 
      int startValue = 0;
      int endPoint = 0;
      int countBy = 0;
      //greet user
      //prompt value * 3
      // save value * 3
      System.out.println("Hello! Welcome to the Counter! I can count.");
      System.out.println("Where should I start counting from?");
      startValue = in.nextInt();
      System.out.println("Where should I count to?");
      endPoint = in.nextInt();
      System.out.println("What number should I count by?");
      countBy = in.nextInt();

      //call counting method
      thatWhichCounts(startValue, endPoint, countBy);
   }//end main

   //counting
   public static void thatWhichCounts(int startValue, int endPoint, int countBy){
      //for
      for(int i = startValue; i <= endPoint; i += countBy ){
         System.out.println(i);      
         }// end for loop   
      }//end thatWhichCounts
}//end Counter