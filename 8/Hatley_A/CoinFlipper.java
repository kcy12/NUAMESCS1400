/**************************************************
*Abigail Hatley
*Coin Flipper
*Last Edited: 1/24/2018
**************************************************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      //int vars
      int heads = 0;
      int flips = 0;
      //greet user
      System.out.println("Welcome to the coin flipping program!");
      //prompt number of flips
      System.out.println("How many times do you want to flip the coin? ");
      //save flips
      flips = in.nextInt();
      //get heads from flipper, seed = 0
      heads = flipper(flips,0);
      //display number of heads and tails
      System.out.println("The coin was flipped!");
      System.out.println("There are " + heads + " heads and " + (flips - heads) + " tails!");
      
   }//end main method

   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //int vars
      int heads = 0;
      int coin = 0;
      int count = 0;
      rand.setSeed(seed);
      //flip a coin
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //count flips
         count ++;
         //if heads
         if (coin == 0){
            heads ++;
         }//end if
         //flip again
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
   }//end flipper method
}//end class