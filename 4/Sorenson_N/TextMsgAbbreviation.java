import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String userMsg = "";
      System.out.println("Enter Text");
      userMsg = in.nextLine();
      System.out.println("You entered: " + userMsg);
      System.out.print(BFFMeaning(userMsg));
      System.out.print(IDKMeaning(userMsg)); 
      System.out.print(JKMeaning(userMsg));
      System.out.print(TMIMeaning(userMsg));   
      System.out.print(TTYLMeaning(userMsg));  
   }//end main
   public static String BFFMeaning (String userMsg){
      if (userMsg.contains("BFF")){
         return "BFF: best friend forever\n";
      }
      else {
      return "";
      }
   }//end BFFMeaning
   
   public static String IDKMeaning (String userMsg){
      if (userMsg.contains("IDK")){
         return "IDK: I don't know\n";
      }
      else {
      return "";
      }
   }//end IDKMeaning
   
      public static String JKMeaning (String userMsg){
      if (userMsg.contains("JK")){
         return "JK: just kidding\n";
      }
      else {
      return "";
      }
   }//end JKMeaning
   
   public static String TMIMeaning (String userMsg){
      if (userMsg.contains("TMI")){
         return "TMI: too much information\n";
      }
      else {
      return "";
      }
   }//end TMIMeaning

   public static String TTYLMeaning (String userMsg){
      if (userMsg.contains("TTYL")){
         return "TTYL: talk to you later\n";
      }
      else {
      return "";
      }
   }//end TTYLMeaning
}//end TextMsgAbbreviation