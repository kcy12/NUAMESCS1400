import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      
      Scanner Police_Scanner = new Scanner(System.in);
      System.out.println("Input an abbreviation:");
      String userInput = Police_Scanner.next();
      
      String LOL = "LOL";
      String BFF = "BFF";
      String IMHO = "IMHO";
      String TMI = "TMI";
      String IDK = "IDK";

      // if LOL
      if (userInput.equals(LOL)){
         System.out.println("laughing out loud");
      }
      // else if BFF
      else if (userInput.equals(BFF)){
         System.out.println("best friends forever");
      }
      // else if IMHO
      else if (userInput.equals(IMHO)){
         System.out.println("in my humble opinion");
      }
      // else if TMI 
      else if (userInput.equals(TMI)){
         System.out.println("too much information");
      }
      // else if IDK
      else if (userInput.equals(IDK)){
         System.out.println("I don't know");
      }
      else{
         System.out.println("Unknown");
      }

   }
}