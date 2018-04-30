/**************************
*Grant Arave
*Guess Word Program
*Last Edited: 2/15/18
**************************/

import java.util.Scanner;

//class
public class GuessWord
{
   //main
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      
      //init vars
      String word = "dice";
      String userInput;
      char userChar;
      int i;
      boolean correctLetter = false;
      boolean correctWord = false;
      
      //greet user
      System.out.println("Welcome to the Guess Word Program!");
      
      //guessing loop
      for (i = 0; i < 7; ++i)
      {
         //user input
         System.out.println("Guess a letter:");
         userInput = scanner.next();
         userChar = userInput.charAt(0);
         
         //call charCheck
         correctLetter = charCheck(word, userChar);
         
         //display if char is in string or not
         if (correctLetter)
         {
            System.out.println(userChar +" is in the word");
         }
         else
         {
            System.out.println(userChar +" is not in the word");
         }
         System.out.println("Guesses left: "+ (7 - i));
      }
      //out of guesses - guess word
      System.out.println("You are out of guesses, What is the word? ");
      userInput = scanner.next();
      
      //display win or lose
      correctWord = wordCheck(word, userInput);
      if(correctWord)
      {
         System.out.println("You did get the word, the word was: "+ word);
      }
      else
      {
         System.out.println("You didn't get the word, the word was: "+ word);
      }
   }
   
   //charCheck(word, guess)
   public static boolean charCheck(String word, char userChar)
   {
      //if char in string
      if (word.indexOf(userChar) != -1)
      {
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
   public static boolean wordCheck(String word, String userInput)
   {
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
}