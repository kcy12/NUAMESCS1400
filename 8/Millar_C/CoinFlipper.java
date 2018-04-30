/*******************
*Carson Millar
*1/24/18
*Coin Flipper
********************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //init vars
      int nFlips = 0;
      int seed = 0;
      int tails = 0;
      int heads = 0;
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the coin flipper program!");
      //prompt for number of flips
      System.out.println("How many times would you like to flip the coin?");
      nFlips = input.nextInt();
      //save nFlips
      //get heads from flipper, seed = 0
      heads = CoinFlipper.flipper(nFlips, seed);
      //display total heads and tails
      tails = nFlips -= heads;
      System.out.println("You have " + heads + " heads and " + tails + " tails");
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //generate a random number
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //increment counter
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads++;
          }//end if
         //flip coin again
         coin = rand.nextInt(2);
     } //end while loop
      //return number of heads
      return heads;
   }//end flipper
   
}//end class