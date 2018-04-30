/***********************
*Nick Lee
*Coin Flip program
*
*Last Edited: 1-23-2018
***********************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //intizailze values
      Scanner in = new Scanner(System.in);
      int nFlips = 0;
      int heads = 0;
      int tails = 0;
      //greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //propmt for coin flips
      System.out.print("How many times should I flip the coin: ");
      //save number
      nFlips = in.nextInt();
      //call the flipper method
      heads = flipper(nFlips, 0);
      tails = nFlips - heads;
      //display success message
      System.out.println("\nThe coin has been flipped " + nFlips + " times.");
      //diplay number of heads and tails
      System.out.println("There were " + heads +" heads and " + tails + " tails.");
   }// end main
   public static int flipper(int nFlips, int seed){//nFlips and seed are parameters
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random list
      rand.setSeed(seed);
      //initalize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2); //gives a 0 or 1
      //flip coin nFlips times
      while(count < nFlips){
         count ++; //adds 1   count--; minus 1
         if(coin == 0){
            heads ++;
         }//end if coin==0
         coin = rand.nextInt(2);
      }//end while count < nFlips
      //return count
      return heads;
   }// end flipper
   
}// class CoinFlip end