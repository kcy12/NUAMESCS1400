/*********************************
*Faith Potter
*Coin Flip
*Last Edited: 1-24-18
*********************************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init vars
      int nFlips = 0;
      int seed = 0;

      //greet user
      System.out.println("Welcome to the Coin Flipper");
      System.out.println("Let me know how many times you want to flip the coin");
      System.out.println("and I will tell you how many heads and tails you got.");

      //prompt for number of flips
      System.out.println();
      System.out.println("How many times shall I flip the coin?: ");
      
      //save nFlips
      nFlips = input.nextInt();
      
      //get heads from flipper, seed = 0
      int heads = flipper(nFlips, seed);
      int tails = nFlips - heads;
      //display total heads vs. tails
      System.out.println("The coin was flipped " + nFlips + " times, here are your results: ");
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
      
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //generate a random number
      coin = rand.nextInt(2);
      //while
      while(count < nFlips){
         //increment counter
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads ++;
         }//flip coin again
         coin = rand.nextInt(2);
       }//end while
       //return number of heads
       return heads;
    }//end flipper
    
}//end class