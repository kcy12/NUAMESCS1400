import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      //init vars etc
      Scanner input = new Scanner(System.in);
      String userText;
      boolean booInput;
      
      String AbbrIDK = "IDK";
      String AbbrBFF = "BFF";
      String AbbrJK = "JK";
      String AbbrTMI = "TMI";
      String AbbrTTYL = "TTYL";
      
      String fullIDK = "I don't know";
      String fullBFF = "best friend forever";
      String fullJK = "just kidding";
      String fullTMI = "too much information";
      String fullTTYL = "talk to you later";
      
      //ask user for input 
      System.out.print("Enter text:");
      userText = input.nextLine();
      System.out.println();
      
      //print what they said 
      System.out.print("You entered: " + userText);
      System.out.println();
      System.out.println();
      
      //search string for abbreviations
      if (userText.contains(AbbrBFF) == true) {
         System.out.print("Replaced \"" + AbbrBFF + "\" with \"" + fullBFF + "\".");
         System.out.println();
      }   
      if (userText.contains(AbbrIDK) == true) {
         System.out.print("Replaced \"" + AbbrIDK + "\" with \"" + fullIDK + "\".");
         System.out.println();
      }
      if (userText.contains(AbbrJK) == true) {
         System.out.print("Replaced \"" + AbbrJK + "\" with \"" + fullJK + "\".");
         System.out.println();
      }
      if (userText.contains(AbbrTMI) == true) {
         System.out.print("Replaced \"" + AbbrTMI + "\" with \"" + fullTMI + "\".");
         System.out.println();
      }
      if (userText.contains(AbbrTTYL) == true) {
         System.out.print("Replaced \"" + AbbrTTYL + "\" with \"" + fullTTYL + "\".");
         System.out.println();
      }

   }
}