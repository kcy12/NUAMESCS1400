/******************
*JJ Burggraaf
*Counter Program
*Counts numbers
*Last edited: 1/25/18
******************/

import java.util.Scanner;
//class
public class CountProgram{
   //main
   public static void main(String[] args){
      //create scanner object
      //initialize variables
      Scanner in = new Scanner(System.in);
      int startValue = 0;
      int endPoint = 0;
      int countBy = 0;
      
      
   //main
      
      //greet user
      //prompt valuex3
      //save valuex3
      System.out.println("Welcome to the Counter Program.");
      System.out.println("What number should I start at? ");
      //save value 1
      startValue = in.nextInt();
      System.out.println("What number should I end at? ");
      //save value 2
      endPoint = in.nextInt();
      System.out.println("What should I count by? ");
      //save value 3
      countBy = in.nextInt();
      
      
      //call counting method
      theCounting(startValue, endPoint, countBy);
   }//end main
      
      //counting
      public static void theCounting(int startValue, int endPoint, int countBy){
   
      //for
      for(int i = startValue; i <= endPoint; i += countBy ){
         System.out.println(i);
      
      }//end for loop
   }//end public static void theCounting
}//end CounProgram