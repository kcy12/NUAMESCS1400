/************************
*Nick Lee
*Text Message Abbreviator
*
*Last Edited:3-12-2018
************************/

import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String message;
      String messageDecoded;
      
      System.out.println("Welcome to a message decoder!");
      System.out.println("Enter a commonly used abbreviation in text messages:\n");
      
      message = scnr.next();
      //System.out.println(message);
      messageDecoded = decoder(message);
      System.out.print("Your message is " + messageDecoded + ".");
      
   }//end main
   public static String decoder(String message){
      String decoded = "";
      //System.out.println(message);
      if (message.equals("LOL")){
         return "laughing out loud";
      }  else if (message.equals("IDK")){
         return "I don't know";
      }  else if (message.equals("BFF")){
         return "Best Freiends Forever";
      }  else if (message.equals("IMHO")){
         return "in my humble opinion";
      }  else if (message.equals("TMI")){
         return "too much information";
      }  else {
         return "UNKNOWN";
      }//end else
      //return decoded;
   }//end decoder
}