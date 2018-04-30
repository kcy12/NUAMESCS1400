/*******************************************
* Jaden Bailey
* Guess Number
* 2/15/18
*******************************************/
import java.util.Scanner;
import java.util.Random;

public class Guess_Number {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init variables
      int lowNum;
      int highNum; 
      int seed = 5555;
      int theNumber;
      int i;
      int guess;
      String result;
      //low number first
      System.out.println("What is the minimum amount you want");
      lowNum = input.nextInt();
      //TEST System.out.println(lowNum);
      
      //high number second
      System.out.println("What is the maximum amount you want");
      highNum = input.nextInt();
      //TEST System.out.println(highNum);
      
      //return genRandNum
      theNumber = Guess_Number.genRandNum(lowNum, highNum, seed);
      //TEST System.out.println(theNumber);
      //Guess Loop
      for (i = 6; i > 0; --i) {
         System.out.println();
         System.out.println("You have " + i + " tries");
         System.out.println("What number do you want to guess: ");
         guess = input.nextInt();
         result = hiLow(theNumber, guess);
         if (result.equals("That's my number!")) {
            System.out.println(result);
            break;
         }//end if
         else {
            System.out.println(result);
         }//end else
      }//end loop
      if (i > 0) {
         System.out.println("You win");
      }
      else {
         System.out.println("You lose, the number was " +theNumber);
      }
        
         
   }//end main
   public static int genRandNum(int start, int end, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int randNum = rand.nextInt(end - start) + start;
      return randNum;
   }//end genRandNm
   

   // hiLow(correct number, user guess)
   public static String hiLow (int theNumber, int guess) {
      //if correct
      if (theNumber == guess){
         return "That's my number!";
      }//end if
      //if guess is low
      else if (theNumber > guess) {
      return "Higher...";
      }//end if else
      //if guess is high
      else {
      return "Lower...";
      }//end else 
   }//end int guess
}//end guess number