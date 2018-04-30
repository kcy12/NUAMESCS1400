/************************
* Alysha Robertson
* Counter Program
* Last Edited: 1/30/18
************************/

import java.util.Scanner;

//class
public class CounterProgram{
   //main
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      //int vars
      int start = 0;
      int end = 0;
      int count = 0;
      //greet the user
      System.out.println("Welcome to the Counter Program.");
      //promt for input x3
      System.out.println("What number should I start at? ");
      start = scan.nextInt();
      System.out.println("What number should I end at? ");
      end = scan.nextInt();
      System.out.println("What should I count by? ");
      count = scan.nextInt();
      //save input x3
      //call counter method
      count(start,end,count);
         }//end main method

   //counter
   public static void count(int start, int end, int  count){
   
      //for(int value(int i = S);ending value(i <= E);what you count by(i += C)){
      for (int i=start; i<=end; i+=count){
      //print count
            System.out.println(i);
      }//end for loop  
   }//end counter
}//end Counter Program class