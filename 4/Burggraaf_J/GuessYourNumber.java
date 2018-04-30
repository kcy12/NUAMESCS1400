/******************
*JJ Burggraaf
*Guess Your Number
*
*Last edited: 3/25/18
******************/
import java.util.Scanner;
import java.util.Random;
public class GuessYourNumber{
   //global vars
   //high = 100
   static int high = 100;
   //low = 1
   static int low = 1;

   //main
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   //init vars
   String userInput;
   int tries = 5;
   int guess;
   int seed = 35;
   //greet user
   System.out.println("Welcome to the Guess Your Number Game!");
   System.out.println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
   System.out.println("After each guess, tell me if I'm HIGH or LOW.");
   System.out.println("If I guess your number, let me know by typing CORRECT.");
   //guessing loop
   while (tries >= 0) {
      if(high==low) {
         guess = high;//keep the program from breaking
      }//if
      else {
         //get a new guess from guessRange
         guess = guessRange(low, high, seed);
      }//else
      //prompt for response
      System.out.println("Was my guess too HIGH or too LOW?");
      //get response
      userInput = scnr.next();
      //call response(user response, computer guess)
      response(userInput, guess);
      //increment tries
      tries--;
      if (high==low){
         tries = -1;
      }
   }//end guessing loop
   //branching for displaying win or lose
   if (high==low){
      System.out.println("I successfully guessed your number!");
   }//if
   else {
      System.out.println("Well looks like you outsmarted me for once.");
   }//end win or lose branching
   }//end main
//guessRange(low, high, seed)
   public static int guessRange(int lowLocal, int highLocal, int seedLocal){
      int guessLocal;
      Random rand = new Random();
      rand.setSeed(seedLocal);
      guessLocal = rand.nextInt((highLocal - lowLocal)) + lowLocal;
      System.out.println("I am going to guess: " + guessLocal);
      return guessLocal;
   }//end guessRange
//response(user response, computer guess)
   public static void response (String userResponse, int comGuess){
   //branching to change global high and low variables based on user response
      if (userResponse.equalsIgnoreCase("high")){
         high = comGuess - 1;
      }
      else if (userResponse.equalsIgnoreCase("low")){
         low = comGuess + 1;
      }
      else if (userResponse.equalsIgnoreCase("correct")){
         high = comGuess;
         low = comGuess;
      }
      else {
         System.out.print("Invalid Response");
      }//end if statments
      return;
   }//end response
}//end GuessYourNumber