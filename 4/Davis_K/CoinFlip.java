/*******
*Kaylin Davis
*Hello World Modification
*Last edited: 01/23/18
*********/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //intialize values
      Scanner in = new Scanner(System.in); 
      int heads = 0;
      //greet user
       System.out.println("Welcome to the Coin Flipper program!");
      //prompt for number of coin flips
      System.out.println("Please enter the number of times you would like to flip the coin.");
      //save number
        int nFlips = in.nextInt();
      //call flipper method
         heads = flipper(nFlips, 0);
      //display success message
         System.out.println("Your coin has been flipped.");
      //display number of heads and tails
      System.out.println("There were " + heads + " and " + (nFlips - heads) + " tails.");
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
      while (count < nFlips){
         count ++;
         if (coin == 0){
            heads++;
         }
         coin = rand.nextInt(2);
      }//end while loop
      //return heads
      return heads;
   }//end flipper method
   
}//end class