/***********************
*Kacie Gardepy
*Parse Strings Program
*Last Edited: 03/13/2018
***********************/
//import code from zybooks
//scanner

import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      //new scanner
      Scanner input = new Scanner(System.in);
      
      //variables
      boolean word = true;
      char user;
      String one;
      
      
      
      //start 
      System.out.println("Enter input string:");
      user = input.nextchar();
      //while loop
      while (word){
         user = input.next().charAt(0);
         if (user == 'q'){
            word = false;
            break;
         }
         else{
            System.out.println("Enter input string:");
            one = input.nextLine();
          }
     }
   }
}