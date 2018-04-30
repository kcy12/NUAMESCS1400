/*********************************************
*Michael Wolford
*User has to guess a certain word, uses charAt
*Last Edited: 2/15/18
*********************************************/
import java.util.Scanner;

//class
public class Main{
   //main
   public static void main(String[] args){
      //init vars
      Scanner input = new Scanner(System.in);
      String wordGuess = "";
      String theWord = "clown";
      char userChar;
      boolean charB;
      boolean guessB;
      //greet user
      System.out.print("Welcome to the Word Guessing game!");
      System.out.println("Hint: the word is all lowercase");
      //guessing loop
      for (int i = 10; i >= 0; i--){
         //user input
         System.out.println("What letter do you want to guess? ");
         wordGuess = input.next();
         userChar = wordGuess.charAt(0);
         //call charCheck
         charB = charCheck(theWord, userChar);
         //display if char is in string or not
         if (charB){
            System.out.println(userChar + " is in the word.");
         }
         else {
            System.out.println(userChar + " is not in the word.");
         }
      }//end for loop
      //out of guesses - guess word
      System.out.println("You must guess the word now, Honk!");
      wordGuess = input.next();
      //display win or lose
      guessB = wordCheck(theWord, wordGuess);
      if (guessB){
         System.out.println("You won! That's the word, henk");
      }
      else{
         System.out.println("Sorry, "+theWord+" was the word!");
      }
   }//end main method
   public static boolean charCheck(String theWord, char userChar){ 
      //if char in string
      if (theWord.indexOf(userChar) != -1) {
         return true;
      }
      else {
         return false;
      }
   }//end charCheck
   public static boolean wordCheck(String theWord, String wordGuess){
      if (theWord.equals(wordGuess)){
         return true;
      }
      else{
         return false;
      }
   }//end wordCheck
}// end Main class