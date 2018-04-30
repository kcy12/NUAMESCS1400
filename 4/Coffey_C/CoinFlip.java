/*************
*Chris Coffey
*Coin flip
*flips coin and says result
*Last edited 1/23/18
*************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //scanner object
      Scanner in = new Scanner(System.in);
      //init variables
      int nFlips = 0;
      int heads = 0;
      int seed = 0;
      //greet user
      System.out.println("Welcome to the Coin Flipper!");
      //prompt for number of coin flips
      System.out.println("Please enter the number of times to flip the coin");
      //save number
      nFlips = in.nextInt();
      //call flipper method
      heads = flipper(nFlips, seed);
      //display success message
      System.out.println("The coin has been flipped " + nFlips + " times.");
      //display number of heads and tails
      System.out.println("There were " + heads + " heads and " + (nFlips - heads) + " tails.");
   }//end main
   
   public static int flipper(int nFlips, int seed){
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
      //initalize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coin nFlips times
      while(count < nFlips){
         count ++;
         if(coin == 0){
            heads ++;
         }//end if statement
         coin = rand.nextInt(2);
      }//end while loop
      //return heads
      return heads;
   }//end flipper
}//end class