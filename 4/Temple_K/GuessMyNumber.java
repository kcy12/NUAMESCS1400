import java.util.Scanner;
import java.util.Random;
// main
public class GuessMyNumber{
   public static void main (String[] args){
   Scanner in = new Scanner(System.in); 
   int userMax;
   int userMin;
   int numGuesses = 0;
   int userGuess;
   System.out.println("Hello, welcome to the Guess My Number Game.");
   System.out.println("What is your lower guess range?");
   userMin = in.nextInt();
   System.out.println("What is your upper guess range?");
   userMax = in.nextInt();
   Random rand = new Random();
      int  compNum = rand.nextInt(userMax - userMin) + userMin;
   for (numGuesses = 0; numGuesses < 6; numGuesses++){
      System.out.println("What is your guess?");
      userGuess = in.nextInt();
      System.out.println (hiLow(compNum, userGuess));
      if (hiLow(compNum, userGuess) == "That's my number!"){
         break;
         }//end 
      System.out.println("You have " + (5 - numGuesses) + " guesses left.");
   }//end for loop
   if (numGuesses == 6){
      System.out.println("You have reached the maximum number of tries. The number was: " + compNum);
   }
   }//end main
// genRandNum(start, end, seed)
   public static int genRandNum (int userMin, int userMax, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int  compNum = rand.nextInt(userMax - userMin) + userMin;
      
      return compNum;
   }//end genRandNum
// hiLow
   public static String hiLow (int compNum, int userGuess){
      //if correct
      if (userGuess == compNum){;
         return "That's my number!";
      
      }
      //if guess is low
      else if (userGuess < compNum){;
         return "Higher...";
      }
      //if guess is high
      else {;
         return "Lower...";
      }
   }// end hiLow
   }