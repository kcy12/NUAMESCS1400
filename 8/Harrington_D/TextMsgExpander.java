import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      Scanner police_scanner = new Scanner(System.in);
      System.out.println("Enter text:");
      String User_string;
      User_string = police_scanner.nextLine();
      System.out.println("You entered: " + User_string);
      System.out.println("");
      /* if string contains BFF */
      String _BFF = "BFF";   
      String BFF = "best friend forever";      
         if (User_string.toLowerCase().contains(_BFF.toLowerCase())) {
         System.out.println("Replaced \"BFF\" with \"best friend forever\".");
      }
      /* else if string contains IDK */
      String _IDK = "IDK";
      String IDK = "I don't know";
         if (User_string.toLowerCase().contains(_IDK.toLowerCase())) {
         System.out.println("Replaced \"IDK\" with \"I don't know\".");
      }
      /* else if string contains JK */
      String _JK = "JK";  
      String JK = "just kidding";
         if (User_string.toLowerCase().contains(_JK.toLowerCase())) {
         System.out.println("Replaced \"JK\" with \"just kidding\".");
      }
      /* else if string contains TMI */
      String _TMI = "TMI";
      String TMI = "too much information";
         if (User_string.toLowerCase().contains(_TMI.toLowerCase())) {
         System.out.println("Replaced \"TMI\" with \"too much information\".");  
      }
      /* else if string contains TTYL */
      String _TTYL = "TTYL";
      String TTYL = "talk to you later";
         if (User_string.toLowerCase().contains(_TTYL.toLowerCase())) {
         System.out.println("Replaced \"TTYL\" with \"talk to you later\".");   
      }
      /* else print take a seat young skywalker */
         else{
         System.out.print("");
      }
      User_string = User_string.replaceAll(_BFF, BFF);
      User_string = User_string.replaceAll(_IDK, IDK);
      User_string = User_string.replaceAll(_JK, JK);
      User_string = User_string.replaceAll(_TMI, TMI);
      User_string = User_string.replaceAll(_TTYL, TTYL);
      System.out.println("");
      System.out.println("Expanded: " + User_string);
   }
}