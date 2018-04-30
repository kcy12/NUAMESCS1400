/*************
* Jacob Baggett
* Counter
* Last Edited 1/26/2018
**************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init vars
      int num = 0;
      int start = 0;
      int end = 0;
      int step = 0;
      //greet
      System.out.println("Welcome to simple counting program.");
      System.out.println();
      //input start
      System.out.print("What number will you have me start at? ");
      start = input.nextInt();
      System.out.println();
      //start the counting number num at user-inputted start
      num = start;
      //input end
      System.out.print("What number will you have me end at? ");
      end = input.nextInt();
      System.out.println();
      //input step
      System.out.print("What number will you have me count by? ");
      step = input.nextInt();
      System.out.println();
      //begin For loop
      for(int i = start;i <= end;i += step){
         System.out.print(num+" ");
         num += step;
         }//end For loop
      
   }//end main
}//end Counter