/**********************************
*Spencer Crawford
*coin flip program
*
*Last Edited 1/23/18
**********************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      //init vars
      int flips;
      int heads;
      //greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //prompt for number of coin flips
      System.out.println("How many times should I flip the coin: ");
      //save number
      flips = in.nextInt();
      //call flipper method
      heads = flipper(flips, 0);
      //display success message
      System.out.println("The coin was flipped "+flips+" times.");
      //display number of heads and tails
       System.out.println("Heads was fliped "+heads+" times and tails "+(flips-heads)+" times.");
   }//end main
   
   public static int flipper(int flips, int seed) {
      //create random object
      Random rand = new Random(); 
      // set starting point for RNL
      rand.setSeed(seed);
      //initalize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coin flips times
      while(count<flips) {
         count ++;
         if (coin == 0) {
            heads ++;
         }//end if for heads
         coin = rand.nextInt(2);
      }//end while
      return heads;
      
   }//end flipper

}//end class