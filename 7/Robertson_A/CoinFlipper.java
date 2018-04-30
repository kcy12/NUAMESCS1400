/************************
* Alysha Robertson
* Coin Flipper
* Last Edited: 1/24/18
************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init vars
      int heads = 0;
      int tails = 0;
      int count = 0;
      int coin = 0;
      //greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //prompt number of flips
      System.out.print("How many times should I flip the coin? ");
      //save flips
      count = input.nextInt();
      //get heads from flipper, seed = 0
      heads = flipper(count,0);
      tails = count-heads;
      //display number of heads and tails
      System.out.println("The coin has been flipped " + count + " times.");
      System.out.print("There were " + heads + " heads and " + tails + " tails."); 
      
   }//end main method
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //flip a coin
      coin = rand.nextInt(2);
      //while loop
      while (count < nFlips){
         //count flips
         count ++;
         //if heads
         if (coin == 0){
            heads ++;
         }//end if statement
         //flip coin again
         coin = rand.nextInt(2);
         }//end while loop
      return heads;
   }//end flipper method
}//end class CoinFlipper