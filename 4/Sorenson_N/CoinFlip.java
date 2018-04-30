/********
*Niklas Sorenson
*
*flips a coin        
*last edited 1/23/18
********/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main (String[] args){
      //initialize values
      Scanner in = new Scanner(System.in); 
      int heads = 0;
      int numFlips = 0;
      //greet user
      System.out.println("Hello, and welcome to the Coin Flipper!");
      //prompt for number of coin flips
      System.out.println("How many times will you flip the coin?");
      //save number
      numFlips = in.nextInt();
      //call the flipper method
      heads = flipper(numFlips, 0);
      //display success message
      System.out.println("You flipped " + numFlips + " coins, got " + heads + " heads and " + (numFlips - heads) + " tails .");
      //display number of heads and tails
      
   }//end main
   
   public static int flipper(int numFlips, int seed){
      //create random object
      Random rand = new Random();
      //start point for pseudo random num list
      rand.setSeed(seed);
      //initialize variables
      int headCount = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coin numFlips times
      while(count < numFlips){
         count ++;
         if(coin == 0){
            headCount ++;
         }// end if loop
         coin = rand.nextInt(2);
      }// end while loop
      //return headCount
      return headCount;
   }// end flipper
      
}//end coinflip
