/****************
*Braden Worley
*Coin Flip
*flipps a coin a random ammount of times
*Last edit 1/23/18
***************/

import java.util.Scanner;
import java.util.Random;



public class CoinFlip{
   public static void main(String[] args){
      //init variables
      int nFlips = 0;
      int tails = 0;
      int heads = 0;
      //Greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //prompt for number of coin flips
      Scanner in = new Scanner(System.in);
      System.out.println("How many times should I flip the coin: ");
      //save number
      nFlips = in.nextInt();
      //call flipper method
      heads = flipper(nFlips, 0);
      tails = nFlips - heads;
      //display success message
      System.out.println("The coin has been flipped " + nFlips + "times.");
      //display number of heads and tails
      System.out.println("the coin was heads " + heads + "times and it was tails " + tails + "times.");
   }//end main
      
   public static int flipper(int nFlips, int seed){
      //create random object
      Random rand = new Random();
      //set starting point for pseudo rnadomm number list
      rand.setSeed(seed);
      //initalize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coing nFlips times 
      while(count < nFlips){
         count ++;
         coin = rand.nextInt(2);
         if (coin==0){
            heads++;
         }//end if statement
      }//end while loop
      return heads;
      //return count
      
   }//end flipper class
      
}//end class