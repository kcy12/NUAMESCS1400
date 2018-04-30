/******************************
* Teagan Stoddard
* Counter
* Last Edited: 1/26/18
*******************************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner (System.in);
      //init vars
      int StartValue = 0;
      int EndValue = 0;
      int CountValue = 0;
      //greet the user
      System.out.println("Welcome to the Counter Program!");
      
      //prompt for input x3 
      System.out.print("What number should I start at?: ");
      //save input
      StartValue = input.nextInt();
      System.out.println();
      //prompt for input
      System.out.print("What number should I end at?: ");
      //save input
      EndValue = input.nextInt();
      System.out.println();
      //prompt input
      System.out.print("What should I count by?: ");
      //save input
      CountValue = input.nextInt();
      
      //for(int i = start; i <= end; i += step)
      int num = StartValue;
      for(int i = StartValue; i <= EndValue; i += CountValue){
         System.out.print(num + " ");
         num += CountValue;       
      }//end for
   }//end main
}//end class





