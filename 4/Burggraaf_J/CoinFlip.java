/******************
*JJ Burggraaf
*Coin Flip Simulator
*
*Last edited: 1/23/18
******************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
     //initialize variables
      Scanner in = new Scanner(System.in);
      int count = 0;
      int heads = 0;
      int flips = 0;
      //greet user
      System.out.println("Welcome to the Coin Flipper!");
      //prompt for number of coin flips
      System.out.println("How many times do you want to flip the coin?");
      //save number
      flips = in.nextInt();
      //call flipper method and make seed 0
      heads = flipper(flips,0);
      //display success message
      System.out.println("The coin has been flipped.");
      //display number of heads and tails
      System.out.println("There are " + heads + " heads " + (flips - heads) + " tails.");
   }//end main method
  
   //tells number of flips
   public static int flipper(int nFlips, int seed){
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
      //initialize variables
      int heads = 0;
      int count = 0;
      int flips = 0;
      int coin = rand.nextInt(2);
      //flip coin nFlips times
      while (count < nFlips){
         count ++;
         if (coin == 0){
            heads ++;
         }
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
   }//end flipper method
   
}//end CoinFlip class