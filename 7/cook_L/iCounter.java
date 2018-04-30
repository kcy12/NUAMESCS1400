/****************************
*Logan Cook
*Counter Program
*Last Edited: 1-26-18
****************************/

import java.util.Scanner;

//class
public class iCounter{
   //main
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
         //init vars
         int countStart = 0;
         int countEnd = 0;
         int countBy = 0;
         //greet the user
          System.out.println("Welcome To A Automated Number Counter!");
         //prompt for input x3 (starting number, ending number, interval to count by)
         //save input x3
          System.out.print("What Number Would You Like Me To Start At?");
          countStart = input.nextInt();
          System.out.print("What Number Would You Like Me To End At?");
          countEnd = input.nextInt();
          System.out.print("What Interval Would You Like Me To Count By?");
          countBy = input.nextInt();
         
         //call counter method
         counter(countStart, countEnd, countBy);
   }//end main
      //counter
      public static void counter(int countStart, int countEnd, int countBy){
         //for
         for(int i = countStart; i <= countEnd; i += countBy){
            System.out.print(i + " ");
             //print count
         }//end for loop
      }//end counter
}//end class         