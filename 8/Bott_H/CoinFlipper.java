/*******************
*Holden Bott
*CoinFlipper
*Last Edited: 1/25/18
*******************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //init vars
      int nFlips = 0;
      int seed = 0;
      int heads = 0;
      int tails = 0;
      
      //make scanner
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //prompt for number of flips
      System.out.println("How many times should I flip the coin?: ");
      
      //save nFlips
      nFlips = input.nextInt();
      System.out.println();
      //get heads from flipper, seed = 0
      heads = flipper(nFlips, seed);
      tails = nFlips - heads;
      //display total heads and tails
      System.out.println("You got heads" + heads + "times");
      System.out.println("You got tails" + tails + "times");
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
            heads ++;
         }//end while
         //flip coin again
         coin = rand.nextInt(2);
      }//end while
      return heads;
   }//end flipper
}//end class