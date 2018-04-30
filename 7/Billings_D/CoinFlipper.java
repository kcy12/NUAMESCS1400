/***********************
*Dallin Billings
*Coin Flipper
*Last Edited: 1/24/2018
***********************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main (String[] args) {
      //init vars
      int nFlips = 0;
      int seed = 0;
      Scanner input = new Scanner(System.in);      
      //greet user
      System.out.println("Welcome to the Coin Flipper Program!");
      //prompt number of flips
      System.out.println("How many times do you want to flip the coin?");
      //save flips
      nFlips = input.nextInt();
      //get heads from flipper, seed = 0
      int heads = flipper(nFlips, seed);
      int tails = nFlips - heads;
      //display number of heads and tails
      System.out.println("The coin was flipped " + nFlips + " times.");
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
      
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
      //return heads
      return heads;      
   }//end flipper methods
}//end class