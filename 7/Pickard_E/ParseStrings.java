/**********************
* Ethan Pickard
* parsing strings
* Last Edited: 3/15/18
***********************/

import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      //init vars etc
      Scanner input = new Scanner(System.in);
      String userString = "hello";
      boolean booString = false;
      int commaIndex;
      String word1;
      String word2;
      
      
      while (userString.charAt(0) != 'q') {
         //get user string
         while (booString == false) {
            System.out.println("Enter input string:");
            userString = input.nextLine();
            
            if (userString.contains(",")) {
               booString = true;
            }
            else {
               if (userString.charAt(0) == 'q') {
                  break;
               }
               else {
                  System.out.println("Error: no comma in string.");
                  System.out.println();
               }
            }
         }//end while loop
         
         if (userString.charAt(0) == 'q') {
         break;
         }
         
         //get rid of spaces
         userString = userString.replace(" ", "");
         
         ////////separate words
         //word1
         commaIndex = userString.indexOf(',');
         
         System.out.print("First word: ");
         
         for (int i = 0; i < commaIndex; i++) {
            System.out.print(userString.charAt(i));
         }
         System.out.println();
         //word2
         System.out.print("Second word: ");
         
         for (int i = commaIndex + 1; i < userString.length(); i++) {
            System.out.print(userString.charAt(i));
         }
         System.out.println();
         System.out.println();
         
         booString = false;
         
         
      }//end main while
   }//end main method
}//end class