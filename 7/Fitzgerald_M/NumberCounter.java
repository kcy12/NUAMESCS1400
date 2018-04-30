/*****************************
* Matt Fitzgerald 
* counts numbers
* Last Edited 1/26/18
*****************************/

import java.util.Scanner;

//class
public class NumberCounter{
   public static void main(Sting [] args){
    //scanner
    Scanner scan = new Scanner(System.in);
    //inti vars
      int start = 0;
      int end = 0;
      int count = 0;
      //grett user
      System.out.println("Welcome to the Number Counter!");
      //prompt input x3  
      start = scan.nextInt();
      System.out.print("What is the starting value?: ");
      
      end = scan.nextInt();
      System.out.print("What is the ending value?: ");
      
      count = scan.nextInt();
      System.out.print("How much should I count by?: ");
      // save input x3
      //call counter mehtod.
      counter(start,end,count);
      //counter method
     public static int counting(int start, int end, int count){
      
      
       //for
      for (int i=start; i<=end; i+=count){
      
      }//end for loop
      return counting;
         //print count
         System.out.print(1);
     }//end counter    
   }//end main method
}//end class
  
      