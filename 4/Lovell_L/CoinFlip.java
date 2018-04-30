/*******************************
*Leslie Lovell
*
*Coin Flip
*
*01/23/18
*******************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip
{
   public static void main(String[] args)
   {
      //init variables
      Scanner in = new Scanner(System.in);
      int heads = 0;
      int count = 0;
      int nFlips = 0;
      //greet user
      System.out.println("WELCOME TO THE COIN FLIPPER!");
      //prompt for number of coin flips
      System.out.println("HOW MANY TIMES WOULD YOU LIKE TO FLIP THE COIN?");
      nFlips = in.nextInt();
      //save number
      //call flipper method
      System.out.println("PLEASE WAIT... THE COIN IS BEING FLIPPED...");
      heads = flipper(nFlips,0);
      //display success method
      System.out.println("THE COIN HAS BEEN SUCCESSFULLY FLIPPED! HERE ARE YOUR RESULTS!");
      //display number of heads and tails
      System.out.println("TAILS: ");
      System.out.println(nFlips - heads);
      System.out.println("HEADS: ");
      System.out.println(heads);
   }//end main
   
   public static int flipper(int nFlips, int seed)
   {
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
      //initialize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coin nFlips times
      while (count < nFlips)
      {
         count ++;
         if (coin==0)
         {
            heads ++;
         }//end if statement
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
      //return count
   }//end flipper method 
}//end class