/**********************
*Grant Arave
*Zylabs 16.8
*Last Edited: 2/26/18
**********************/

import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      String userInput;
      String BFF = "best friend forever";
      String IDK = "I don't know";
      String JK = "just kidding";
      String TMI = "too much information";
      String TTYL = "talk to you later";
      
      System.out.println("Enter text:");
      userInput = scnr.nextLine();
      
      System.out.println("You entered: "+ userInput);
      System.out.println();
      
      if(userInput.contains("BFF"))
      {
         userInput = userInput.replace("BFF", BFF);
         System.out.println("Replaced \"BFF\" with \""+ BFF +"\".");
      }
      
      if(userInput.contains("IDK"))
      {
         userInput = userInput.replace("IDK", IDK);
         System.out.println("Replaced \"IDK\" with \""+ IDK +"\".");
      }
      
      if(userInput.contains("JK"))
      {
         userInput = userInput.replace("JK", JK);
         System.out.println("Replaced \"JK\" with \""+ JK +"\".");
      }
      
      if(userInput.contains("TMI"))
      {
         userInput = userInput.replace("TMI", TMI);
         System.out.println("Replaced \"TMI\" with \""+ TMI +"\".");
      }
      
      if(userInput.contains("TTYL"))
      {
         userInput = userInput.replace("TTYL", TTYL);
         System.out.println("Replaced \"TTYL\" with \""+ TTYL +"\".");
      }
      
      System.out.println();
      System.out.println("Expanded: "+ userInput);

   }
}