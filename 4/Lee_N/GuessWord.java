/************************
*Nick Lee
*Guess my word
*
*Last Edited:2-28-2018
************************/

import java.util.Scanner;
import java.util.Random;

//class
public class GuessWord{
   //main
   public static void main(String[] args){
      //init vars
      Scanner in = new Scanner(System.in);
      int guessLeft = 10;
      char charGuess;
      boolean charCheck;
      boolean win;
      String wordGuess;
      String word = "memes";
      //greet user
      System.out.println("Welcome to Guess My Word game!");
      System.out.println("You will be given 10 chances to guess the letters in the word.");
      System.out.println("After that you have to guess the word! Good luck!");
      //guessing loop
      while(guessLeft > 0){
         //user input
         System.out.print("What letter do you think is in the word? ");
         charGuess = in.next().charAt(0);
         //call charCheck
         charCheck = charCheck(charGuess, word);
         //display if char is in string or not
         if(charCheck == true){
               System.out.println("The letter \"" + charGuess + "\" is in the word.");
            } else if(charCheck == false){
              System.out.println("The letter \"" + charGuess + "\" is NOT in the word.");
            } else{
              System.out.println("charGuess is invalid or charCheck failed");
         }
         //increment count
         guessLeft--;
      }
         
      //out of guesses - guess word
      System.out.println("\nWhat do you think the word is?");
      wordGuess = in.next();
      
      //display win or lose
      win = wordCheck(word, wordGuess);
      if(win == true){
         System.out.println("\nYou guessed the word! Yay!");
      }
      else{
         System.out.println("\nThat was not the right word.");
         System.out.println("Better luck next time.");
      }
   }//end main
   //charCheck(word, guess)
   public static boolean charCheck(char charGuess, String word){//method charCheck
      //check char
      if(word.indexOf(charGuess) != -1){
         return true;
      } else {
         return false;
      }
   }//end method charCheck
   //wordCheck(word, guess)
   public static boolean wordCheck(String word, String wordGuess){//method wordCheck
      //if guess is word
      if(wordGuess.equals(word)){
         //win
         return true;
      } else{
         //lose
         return false;
      }
   }//end method wordCheck
}//end class