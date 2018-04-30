/**************************
/*Andrew Barton
/*Coin Flipper
/*
/*Last edited: 1/23/18
**************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //init variables
      Scanner in = new Scanner(System.in);
      int count = 0;
      int heads = 0;
      int flips = 0;
      //greet user
      System.out.println("This is coin flipper.");
      System.out.println("Input the number of flips.");
      //prompt for number of coin flips
      flips = in.nextInt();
      //save number
      //call flipper method, seed 0
      heads = flipper(flips,0);
      //display success message
      System.out.println("The coin has been flipped 50 times.");
      //display number of heads and tails
      System.out.println("There were " + heads + " heads " + (flips - heads) + " tails.");
   }//end main
   
   public static int flipper(int nFlips, int seed){
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
      //initalize variables
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
   
}//end CoinFlip