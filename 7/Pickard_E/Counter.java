/**********************
* Ethan Pickard
* Counter Program
* Last Edited: 1/30/18
***********************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      
      //init vars
      int numStart = 0;
      int numEnd = 0;
      int numCount = 0;
      
      //greet user
      System.out.println("Welcome to the counter program!");
      System.out.println();
      
      //prompt for input and save x3
      System.out.print("What number should I start at? ");
      numStart = input.nextInt();
      
      System.out.print("What number should I end at? ");
      numEnd = input.nextInt();
      
      System.out.print("What should I count by? ");
      numCount = input.nextInt();
      
      System.out.println();
      
      //call counter method
      Counter.counterMethod(numStart, numEnd, numCount);
   
   }//end main method
   
   public static void counterMethod(int numStart, int numEnd, int numCount){ //counter
   
      //for loop
      for(int i = numStart; i <= numEnd; i += numCount){
      
      //show count
      System.out.print(i + "  ");
      }//end loop
   
   }//end counter method
}//end Counter class
