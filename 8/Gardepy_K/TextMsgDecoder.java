/****************************
*Kacie Gardepy
*Text message decoder program
*Last Edited: 02/22/2018
****************************/
import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner input = new Scanner(System.in);
      
      String sentence;
      System.out.println("Enter Text:");
      sentence = input.nextLine();
      
      System.out.println("You entered: "+ sentence);
      
      //the extra string stuff with what you typed
      if (sentence.contains("BFF")){
         System.out.println("BFF: best friend forever");
         }
      if (sentence.contains("IDK")){
         System.out.println("IDK: I don't know");
         }
      if (sentence.contains("JK")){
         System.out.println("JK: just kidding");
         }
      if (sentence.contains("TMI")){
         System.out.println("TMI: too much information");
         }
      if (sentence.contains("TTYL")){
         System.out.println("TTYL: talk to you later");
         }
         

   }
}