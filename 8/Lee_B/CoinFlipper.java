/************************
* Brandon Lee
* Coin flipper program
* 1/24/18
************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      //init vars
      int count;
      int heads;
      int tails;
      //greet user
      System.out.println("Welcome to the coin flipper.");
      //prompt # of flips
      System.out.println("Number of flips? "); 
      //save nFlips
      count = s.nextInt();
      //get heads from flipper, seed = 0
      heads = flipper(count, 0);
      //display total heads and tails
      tails = (count-heads);
      System.out.println("Number of heads: "+heads);
      System.out.println("Number of tails: "+tails);
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random r = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      r.setSeed(seed);
      //generate random number
      coin = r.nextInt(2);
      //while loop
      while (count < nFlips){
         //increment counter
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads++;
         }//end if
         //flip coin again
         coin = r.nextInt(2);
      }//end while
      //return # of heads
      return heads;
   }//end flipper
}//end class