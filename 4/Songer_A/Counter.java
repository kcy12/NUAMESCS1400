/********************************************************************
*Ashton Songer
*Counter Program
*Lets you count from what you want to what you want by what you want
*Last Edited 1/25/2018
********************************************************************/

import java.util.Scanner;

//class
public class Counter{
   //main
   public static void main(String[] args){
      //scanner object
      Scanner in = new Scanner(System.in);
      //init vars
      int S = 0;
      int E = 0;
      int C = 0;
      //greet user
      System.out.println("Hello! Welcom to the counter program!\n");
      //prompt value
      System.out.print("What number would you like me to start at? ");
      //save value
      S = in.nextInt();
      //print value
      System.out.print("What number would you like me to end at? ");
      //save value
      E = in.nextInt();
      //print value
      System.out.print("What number would you like me to count by? ");
      //save value
      C = in.nextInt();
      //cal counting method
      counting(S, E, C);
      }//end method main
   //counting
   public static void counting(int S, int E, int C){
      //extra space for better look
      System.out.print("\n");
      //for
      for(int i = S; i <= E; i += C){
         //print count
         System.out.print(i + " ");
      }//end for loop
   }//end method counting
}//end counter class