/*****************************
*Kacie Gardepy
*Text message expander program
*Last Edited: 02/22/2018
*****************************/
import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner input = new Scanner(System.in);
      
      String sentence;
      System.out.println("Enter text:");
      sentence = input.nextLine();
      
      System.out.println("You entered: "+ sentence);
      System.out.println("");
      
      
      if (sentence.contains("BFF")){
         System.out.println("Replaced BFF with best friend forever.");
         sentence = sentence.replace("BFF", "best friend forever");
      }
      if (sentence.contains("IDK")){
         System.out.println("Replaced IDK with I don't know.");
         sentence = sentence.replace("IDK", "I don't know");
      }
      if (sentence.contains("JK")){
         System.out.println("Replaced JK with just kidding.");
         sentence = sentence.replace("JK", "just kidding");
      }
      if (sentence.contains("TMI")){
         System.out.println("Replaced TMI with too much information.");
         sentence = sentence.replace("TMI", "too much information");
      }
      if (sentence.contains("TTYL")){
         System.out.println("Replaced TTYL with talk to you later.");
         sentence = sentence.replace("TTYL", "talk to you later");
      }
      System.out.println("");
      System.out.println("Expanded: "+ sentence);

   }
}