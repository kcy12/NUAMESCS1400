/************************************
*Ashton Songer
*Coin Flipper
*Flips the coin and tells you result
*Last Edited: 1/23/2018
************************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //scanner object
      Scanner in = new Scanner(System.in);
      //initalize variables
      int nFlips = 0;
      int heads = 0;
      int seed = 0;
      //greet user
      System.out.println("Hello! Welcome to the coin flipper program!\n");
      //prompt for number of coin flips
      System.out.print("How many times do you want me to flip the coin? ");
      //save number
      nFlips = in.nextInt();
      //call flipper method
      heads = flipper(nFlips, seed);
      //display success message
      System.out.println("The coin was flipped a total of " +nFlips +" times.");
      //display number of heads and tails
      System.out.println("The coin flipped onto heads a total of " +heads +" times.");
      System.out.println("The coin flipped onto tails a total of " +(nFlips - heads) +" times.");
   }//end method main
   public static int flipper(int nFlips, int seed){
      //extra space for better look
      System.out.print("\n");
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
   }//end method flipper
}//end CoinFlip class