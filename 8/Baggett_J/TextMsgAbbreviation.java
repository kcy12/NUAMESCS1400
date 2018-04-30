import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
   
      //init vars & scan
      
      Scanner input = new Scanner(System.in);

      String IDK = "IDK";
      String LOL = "LOL";
      String BFF = "BFF";
      String TMI = "TMI";
      String IMHO = "IMHO";

      //Start
      System.out.println("Input an abbreviation:");
      String abrv = input.next();
      
      if(abrv.equals(BFF)){
         System.out.println("best friends forever");
         }
         
      else if(abrv.equals(IDK)){
         System.out.println("I don't know");
         }
         
      else if(abrv.equals(LOL)){
         System.out.println("laughing out loud");
         }
         
      else if(abrv.equals(TMI)){
         System.out.println("too much information");
         }   
         
      else if(abrv.equals(IMHO)){
         System.out.println("in my humble opinion");
         }
         
      else{
         System.out.println("Unknown.");
         }
      
      
   }
}