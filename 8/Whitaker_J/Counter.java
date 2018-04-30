/*
*Justin Whitaker
*Counter Program
*Last Edited: 1/26/18
*/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //init vars
      int start = 0;
      //greet user
      System.out.println("Hello, and welcome to the counter program!");
      //prompt for input x3
      Scanner scannerObject = new Scanner(System.in);
      System.out.println("What's the starting number? ");
      int num = scannerObject.nextInt();
      System.out.println("What's the end number? ");
      int EndNum = scannerObject.nextInt();
      System.out.println("What should I count by? ");
      int CountBy = scannerObject.nextInt();
      System.out.println("\n");
      //call counter method
      counter(EndNum, CountBy, num);
   }//end main
   //counter
   public static void counter(int EndNum, int CountBy, int num){
      //for
      for (int start = 0; num <= EndNum; num += CountBy){
         //show count
         System.out.println(num);
      }
   }//end counter
}//end class