/**********************
* Ethan Pickard
* Reverse Message Program
* Last Edited: 1/30/18
***********************/

import java.util.Scanner;

public class Reverser{ //class
   public static void main(String[] args){ //main
   
      Scanner input = new Scanner(System.in);
      String userString;
      String outputString;
   
      //greeting
      System.out.println("Hello! Welcome to the reverse message program!");
      
      //get message
      System.out.print("Type the message you want reversed: ");
      userString = input.nextLine();
      System.out.println();
      System.out.println();
      
      //call reverse
      outputString = reverse(userString);
      System.out.println(outputString); //print reversed  
   
   }//end main function
   
   public static String reverse(String userString) {
      
      String outputString = "";
      
      for (int i = userString.length() - 1; i >= 0; i -= 1){
         outputString += userString.charAt(i);
      }//end for loop
      return outputString;
      
   }//end reverse method 
}//end Main class