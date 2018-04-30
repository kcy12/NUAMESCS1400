/****************
*Chris Coffey
*CounterProgram
*program asks user for amount and
*counts to that number
*Last edited 1/25/18
*****************/

import java.util.Scanner;

//class
public class CounterProgram{
   //main
   public static void main(String[] args){
      //Scanner object
      Scanner in = new Scanner(System.in);
      //init vars
      int S = 0;
      int E = 0;
      int C = 0;
      //greet user
      System.out.println("Welcome to the Counter Program");
      //prompt for value x 3
      System.out.print("\nWhat number should I start at?");
      //save value x 3
      S = in.nextInt();
      //prompt for value
      System.out.print("What number should I end at?");
      //save value
      E = in.nextInt();
      //prompt value
      System.out.print("What should I count by?");
      //save value
      C = in.nextInt();
      //call counting method
      counting(S, E, C);
   }//end main
   //counting
   public static void counting(int S, int E, int C){
      //create new empty line before counting
      System.out.print("\n");
      //for loop
      for(int i=S; i<=E; i+=C){
         //print count
         System.out.print(i + " ");
      }//end for loop
   }//end counting
}//end class