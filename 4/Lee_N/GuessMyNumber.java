/**********************
*Nick Lee
*Guess My Number
*
*Last Edited: 3-8-2018
**********************/

import java.util.Scanner;
import java.util.Random;

// main
public class GuessMyNumber {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      String check;
      int start;
      int end;
      int seed;
      int correctNum;
      int userGuess = -1;
      int guess = 6;
   
      System.out.println("Welcome to guess my number!");
      System.out.println("You will have 6 tries to guess the number.");
      //low number first
      System.out.println("What is the lowest number that can be guessed?");
      start = scnr.nextInt();
      //high number second
      System.out.println("\nWhat is the highest number that can be guessed?");
      end = scnr.nextInt();
      
      correctNum = genRandNum(start, end, 6);
      
      while(guess > 0){
         System.out.println("What is your guess?");
         userGuess = scnr.nextInt();
         
         check = hiLow(correctNum, userGuess);
         System.out.println(check);
         if (userGuess == correctNum){
            guess = 0; //break
         }//end if
         guess --;
      }//end while
      
      //win statements
      if (userGuess == correctNum){
       System.out.println("Your number was " + userGuess + " and you are correct!");  
      } else if (userGuess < correctNum){
       System.out.println("Your number was too low.");
       System.out.println("The correct number was " + correctNum);
      } else if (userGuess > correctNum){
       System.out.println("Your number was too high.");
       System.out.println("The correct number was " + correctNum);
      } else {
         System.out.println("Something went wrong with the win statements.");
      }//end win statements
      
   }//end main
   
   // genRandNum(start, end, seed)
   public static int genRandNum (int start, int end, int seed){
      Random rand = new Random(seed);
      int randNum = rand.nextInt(end - start) + start;
      System.out.println(randNum);
      return randNum;
   }//end genRandNum

   // hiLow(correct number, user guess)
   public static String hiLow(int correctNum, int userGuess){
      //if correct
      if (userGuess == correctNum){
         return "That's my number!";
      }
      //if guess is low
      if (userGuess < correctNum){
         return "Higher...";
      }
      //if guess is high
      if (userGuess > correctNum){
         return "Lower...";
      }
      return "S";
   }//end hiLow
}//end class