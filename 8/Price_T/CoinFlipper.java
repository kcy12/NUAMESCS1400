/*******************************
*Teancum Price
*Flips a coin and keeps a total
*Last Edit: 1/24/18
*******************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init vars
      int flips = 0;
      int seed = 0;
      int heads = 0;
      //greet user
      System.out.println("Welcome to the coin flipper!");
      //prompt for number of flips
      System.out.print("How many times should I flip the coin? ");
      //save nFlips
      flips = input.nextInt();
      //Go to the next line
      System.out.println();
      //get heads from flipper, seed = 0
      heads = flipper(flips, 0);
      //display total heads and tails
      System.out.println("There were " + heads + " heads and " + (flips - heads) + " tails.");
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
         if (coin == 0
         ){
            //increment heads
            heads ++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//end while
      //return number of heads
      return heads;
   }//end flipper
}//end class CoinFlipper