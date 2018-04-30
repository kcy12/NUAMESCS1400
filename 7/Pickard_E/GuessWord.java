/**********************
* Ethan Pickard
* Guess Word Program
* Last Edited: 2/13/18
***********************/

import java.util.Scanner;

public class GuessWord {
   public static void main(String[] args) {//main
      
      //init vars and scanner
      Scanner input = new Scanner(System.in);
      String userWordGuess;
      char userCharGuess;
      String correctWord = "keyboard";
      boolean booChar;
      boolean booWord;
      
      
      //greet user
      System.out.println("Hello! Welcome to the guess my word program!");
      System.out.println("My word is 8 characters long.");
      System.out.println("You will have 6 chances to guess a letter that is in my word.");
      System.out.println("NOTE: ALL WORD AND CHARACTER GUESSES MUST BE LOWERCASE");
      System.out.println();
      
      //guessing loop
      for (int i = 6; i > 0; i--) {
         //user input
         System.out.print("What character do you want to guess? ");
         userCharGuess = input.next().charAt(0);
         System.out.println();
   
         //call charCheck
         booChar = charCheck(correctWord, userCharGuess);
         
         //display if char is in string or not
         if (booChar == true) {
            System.out.println(userCharGuess + " is in the word!");
            System.out.println();
         }
         else {
            System.out.println(userCharGuess + " is NOT in the word :(");
            System.out.println();  
         }
         
      }//end guessing loop 
         
      //out of guesses - guess word
      System.out.print("You are out of guesses! What do  you think the word is? ");
      userWordGuess = input.next();
      
      //call wordCheck method
      booWord = wordCheck(correctWord, userWordGuess);
      
      //display win or lose
      if (booWord == true){
         System.out.println("Congratulations! '" + userWordGuess + "' is the word!");
         System.out.println("YOU WIN");
      }
      else {
         System.out.println("Sorry, '" + userWordGuess + "' is not the word :(");
         System.out.print("YOU LOSE");
      }
      
   
   }//end main method
   
   public static boolean charCheck(String correctWord, char userCharGuess) {//character check method
      
      for (int i = correctWord.length() - 1; i >= 0; i--) {
         
         if (correctWord.charAt(i) == userCharGuess) {
            return true; 
         }   
      }
      return false; 
         
   }//end charCheck method
         
   public static boolean wordCheck(String correctWord, String userWordGuess) {//wordCheck method
      
      if (userWordGuess.equals(correctWord)) {
         return true;
      }
      else {
         return false;
      }
         
   }//end wordCheck method
} //end GuessWord class