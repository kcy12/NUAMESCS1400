/***************************
   Garrett Keefe
   Coin Flip
   Last Edited 1/24/2018
*****************************/
   
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init variables
      int seed = 0;
      //greet user
      System.out.println("Welcome to the Coin Flip Simulator!");
      //prompt for number of flips
      System.out.println("Please enter how many times you would like to flip the coin: ");
      //save nFlips
      int nFlips = input.nextInt();
      //get heads from flipper, seed = 0
      int heads = flipper(nFlips, seed);
      //display total heads and tails
      int tails = nFlips - heads;
      System.out.println("You have "+heads+" heads and "+tails+" tails");
   }//End main
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int counter = 0;
      int coin = 0;
      rand.setSeed(seed);
      //generate a random number
      coin = rand.nextInt(2);
      //while
      while (counter < nFlips){
         //increment counter
         counter ++;
         //if
         if (coin == 0){
            //increment heads
            heads ++;
         }//end if
         //flip coin agian
         coin = rand.nextInt(2);
      }//end while
      //return heads
      return heads;
   }//end flipper
}//end class   