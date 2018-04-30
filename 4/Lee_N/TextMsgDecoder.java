/*********************
*Nick Lee
*Text Message Decoder
*
*Last Edited:3-8-2018
*********************/

import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String message;
      String messageDecoded;
      
      System.out.println("Enter text:");
      
      message = scnr.nextLine();
      System.out.println("You entered: " + message);
      messageDecoded = decoder(message);
      //System.out.print(messageDecoded);
      
   }//end main
   public static String decoder(String message){
      //String[] abbreviation = new String["BFF"; "IDK"; "JK"; "TMI"; "TTYL"];
      //String[] decoded = new String["best friends forever"; "I don't know"; "just kidding";
      //                              "too much information"; "talk to you later"];
      String decoded = "";
      if (message.indexOf("BFF") != -1){
         System.out.println("BFF: best friend forever");
      }
      if (message.indexOf("IDK") != -1){
         System.out.println("IDK: I don't know");
      }
      if (message.indexOf("JK") != -1){
         System.out.println("JK: just kidding");
      }
      if (message.indexOf("TMI") != -1){
         System.out.println("TMI: too much information");
      }
      if (message.indexOf("TTYL") != -1){
         System.out.println("TTYL: talk to you later");
      }
      return decoded;
   }//end decoder
}