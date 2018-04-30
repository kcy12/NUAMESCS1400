/**********************
* Jaden Bailey
* Guess Word Program
* Last Edited: 2/13/18
***********************/

import java.util.Scanner;

public class Guess_Word {
   public static void main(String[] args) {
      
      //init vars and scanner
      Scanner input = new Scanner(System.in);
      String wordGuess;
      char guess;
      String theWord = "heatmiser";
      boolean booChar;
      boolean result;
      
      
      //greet user
      System.out.println("Welcome to the guess my word program, I am thinking");
      System.out.println("of a number and you have 6 letter guesses before a");
      System.out.println("final guess, if you get it right you win");
      System.out.println("Please guess lowercase letters");
      System.out.println();
      
      //guessing loop
      for (int i = 6; i > 0; i--) {
         //user input
         System.out.println("What character do you want to guess? ");
         guess = input.next().charAt(0);
   
         //call charCheck
         booChar = charCheck(theWord, guess);
         
         //display if char is in string or not
         if (booChar == true) {
            System.out.println(guess + " is in the word");
         }
         else {
            System.out.println(guess + " is not in the word: ");  
         }
         
      }//end guessing loop 
         
      //out of guesses - guess word
      System.out.println("Now guess the word");
      System.out.println();
      System.out.println("What do you think the word is");
      wordGuess = input.next();
      
      //display win or lose
      result = checkWord(theWord, wordGuess);
      
      if (result == true) {
         System.out.println("Hooray, you win");
      }
      else {
        System.out.println("You were wrong, the word is " + theWord);
      }
      
   
   }//end main method
   
   
   public static boolean charCheck(String theWord, char guess) {
      
      //Checking loop
      for (int i = theWord.length() - 1; i >= 0; i--) {
         
         if (theWord.charAt(i) == guess) {
            return true; 
         }   
      }
      return false; 
         
   }//end charCheck method
         
   public static boolean checkWord(String theWord, String guessWord) {      
      //if guess is word
      if (theWord.equals(guessWord)) {
            //win
            return true;
         }//end if
         //else
         else {
            //lose
            return false;
         }//end else 

         
         
   }//end wordCheck method
} //end Main class