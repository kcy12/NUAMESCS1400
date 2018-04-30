import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner police_scanner = new Scanner(System.in);
      
      System.out.println("Enter text:");
      
      String User_string;
      
      User_string = police_scanner.nextLine();
      
      System.out.println("You entered: " + User_string);
      
      /* if string contains BFF */
      
      String BFF = "BFF";
         
         if (User_string.toLowerCase().contains(BFF.toLowerCase())) {
      
      System.out.println("BFF: best friend forever");
      }
      /* else if string contains IDK */
      
      String IDK = "IDK";
         
         if (User_string.toLowerCase().contains(IDK.toLowerCase())) {
      
      System.out.println("IDK: I don't know");
      }
      /* else if string contains JK */
      
      String JK = "JK";
         
         if (User_string.toLowerCase().contains(JK.toLowerCase())) {
      
      System.out.println("JK: just kidding");
      }
      /* else if string contains TMI */
      String TMI = "TMI";
         
         if (User_string.toLowerCase().contains(TMI.toLowerCase())) {
         
      System.out.println("TMI: too much information");
      }
      /* else if string contains TTYL */
      String TTYL = "TTYL";
         
         if (User_string.toLowerCase().contains(TTYL.toLowerCase())) {
      
      System.out.println("TTYL: talk to you later");
      }
      /* else print take a seat young skywalker */
         else{
         
         System.out.print("");
      }

   }
}