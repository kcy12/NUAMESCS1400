import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
// main
   public static void main(String[] args){
      int start;
      int end;
      int correctNum;
      int userGuess;
      int i;
      String lowHi;
      int tries = 0;
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Welcome to Guess my Number.");
      System.out.println("You have 6 tries to guess my number.");
      System.out.println("What do you want to start at?");
      start = scnr.nextInt();
      System.out.println("What do you want to end at?");
      end = scnr.nextInt();
      
      correctNum = genRandNum(start, end, 0);
      
      for(i = 0; i < 6; ++i){
         System.out.println("What do you guess: ");
         userGuess = scnr.nextInt();
         lowHi = hiLow(correctNum, userGuess);
         
         if(!lowHi.equals("That's my number!")){
            if(!lowHi.equals("Higher...")){
               System.out.println("Lower...");
               }
            else{
               System.out.println("Higher...");
               }
            tries += 1;
            }
         else{
            break;
            }
         }
     if(tries != 6){
        System.out.println("You got the number.");
        }
     else{
         System.out.println("You did not get it, the number was " + correctNum + ".");
         }
      
      }

// genRandNum(start, end, seed)
   public static int genRandNum(int start, int end, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int correctNum = rand.nextInt(end - start) + start;
      return correctNum;
      }
// hiLow(correct number, user guess)
   public static String hiLow(int correctNum, int userGuess){
   //if correct
      if(userGuess == correctNum){
      return "That's my number!";
         }
      
   //if guess is low
      else if(userGuess < correctNum){
      return "Higher...";
         }
   //if uess is high
      else{
      return "Lower...";
         }
   }
}