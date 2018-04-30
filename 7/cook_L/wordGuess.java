/************************
*Logan Cook
*Guess Word
*Last Edited: 2-15-18
************************/

import java.util.Scanner;

//class
public class wordGuess{
   //main
   public static void main(String[] args){
   
      Scanner scanner = new Scanner (System.in);
      
      //init vars
      String sWord = "intimidate";
      String userInput;
      char userChar;
      int i;
      boolean cLetter = false;
      boolean cWord = false;
      
      //greet user
      System.out.println("Welcome To Guess My Word!");
      
      //guessing loop
      for (i = 0; i < 9; ++i){
         //user input
         System.out.println("Guess a Letter?");
         userInput = scanner.next();
         userChar = userInput.charAt(0);
         
         //call charCheck
         cLetter = charCheck(sWord, userChar);
         
         //display if char is in string or not
         if (cLetter)
         {
            System.out.println(userChar +" is a letter in the word!");
         }
         else
         {
            System.out.println(userChar +" is not a letter in the word!");
         }
         System.out.println("Guesses left: "+ (9 - i));
      }

      //out of guesses - guess word
      System.out.println("You ran out of guesses. Know the word? ");
      userInput = scanner.next();
      
      //display win or lose
      cWord = wordCheck(sWord, userInput);
      if(cWord)
      {
         System.out.println("Congrats, You Guessed The Word!");
      }
      else
      {
         System.out.println("You didn't get it right. The Word Was: "+ sWord);
      }

   }//end main
   
   //charCheck(word, guess)
   public static boolean charCheck(String word, char userChar){

      //if char in string
      if (word.indexOf(userChar) != -1){

         //return true
         return true;
      }

      //else
       else
      {
          //return false
          return false;
      }
   }
         
   //wordCheck(word, guess)
   public static boolean wordCheck(String word, String userInput){
      //if guess is word
      if (word.equals(userInput))
      {
         //win
         return true;
      }
      //else
      else
      {
         //lose
         return false;
      }
   }
}//end class wordGuess