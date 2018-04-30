/**********************************
*Teancum Price
*Player guesses letters of a word
*Last Edit: 2/13/18
**********************************/

//Import Scanner
import java.util.Scanner;

//GuessWord Class
public class GuessWord{
   //main method
   public static void main(String[] args){
      //Create Scanner
      Scanner input = new Scanner(System.in);
      //Init vars
      String deWord = "test";
      String userWord;
      char userChar;
      int i;
      boolean isInWord = false;
      boolean aWinnerIsYou = false;
      //Greet user
      System.out.println("Welcome to the Word Guessing Game!  You guess which characters are in");
      System.out.println("the word until you run out of guesses.  Then you guess the word!");
      System.out.println("Note: All of it is in lower case, and you should input in lowercase");
      //Guessing loop
      for (i = 0; i < 6; ++i) {
         //User input
         System.out.print("What letter do you want to guess?");
         userWord = input.nextLine();
         userChar = userWord.charAt(0);
         System.out.println();
         //Call charCheck
         isInWord = charCheck(deWord, userChar);
         //display if char is in string or not
         if (isInWord) {
            System.out.print(userChar + " is in the word.  ");
         }
         else {
            System.out.print(userChar + " is not in the word.  ");
         }
         System.out.println("You have " + (5 - i) + " guesses left.");
      }//End guessing loop
      //Out of guesses - guess word
      System.out.print("Out of guesses!  What is the word? ");
      userWord = input.next();
      System.out.println();
      //Display win or lose
      aWinnerIsYou = wordCheck(deWord, userWord);
      if (aWinnerIsYou) {
         System.out.println(userWord + " was the word! Congratulations!");
      }
      else {
         System.out.println(userWord + " was not the word.  You lose!");
      }
   }//end main method
   
   //charCheck method
   public static boolean charCheck(String deWord, char userChar) {
      //If char in string
      if (deWord.indexOf(userChar) != -1) {
         //return true
         return true;
      }
      //else
      else {
         //return false
         return false;
      }
   }//end charCheck method
   
   //wordCheck method
   public static boolean wordCheck(String deWord, String userWord) {   
      //if guess is word
      if (deWord.equals(userWord)) {
         //win
         return true;
      }
      //else
      else {
         //lose
         return false;
      }
   }//end wordCheck method
}//End GuessWord