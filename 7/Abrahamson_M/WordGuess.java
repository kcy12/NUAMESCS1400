import java.util.Scanner;
// METHODS USED .charAt() .indexOf()
public class WordGuess //class
{
   public static void main(String[] args) //main
   {
      Scanner input = new Scanner(System.in);         //establish scanner
      String word = "random";//init vars
      String letterInput;
      char userChar;
      boolean charBool;
      boolean wordBool;
      String guess;
      System.out.println("welcome to the word guess program");//greet user
      System.out.println("What lettter would you like to guess? You have 7 tries total");
      System.out.println("The word is six letters long");
      for(int i = 0; i <7;i++)//guessing loop
      {
         letterInput = input.next();
         userChar = letterInput.charAt(0);//user input
         charBool = charCheck(word,userChar); //call charCheck
         System.out.println("The letter inputed is " + charBool);  //display if char is in string or not
      }   
      System.out.println("you are out of guesses please guess the word");  //out of guesses - guess word
      guess = input.next();
      wordBool = wordCheck(word,guess);
      System.out.println("Your guess for the word is " + wordBool);
   }
   public static boolean charCheck(String word, char userChar)//charCheck(word, guess)
   {
      if(word.indexOf(userChar) != -1) //if char in string
      {
         return true; //return true
      }   
      else  //else
      {
         return false;
      }   
         //return false
   }      
   public static boolean wordCheck(String word, String guess) //wordCheck(word, guess)
   {
      if(word.equals(guess))//if guess is word
      {
         return true;
      }
      else
      {
         return false;
      }   
   } 
}   