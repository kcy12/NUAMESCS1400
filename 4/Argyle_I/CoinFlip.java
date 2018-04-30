/*****************************
* Ian Argyle
* Flips a coin
* 
* Last Edited: 1/23/2018
******************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args) {
      // init variables
      int nFlips = 0;
      int heads = 0;
      int tails = 0;
      // greet user
      System.out.println("Welcome to the Coin Flip Simulator");
      // prompt for number of coin flips
      Scanner in = new Scanner(System.in);
      System.out.println("How many times would you like to flip the coin? ");
      nFlips = in.nextInt();
      // call flipper method
      heads = flipper(nFlips, 0);
      tails = nFlips - heads;
      // display success message
      System.out.println("The coin has been flipped " + nFlips + " times.");
      // display number of heads and tails
      System.out.println("Heads: " + heads + " Tails: " + tails);
   } //end main
   
   public static int flipper(int nFlips, int seed) {
      // Create random object
      Random rand = new Random();
      // Set starting point for psuedo random number list
      rand.setSeed(seed);
      // Initialize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      // Flip coin nFlips times
      while(count<nFlips) {
         count ++;
         coin = rand.nextInt(2);
         if(coin==0) {
            heads ++;
         } //end if
      } //end while
      // Return heads
      return heads;
   } //end flipper
   
} //end CoinFlip