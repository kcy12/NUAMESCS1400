import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      String userInput = "none";
      int i;
      int userInputL;
      String first;
      String second;
      Boolean commaCheck = false;
      int c;
      
      while(userInput.equals("q") == false) {
        System.out.println("Enter Input string:");
        userInput = in.nextLine();
        if(userInput.equals("q")) {
          continue;
        }
        c = userInput.indexOf(',');
        userInputL = userInput.length();
        if(c == -1) {
          System.out.println("Error: No comma in string.\n");
        }
        else {
          first = userInput.substring(0, c);
          first.replaceAll("\\s+","");
          second = userInput.substring(c+1, userInputL);
          second.replaceAll("\\s+","");
          System.out.println("First word: "+first.trim());
          System.out.println("Second word: "+second.trim());
        }
      }
   }
}
