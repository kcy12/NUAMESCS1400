/*
*Justin Whitaker
*Coin Flipper
*Last Edited: 1/22/18
*/

import java.util.Random;
import java.util.Scanner;

public class CoinFlipper{
   public static void main(String[] args){
      //greet user
      System.out.println("Hello, welcome to the Coin Flipper program!");
      //prompt for number of flips
      System.out.println("How many flips would you like? ");
      //save nFlips
      Scanner scannerObject = new Scanner(System.in);
      int nFlips = scannerObject. nextInt();
      //get heads from flipper, seed = 0
      int heads = CoinFlipper.flipper(nFlips, 0);
      //display total heads and tails
      System.out.println("The coin was flipped " + nFlips + " times.\nThere were " + heads + " heads and " + (nFlips - heads) + " tails.");
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
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//end while
      //return number of heads
      return heads;
   }//end flipper
}//end class