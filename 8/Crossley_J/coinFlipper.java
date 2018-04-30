/********************************************************************************
*Joshua Crossley
*coin flipper
*last updated 1/24/2018
*********************************************************************************/

import java.util.Scanner;
import java.util.Random;
public class coinFlipper{
   public static void main(String[] args){
     //init vars
     int nFlip = 0;
     int seed = 0;
     Scanner input = new Scanner(System.in);
     //great user
     System.out.println("Greatings this the coin flipper simulator");
     //prompt for # of flips 
     System.out.println("How many times should I flip the Coin?");
     //save nFlips
     int nFlips = input.nextInt();
     //get heads from flipper, seed = 0
     int heads = flipper(nFlips, seed);
     int tails = nFlips - heads;
     //display total heads and tails
     System.out.println("The coin flipped "+ nFlips +" times");
     System.out.println("There was " + heads + " heads and " + tails + " tails total"); 
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //int vars
      int heads = 0;
      int count = 0;
      int coing = 0;
      rand.setSeed(seed);
      //generate a random number\
      int coin = rand.nextInt(2);
      
      //while
      while (count < nFlips){
      
         //increment counter
         count ++;
         //if 
         if (coin == 0){
            //increment heads
            heads ++;
         }//end if
         //flip coin again
          coin = rand.nextInt(2);
        }//end while 
      //return # of heads
      return heads;
   }//end flip
}//end class