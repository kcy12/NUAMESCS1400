import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //variables
      String userInput;
      
      //introduce user and get input
      System.out.println("Input an abbreviation:");
      userInput = input.nextLine();
      //Create outputs
      if (userInput.equals("LOL")) {
         System.out.println("laughing out loud");
      }
      else if (userInput.equals("BFF")) {
         System.out.println("best friends forever");
      }
      else if (userInput.equals("IMHO")) {
         System.out.println("in my humble opinion");
      }
      else if (userInput.equals("TMI")) {
         System.out.println("too much information");
      }
      else if (userInput.equals("IDK")) {
         System.out.println("I don't know");
      }
      else {
         System.out.println("Unknown");
      }
     
         
      

   }
}