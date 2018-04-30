import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String userInput;
      
      System.out.println("Enter text:");
      userInput = input.nextLine();
      System.out.println("You entered: " +userInput);
      
      if (userInput.contains("BFF") == true) {
         System.out.println("BFF: best friend forever");
      }
      if (userInput.contains("IDK") == true) {
         System.out.println("IDK: I don't know");
      }
      if (userInput.contains("JK") == true) {
         System.out.println("JK: just kidding");
      }
      if (userInput.contains("TMI") == true) {
         System.out.println("TMI: too much information");
      }
      if (userInput.contains("TTYL") == true) {
         System.out.println("TTYL: talk to you later");
      }

   }//end main
}//end TextMsgDecoder