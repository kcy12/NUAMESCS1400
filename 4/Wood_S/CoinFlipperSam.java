/**********************
* Samuel Wood
* 
*
* Last edited 1/23/18
**********************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipperSam{
   public static void main (String[] args){
        //init variables
        Scanner in = new Scanner(System.in);
        int count = 0;
        int heads = 0;
        int flips = 0;
        //great user
        System.out.println("Welcome to to the coin flip Simulator");
        System.out.println("How many times should I flip the coin.");
        //prompt for number of coin flips
        flips = in.nextInt();
        //save number
        //call the flipper method
        heads = flipper(flips,0);
        //display success message
        System.out.println("The coin has been fliped 50 times");
        //display number of heads and tails
        System.out.println("There were" + heads + " heads " + (flips - heads) + " tails."); 
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random ran = new Random();
      //set starting point for pseudo random number list
      ran.setSeed(seed);
      //initilize variables
      int heads = 0;
      int count = 0;
      int coin = ran.nextInt(2);
      //flip coin nFlips times
      while(count< nFlips){
         count ++;
         if (coin==0){
            heads ++;
         }
         coin = ran.nextInt(2);
      }//end while loop
        return heads;
   }//end flipper method

}//end CoinFlipperSam