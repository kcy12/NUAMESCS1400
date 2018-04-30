/**********************
* Ethan Pickard
* Guess Word Program
* Last Edited: 2/15/18
***********************/

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
   public static void main(String[] args) { // main
      //init vars etc
      Scanner input = new Scanner(System.in);
      int lowNum;
      int highNum;
      int seed = 5000;
      int correctNum;
      int userGuess;
      String infoStatment;
      String correctStatment = "That's my number!";
      
      //greeting
      System.out.println("Welcome to the guess my number program!");
      System.out.println("You will have six guesses to guess my number.");
      System.out.println();
      
      //low number
      System.out.print("What would you like the low end number to be? ");
      lowNum = input.nextInt();
      System.out.println();
      
      //high number
      System.out.print("What would you like the high end number to be? ");
      highNum = input.nextInt();
      System.out.println();
      System.out.println();
      
      //call genRandNum and get correct number
      correctNum = genRandNum(lowNum, highNum, seed);
      
      //guessing for loop
      for (int i = 5; i >= 0; i--) {
        
         if (i == 5) {
            System.out.print("What is your first guess? ");
         }
         else {
            System.out.print("What is your next guess? ");
         }
   
         userGuess = input.nextInt();
         System.out.println();
         
         //call hiLow function and get string
         infoStatment = hiLow(correctNum, userGuess);
         
         if (infoStatment.equals(correctStatment)) {
            System.out.println(infoStatment);
            System.out.println("Congratulations! You guessed my number and the game is over.");
            break;
         }
         else {
            System.out.println(infoStatment);
            System.out.println();
         }
         
         System.out.println("You have " + i + " tries left!");
         
         if (i == 0) {
            System.out.println("Sorry, you did not guess my number :(");
            System.out.println("The correct number was " + correctNum);
         }
         
      }//end for loop
            
   
   }//end main method
   
   public static int genRandNum(int lowNum, int highNum, int seed) {
      
      Random rand = new Random();
      rand.setSeed(seed);
      
      int randNum = rand.nextInt(highNum - lowNum) + lowNum;
   
      return randNum;
   
   }//end genRandNum method

   public static String hiLow(int correctNum, int userGuess) {
      
      //if for determining string returned
      if (userGuess == correctNum) {
         String infoStatment = "That's my number!";
         return infoStatment;
      }
      else if (userGuess < correctNum) {
         String infoStatment = "Higher...";
         return infoStatment;
      }
      else {
         String infoStatment = "Lower...";
         return infoStatment;
      }
      
      
   }//end hiLow method
   
}//end GuessNumber class