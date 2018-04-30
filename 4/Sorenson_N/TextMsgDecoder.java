import java.util.Scanner;
public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String userMsg;
      System.out.println("Enter text");
      
      userMsg = in.nextLine();
      System.out.println("You entered: " + userMsg);
      System.out.print(decoder(userMsg));
     
   }//end main
      public static String decoder(String userMsg){
         if (userMsg.contains("LOL")) {
            return "LOL: laughing out loud";
         }
         if (userMsg.contains("IDK")) {
            return "IDK: I don't know";
         }
         if (userMsg.contains("BFF")) {
            return "BFF: best friend forever";
         }
         if (userMsg.contains("JK")) {
            return "JK: just kidding";
         }
         if (userMsg.contains("TMI")) {
            return "TMI: too much information";
         }
         if (userMsg.contains("TTYL")) {
            return "TTYL: talk to you later";
         }
         else {
            return "";
         }
            
      
   
   }//end decode
}