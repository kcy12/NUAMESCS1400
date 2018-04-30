import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner input = new Scanner(System.in);
      
      String abbrev = " ";
      System.out.println("Input an abbreviation:");
      abbrev = input.nextLine();
      
      if (abbrev.equals("LOL")){
         System.out.print("laughing out loud");
      }
      else if (abbrev.equals("IMHO")){
         System.out.print("in my humble opinion");
         }
      else if (abbrev.equals("TMI")){
         System.out.print("too much information");
      }
      else if (abbrev.equals("IDK")){
         System.out.print("I don't know");
      }
      else if (abbrev.equals("BFF")){
         System.out.println("best friends forever");
      }
      else{
         System.out.print("Unknown");
      }

   }
}