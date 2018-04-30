/*************************
* Matt Fitzgerald 
* flips coin 100 times
* Last Edited 1/24/18
*************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //create scanner
      Scanner scan = new Scanner(System.in);
      //init vars
      int heads = 0;
      int tails = 0;
      int flips = 0;
      //greet
      System.out.println("Welcome to the coin flipper program");
      System.out.print("How many times do you want to flip the coin: ");
      //prompt number of flips
      flips = scan.nextInt();
      //save flips
      //get heads from flipper, seed = 0
      heads = flipper(flips, 0);
      tails = (flips - heads);
      //display number of heads and tails
      System.out.print("The coin has been flipped " + flips);
      System.out.print(" Heads was filpped " + heads);
      System.out.print(" time and Tails was flipped " + tails +" times");
   }//end main method
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //flip coin
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //count flips
         count ++;
         //if heads
         if (coin == 0){
            heads ++; 
         }//end if           
         // flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
   }//end flipper method
}//end class