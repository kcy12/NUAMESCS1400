import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String userMsg = "";
      System.out.println("Enter text:");
      userMsg = in.nextLine();
      System.out.println("You entered: " + userMsg);
      System.out.print(BFFMeaning(userMsg));
      System.out.print(IDKMeaning(userMsg)); 
      System.out.print(JKMeaning(userMsg));
      System.out.print(TMIMeaning(userMsg));   
      System.out.print(TTYLMeaning(userMsg));  
      System.out.print("Expanded: " + messageExpander(userMsg));
   }//end main
   public static String BFFMeaning (String userMsg){
      if (userMsg.contains("BFF")){
         return "replaced \"BFF\" with \"best friend forever\"\n";
      }
      else {
      return "";
      }
   }//end BFFMeaning
   
   public static String IDKMeaning (String userMsg){
      if (userMsg.contains("IDK")){
         return "replaced \"IDK\" with \"I don't know\"\n";
      }
      else {
      return "";
      }
   }//end IDKMeaning
   
      public static String JKMeaning (String userMsg){
      if (userMsg.contains("JK")){
         return "replaced \"JK\" with \"just kidding\"\n";
      }
      else {
      return "";
      }
   }//end JKMeaning
   
   public static String TMIMeaning (String userMsg){
      if (userMsg.contains("TMI")){
         return "replaced \"TMI\" with \"too much information\"\n";
      }
      else {
      return "";
      }
   }//end TMIMeaning

   public static String TTYLMeaning (String userMsg){
      if (userMsg.contains("TTYL")){
         return "replaced \"TTYL\" with \"talk to you later\"\n";
      }
      else {
      return "";
      }
   }//end TTYLMeaning
   public static String messageExpander (String userMsg){
      userMsg = userMsg.replace("BFF","best friend forever");
      userMsg = userMsg.replace("IDK","I don't know");
      userMsg = userMsg.replace("JK","just kidding");
      userMsg = userMsg.replace("TMI","too much information");
      userMsg = userMsg.replace("TTYL","talk to you later");
      return userMsg;
   }//end messageExpander
}//end TextMsgAbbreviation
