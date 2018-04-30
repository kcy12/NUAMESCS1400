/********************
Jacob Baggett P. 8
Reverse Message Program
Last Edited 3/14/18
*********************/

import java.util.Scanner;

public class ReverseMessage{

   public static void main(String[] args){
      
      //init Scanner input and variables
      Scanner input = new Scanner(System.in);
      String initialStr = ("");
      String finalStr = ("");
      
      //get input
      System.out.println("Welcome to Message Reversal 1978!");
      System.out.print("Type your message here: ");
      initialStr = input.nextLine();
      
      //call reverse
      finalStr = reverse(initialStr);
      
      System.out.println("Your message backwards is " + finalStr);
      
   }//end main
   
   
   //String reversal method
   public static String reverse(String initialStr){
      //init final String
      String finalStr = ("");
      //reversal
      for(int i = initialStr.length()-1; i >= 0; --i){
         finalStr += initialStr.charAt(i);
      }
      return finalStr;
   }//end reverse
   
}
      