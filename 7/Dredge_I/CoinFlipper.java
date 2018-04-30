/********************
* Isaac Dredge
* Description:
* Last edited: 1/24/18
********************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //init vars
      int heads = 0;
      int tails = 0;
      int flips = 0;
      //greet the user
      System.out.println("Welcome to the coin flipper program!");
      System.out.print("How many flips?");
      //prompt number of flips
      flips = scan.nextInt();
      //save da flips
      //get heads from flipper, seed = 0
      heads = flipper(flips, 0);
      tails = (flips - heads);
      //display number of heads and tails
      System.out.println();
      System.out.println("The coin was flipped " + flips + " times");
      System.out.println("There are " + heads + " heads");
      System.out.println("And there are " + tails + " tails");
   }//end main
   
   public static int flipper(int nFlips, int seed) {
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //flip da coin
      coin = rand.nextInt(2);
      //while
      while (count < nFlips) {
         //count flips
         count ++;
         //if heads
         if (coin == 0) {
            //increment heads
            heads ++;
         }//end check
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      //return value of heads
      return heads;
   }//end flipper
}//end program