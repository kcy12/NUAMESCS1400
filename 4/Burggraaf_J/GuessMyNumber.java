/******************
*JJ Burggraaf
*Guess My Number
*
*Last edited: 2/18/18
******************/

// main
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
   public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   int userMin;
   int userMax;
   int numGuess = 0;
   int userGuess;
   //welcome user
   System.out.println("Welcome to Guess My Number.");
   //ask for lower guess range and higher guess range
   System.out.println("What will the lower guess range be? ");
   userMin = in.nextInt();
   System.out.println("What will the higher guess range be? ");
   userMax = in.nextInt();
   Random rand = new Random();
   int compNum = rand.nextInt(userMax - userMin) + userMin;
   
   for (numGuess = 0; numGuess < 6; numGuess++) {
      System.out.println("What will your guess be? ");
      userGuess = in.nextInt();
      System.out.println(hiLow(compNum, userGuess));
      if (hiLow(compNum, userGuess) == "That's my number!"){
         break;
         } 
      System.out.println("You have " + (5 - numGuess) + " guesses left.");
   }//end for loop
   if (numGuess == 6){
      System.out.println("You have not been able to guess the number. The number was: " + compNum);
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
      else if (userGuess < compNum){
      return "Higher...";
      }
      //if guess is high
      else {
         return "Lower...";
      }
   }//end hiLow
}//end GuessMyNumber
