/*****************
* Jacob Baggett
* Coin Flipper
* Last edited 1/24/18
******************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args) {
      //init vars
      int nFlips = 0;
      int seed = 0;
      int heads = 0;
      int tails = 0;
      //make scanner
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to Automated Coin Flipper 1983");
      //prompt for number of flips
      System.out.print("How many times would you like to flip the coin? ");
      //save nFlips
      nFlips = input.nextInt();
      System.out.println();
      //get heads from flipper, seed = 0
      heads = flipper(nFlips, seed);
      tails = nFlips - heads;
      //display total heads and tails
      System.out.println("You got heads "+heads+" times.");
      System.out.println("You got tails "+tails+" times.");
   }//end main
   
   public static int flipper(int nFlips, int seed){
      //init vars
      Random rand = new Random();
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //generate a random number
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //increment counter to limit loop
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads ++;
            }
         //flip coin again
         coin = rand.nextInt(2);
         }
      //return number of heads
      return heads;
   }//end flipper
}//end class