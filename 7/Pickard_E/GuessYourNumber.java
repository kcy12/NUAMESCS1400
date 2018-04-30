/**********************
* Ethan Pickard
* Guess Your Number Program
* Last Edited: 3/20/18
***********************/

import java.util.Scanner;
import java.util.Random;

public class GuessYourNumber {
//global vars
public static int highNum = 100;
public static int lowNum = 1;
public static int seed = 5000;
public static String guessCorrect = "correct";
public static String guessHigh = "high";
public static String guessLow = "low";

   public static void main(String[] args) {//main
      //init vars etc
      Scanner input = new Scanner(System.in);
      String userResponse = ""; 
      int numTries = 6; 
      int guessNum;
      
      //greet user
      System.out.println("Welcome to the Guess Your Number Game!");
      System.out.println("I have 6 tries to guess what number you're thinking of between 1 and 100.");
      System.out.println("After each guess, tell me if I'm HIGH or LOW.");
      System.out.println("If I guess your number, let me know by typing CORRECT.");
      System.out.println();
      
      //guessing loop
      guessNum = guessRange(lowNum, highNum, seed);
      
      while (numTries > 0) {
         if (userResponse.equalsIgnoreCase(guessCorrect)) {
            break;
         }
         
         //print guess
         System.out.println("My guess is " + guessNum + ".");
         
         //prompt for response
         System.out.print("Was I HIGH, LOW, or CORRECT? ");
         userResponse =  input.next();
         
         response(userResponse, guessNum);
         
         //increment tries
         numTries--;
         
         if(highNum == lowNum){
            guessNum = highNum;//keep the program from breaking
         }
         else{
            guessNum = guessRange(lowNum, highNum, seed);
         }
         
      }//end guessing loop   
         
      //branching for displaying win or loose
      
   }//end main method

   public static int guessRange(int lowNum, int highNum, int seed) {
      //make guess
      
      Random rand = new Random();
      rand.setSeed(seed);
      int guessNum = rand.nextInt(highNum - lowNum) + lowNum;
      return guessNum;
   }//end guessRange method
   
   public static void response(String userResponse, int guessNum) {
      if (userResponse.equalsIgnoreCase(guessHigh)) {
         highNum = guessNum - 1;
      }
      else if (userResponse.equalsIgnoreCase(guessLow)) {
         lowNum = guessNum + 1;
      }
      else if (userResponse.equalsIgnoreCase(guessCorrect)) {
         System.out.println("I win!");
      }  
      
   }//end response method 
}//end GuessYourNumber Class