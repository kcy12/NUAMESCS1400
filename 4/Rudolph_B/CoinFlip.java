/************************
* Breyden Rudolph
* Coin Flip
* Last edited 1/23/18
*************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
   public static void main(String[] args){
    //init variables
    Scanner in = new Scanner(System.in);
    int heads = 0;
    int tails = 0;
    int flips = 0;
    //greet user
    System.out.println("Welcome to Coin Flip");
    System.out.println("How many flips?");
    //prompt for number of coin flips
    flips = in.nextInt();
    //save number
    //call flipper method
    heads = flipper(flips,0);
    tails = flips - heads;
    //display success message
    System.out.println("The coin has been fliped "+flips+" Times");
    //display number of heads and tails
    System.out.println("Heads: "+heads+" Tails: "+tails);
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
      while(count< nFlips){
         count ++;
         if (coin==0){
            heads ++;
         }
         coin = rand.nextInt(2);
      }//end while loop
      return heads; 
   }//end flipper method
   
}//end class 