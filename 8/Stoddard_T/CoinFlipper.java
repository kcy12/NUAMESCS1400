/*****************************
*Teagan Stoddard
*CoinFlipper
*Last Edited: 1/24/18
******************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner (System.in);
      //init vars
      int heads = 0;
      int nFlips = 0;
      int coin = 0;
      int seed = 0; 
      //greet user
      System.out.println ("Welcome to the Coin Flipper Simulator!");
      //prompt for number of flips
      System.out.print ("How many number of flips?: ");
      //save nFlips
      nFlips = input.nextInt();
      //get heads from flipper, seed = 0
      heads = flipper(nFlips,seed);
      //display total heads and tails
      System.out.println("The total amount of flips is: " + nFlips);
      System.out.println();
      System.out.println("The number of heads is: " + heads);
      System.out.print("The number of tails is: " + (nFlips-heads)); 
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
         if (coin ==0){
            //increment heads
            heads++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//end while
   return heads;
   }//end flipper
}//end class