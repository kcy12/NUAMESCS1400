/*********************************************
*Teancum Price
*Player guesses number in a language they set
*Last Edit: 2/13/18
*********************************************/

//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;

//Main Class
public class GuessNum{
   //main method
   public static void main(String[] args) {
      //Create Scanner
      Scanner input = new Scanner(System.in);
      //Init Vars
      int seed = 14;
      int guess = 0;
      int low = 1;
      int high = 101;
      int i;
      int number;
      //Greet User
      System.out.println("Welcome to the number guessing game!");
      //Have the user set the range
      System.out.print("What should the lowest number in the guessing range be(Inclusive)?");
      low = input.nextInt();
      System.out.println();
      System.out.print("What should the highest number in the guessing range be(Exclusive)?");
      high = input.nextInt();
      System.out.println();
      //Call genRandNum
      number = genRandNum(low, high, seed);
      //Guessing loop
      for (i = 0; i < 6; ++i) {
         //Get user guess
         System.out.print("What is your guess? ");
         guess = input.nextInt();
         System.out.println();
         System.out.println(hiLow(number, guess));
         //If the guess is correct
         if (guess == number) {
            //Break
            break;
         }
         //If not, tell them how many tries they have left
         else {
            System.out.println("You have " + (5 - i) + " tries left");
         }
      }//End guessing loop
      if (guess == number) {
         System.out.println("You got it right! The number was " + guess + "!");
      }
      else {
         System.out.println("Sorry, but the number was " + number + ".");
      }
   }//End main method
   
   // genRandNum(start, end, seed) method
   public static int genRandNum(int start, int end, int seed) {    
      //Create a random object
      Random rand = new Random();
      
      //Init vars
      int number;
      
      //Set seed
      rand.setSeed(seed);
      
      //Get random number
      number = (rand.nextInt(end - start)) + start;
      return number;
      
   }//End genRandNum method
   
   // hiLow(correct number, user guess)
   public static String hiLow(int number, int guess) {
      //if correct
      if (number == guess) {
         //Tell them that it is correct
         return "That's my number!";
      }
      //if guess is low
      else if (guess < number) {
         //Tell them to guess higher
         return "Higher...";
      }
      //if guess is high
      else {
         //Tell them to guess lower
         return "Lower...";
      }
   }//End hiLow
}//End GuessNum