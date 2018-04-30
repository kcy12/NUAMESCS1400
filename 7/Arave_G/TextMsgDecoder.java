/********************
*Grant Arave
*Zylabs 16.7
*Last Edited: 2/26/18
********************/

import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      String userInput;
      String BFF = "best friend forever";
      String JK = "just kidding";
      String TMI = "too much information";
      String TTYL = "talk to you later";
      String IDK = "I don't know";
      char userChar;
      
      System.out.println("Enter text:");
      userInput = scnr.nextLine();
      userChar = userInput.charAt(0);
      
      System.out.println("You entered: "+ userInput);
      
      
      if(userInput.indexOf(userChar) != -1)
      {
         if(userInput.contains("BFF"))
         {
            System.out.println("BFF: best friend forever");
         }
         
         if(userInput.contains("IDK"))
         {
            System.out.println("IDK: I don't know");
         }
         
         if(userInput.contains("JK"))
         {
            System.out.println("JK: just kidding");
         }
         
         if(userInput.contains("TMI"))
         {
            System.out.println("TMI: too much information");
         }
         
         if(userInput.contains("TTYL"))
         {
            System.out.println("TTYL: talk to you later");
         }
      }
      
      else
      {
         System.out.println("Unknown");
      }
      

   }
}