/*******************************
*Zoey Beets
*Coin Flipper
*Last Edited: 1/24/18
*******************************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //scanner
      Scanner input = new Scanner(System.in);
      //init vars
      int heads = 0;
      int nFlips = 0;
      //greet user
      System.out.println("Welcome to the Coin Flipper");
      System.out.println("Input the number of flips: ");
      //prompt number of flips
      nFlips = input.nextInt();     
      //new line
      System.out.println();
      //save flips
      //get heads from flipper, seed = 0
      heads = flipper(nFlips,0);
      //display number of heads and tails
      System.out.println("The coin has been flipped"+ nFlips +" Times");
      System.out.println("There was " + heads +" heads and "+(nFlips-heads)+" tails."); 
   
   }//end main method
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //flip a coin
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //count flips
         count ++;
         //if heads
         if (coin == 0){
            //increment heads
            heads ++;
         }//end if
        //flip coin again
        coin = rand.nextInt(2);
      }//end while loop
      return heads;
   }//end flipper method
}//end class