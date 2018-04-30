import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //Prompt the user for a string that contains two strings separated by a comma.
      System.out.println("Enter input string:");
      String userString = scnr.nextLine();
      //Store the strings in two separate variables and output the strings. 
      while (!userString.equals("q")) {
         if (userString.contains(",")) {
            //Store the strings in two separate variables
            String wordOne = userString.split(",")[0];
            String wordTwo = userString.split(",")[1];
            while (wordOne.charAt(0) == ' ') {
               wordOne = wordTwo.substring(1);
            }//end while
            //Extract the two words from the input string and remove any spaces.
            while (wordTwo.charAt(0) == ' ') {
               wordTwo = wordTwo.substring(1);
            }//end while
            while (wordOne.substring(wordOne.length() - 1).equals(" ")) {
                 wordOne = wordOne.substring(0, wordOne.length() - 1);
            }//end while
            while (wordTwo.substring(wordOne.length() - 1).equals(" ")) {
                 wordTwo = wordTwo.substring(0, wordTwo.length() - 1);
            }//end while
            //output the strings
            System.out.println("First word: " + wordOne);
            System.out.println("Second word: " + wordTwo);
            System.out.println("");
            System.out.println("Enter input string:");
            userString = scnr.nextLine();
         }//end if
         //Report an error if the input string does not contain a comma.
         //Continue to prompt until a valid string is entered.
         else {
            System.out.println("Error: No comma in string.");
            System.out.println("");
            System.out.println("Enter input string:");
            userString = scnr.nextLine();
         }//end else
      }//end while loop
   }//end main
}//end ParseStrings