/*****
*Kaden Casteel
* Coin Flipper
*
**********/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //init variables
      int heads = 0;
      int tails = 0;
      int nFlips = 0;
      //greet user
      System.out.println("Welcome to the Coin Flipper Program")
      // prompt for number of coin flips
      Scanner in = new Scanner(system.in);
      System.out.println("How many times shoud I flip the coin?:")
      nFlips = in.nextInt();
      //save number
      //call flipper method, seed 0
      heads=flipper(nFlips,0);
      tails=nFlips-heads;
      //display succes message
      System.out.println("There were "+ heads+ " Heads and "+ tails +" Tails")
      //display number of heads and tails
   }//end main
   
   public static int flipper(int nFlips, int seed) {
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
      if (coin==0){
         heads ++;
         }
         coin = rand.nextInt(2);
        }//end while loop
        return heads;
     //return count
      }//end flipper method
  }// end class