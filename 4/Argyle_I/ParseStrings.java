import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter input string:");
      String userIn = scnr.nextLine();
      while (!userIn.equals("q")) {
         if (userIn.contains(",")) {
            String resultBef = userIn.split(",")[0];
            String resultAf = userIn.split(",")[1];
            while (resultBef.charAt(0) == ' ') {
               resultBef = resultBef.substring(1);
            }
            while (resultAf.charAt(0) == ' ') {
               resultAf = resultAf.substring(1);
            }
            while (resultBef.substring(resultBef.length() - 1).equals(" ")) {
                 resultBef = resultBef.substring(0, resultBef.length() - 1);
            }
            while (resultAf.substring(resultAf.length() - 1).equals(" ")) {
                 resultAf = resultAf.substring(0, resultAf.length() - 1);
            }
            System.out.println("First word: " + resultBef);
            System.out.println("Second word: " + resultAf);
            System.out.println("");
            System.out.println("Enter input string:");
            userIn = scnr.nextLine();
         }
         else {
            System.out.println("Error: No comma in string.");
            System.out.println("");
            System.out.println("Enter input string:");
            userIn = scnr.nextLine();
         }
      }
   }
}