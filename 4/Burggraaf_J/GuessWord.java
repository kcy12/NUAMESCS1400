/******************
*JJ Burggraaf
*Guess Word
*
*Last edited: 2/17/18
******************/
//import scanner
import java.util.Scanner;
//class
public class GuessWord{
   //main
   public static void main(String[] args){
      //create scanner for main
      Scanner in = new Scanner(System.in);
      //init vars
      String theWord = "waddle";
      String guessWord;
      char userChar;
      int i;
      boolean inWord = false;
      boolean userWinner = false;
      //greet user
      System.out.println("Welcome to the Guess Word game!");
      System.out.println("You will have 7 chances to guess the letters that are in the word.");
      System.out.println("After that you will attempt to guess the word.");
      //guessing loop
      for (i = 0; i <= 6; ++i) {
         //user input
         System.out.print("What letter will you guess? ");
         guessWord = in.nextLine();
         userChar = guessWord.charAt(0);
         System.out.println();
         //call charCheck
         inWord = charCheck(theWord, userChar);
         //display if char is in string or not
         if (inWord) {
            System.out.print(userChar + " is a part of the word. ");
         }
         else {
         System.out.print(userChar + " is not a part of the word. ");
         }
         System.out.println("You have " + (6 - i) + " chances left.");
      }//end of guessing loop
      
      //out of guesses - guess word
      System.out.print("You've taken your chances so what is the word? ");
      guessWord = in.next();
      System.out.println();
      //display win or lose
      userWinner = wordCheck(theWord, guessWord);
      if (userWinner) {
         System.out.println(guessWord + " was the word! Nice job!");
      }
      else {
         System.out.println(guessWord + " was not the word. Better luck next time.");
      }
   }//end main method
   
   //charCheck
   public static boolean charCheck(String theWord, char userChar) {
      //if char in string
      if (theWord.indexOf(userChar) != -1) {
         //return true
         return true;
      }
      //else
      else {
         //return false
         return false;
      }
   }//end charCheck
   
   //wordCheck
   public static boolean wordCheck(String theWord, String guessWord) {
      //if guess is word
      if (theWord.equals(guessWord)) {
         //win
         return true;
      }
      //else
      else {
      //lose
         return false;
      }
   }//end wordCheck
}//end GuessWord
         