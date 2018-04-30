/*************
*David Harrington
*Coin Flipper
*
*************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper(
   public static void main(String[] args){
      //init variables
      int seed = 0;
      //greet user
      
      //prompt for number of flips
      
      //save number of flips
      
      //get heads from flipper, seed = 0
      
      //display total heads and tails
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init variables
      int heads = 0;
      int counter = 0;
      int coin = 0; 
      rand.setSeed(seed);
      //generate random number
      coin = rand.nextInt(2);
      
      //while
      while (count  < nFlips)
         //increment counter
         count ++;
         //if 
         if (coin == 0)
            //increment heads
            heads ++;
         }//end if
         
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
      
   }//end flipper
}//end class