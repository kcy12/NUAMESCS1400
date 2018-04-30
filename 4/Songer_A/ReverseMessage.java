/************************************
*Ashton Songer
*Reverse Program
*Reverses the input the user puts in
*Last edited 1/19/2018
************************************/

import java.util.Scanner;

public class ReverseMessage{
   public static void main(String args[]){
   //create scanner object
   Scanner in = new Scanner(System.in);
   //get message
   System.out.println("What would you like me to reverse? ");
   //save variable
   String rev = in.nextLine();
   //call reverseString method
   String revMessage = reverseString(rev);
   System.out.println("It reversed is: " +revMessage);
   }
   
   public static String reverseString(String rev){
		String reversed = "";
      int length = rev.length();
      
      for(int i = length -1; i >= 0; i--){
         reversed += rev.charAt(i);
      }
      return reversed;
   }
}