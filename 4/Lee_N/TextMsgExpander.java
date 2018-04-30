/***********************
*Nick Lee
*Text Message Expander
*
*Last Edited: 3-12-2018
***********************/

import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      String message;
      String messageDecoded;
      Scanner scnr = new Scanner(System.in);
      
      //get message
      System.out.println("Enter text:");
      message = scnr.nextLine();
      System.out.println("You entered: " + message + "\n");
      
      messageDecoded = decoder(message);
      System.out.println("\nExpanded: " + messageDecoded);
   }//end main
      //find abbreviations
      public static String decoder(String message){
         String decoded = message;
         if (message.indexOf("BFF") != -1){
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            decoded = decoded.replaceAll("BFF", "best friend forever");
            //System.out.println(decoded);
         }
         if (message.indexOf("IDK") != -1){
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            decoded = decoded.replace("IDK", "I don't know");
         }
         if (message.indexOf("JK") != -1){
            System.out.println("Replaced \"JK\" with \"just kidding\".");
            decoded = decoded.replace("JK", "just kidding");
         }
         if (message.indexOf("TMI") != -1){
            System.out.println("Replaced \"TMI\" with \"too much information\".");
            decoded = decoded.replace("TMI", "too much information");
         }
         if (message.indexOf("TTYL") != -1){
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
            decoded = decoded.replace("TTYL", "talk to you later");
         }
         return decoded;
      }//end decoder

      //replace abbreviations
      //return full sentence
}