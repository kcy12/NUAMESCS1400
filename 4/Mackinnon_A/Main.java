import java.util.Scanner;
import java.util.Random;
public class Main{
   
      
// main
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to the Guess My Number game! What is the low value?");
      int start = in.nextInt();
      System.out.println("What's the high value?");
      int end = in.nextInt();
      int tries = 0;
      
      int rnumber = genRandNum(start, end, 0);
      while (tries < 6){
         int guess = in.nextInt();
         hiLow(rnumber, guess);
         ++tries;
         }
      if (tries > 5){
         System.out.print("Number was " + rnumber);
         }
         
   }
      

// genRandNum(start, end, seed)
   public static int genRandNum(int start, int end, int seed){
      Random rand = new Random();
      rand.setSeed(seed);
      int c_number = rand.nextInt(end - start) + start;
      return c_number;
}      
      
// hiLow(correct number, user guess)
   public static void hiLow(int rnumber, int guess){
   //if correct
   if (guess == rnumber){
   //return "That's my number!";
   System.out.print("That's my number!");
      } 
   //if guess is low
   else if (guess < rnumber){
   //return "Higher...";
   System.out.print("Higher. . .");
   }
   //if guess is high
   else if (guess > rnumber){
   //return "Lower...";
   System.out.print("Lower. . .");
   }
   }
  }