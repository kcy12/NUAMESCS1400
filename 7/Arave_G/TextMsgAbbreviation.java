/***************************
*Grant Arave
*Zylabs 16.6
*Last Edited: 2/26/18
***************************/


import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      String userInput = "";
      {
         String BFF;
         String IMHO;
         String TMI;
         String LOL;
         String IDK;
      }
      System.out.println("Input an abbreviation:");
      userInput = scnr.next();
      
      if(userInput.contains("LOL"))
      {
         System.out.println("laughing out loud");
      }
      
      else if(userInput.contains("IDK"))
      {
         System.out.println("I don't know");
      }
      
      else if(userInput.contains("IMHO"))
      {
         System.out.println("in my humble opinion");
      }
      
      else if(userInput.contains("BFF"))
      {
         System.out.println("best friends forever");
      }
      
      else if(userInput.contains("TMI"))
      {
         System.out.println("too much information");
      }
      
      else
      {
         System.out.println("Unknown");
      }

   }
}