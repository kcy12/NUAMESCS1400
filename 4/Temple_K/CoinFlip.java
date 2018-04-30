/*************
*Kyler Temple
*Coin Flipper in Java
*
*Last Edited 1/23/18
*************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip
   {
   public static void main(String[] args)
      {
         //initialize values
         int nFlips = 0;
         int heads = 0;
         int tails = 0;
         //greet the user
         System.out.println("Welcome to the Coin Flip Simulator!");
         //prompt for number of coin flips
         System.out.println("How many times should I flip the coin: ");
         Scanner scan = new Scanner(System.in);
         nFlips = scan.nextInt(2);
         //saves number of coin flips
         tails = nFlips - heads;
         //call the flipper method
         heads = flipper(nFlips , 0);
         //display success message
         System.out.println("Flipping successful" + nFlips + "times");
         //display number of heads and tails
         tails = nFlips - heads;
         System.out.println("There were" + heads + "heads and" + tails + "tails");
      }//end main also must get 23 heads and 27 tails
      
   public static int flipper(int nFlips, int seed)
      {
      //creat random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
      //initialize variables 
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
      //flip coin nFlips times
      while(count< nFlips)
         {
         count ++;//incrementer = adds one to the value of count
         if(coin == 0)
            {
            heads ++;
            }//end if 
            coin = rand.nextInt(2);
         }//end while loop
         return heads;
      }//end flipper method
      
   }//end class