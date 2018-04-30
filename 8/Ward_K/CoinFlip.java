/****************
*Kade Ward
*Coin flipping dude
*1/24/18
*****************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main(String[] args){
      //init vars
      Scanner input = new Scanner(System.in);
      int user = 0;
      
      //greet user
      System.out.println("Welcome Human, how many times shall your coin be flipped?");
      //prompt number of flips
      
      user = input.nextInt();
      //save nFlips
      
      //get heads from flipper, seed =0
      int heads = flipper(user,0);
      int tails = user - heads;
      //display total heads and tails
      System.out.print("You have " + heads);
      System.out.print(" heads and " + tails);
      System.out.print(" tails.");
      
   }//end main
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      rand.setSeed(seed);
      //generate random number
      int coin = rand.nextInt(2);
      //while loop
      while (count < nFlips){
         //increment a counter for exit
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads ++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
      //return number of heads
   }//end flipper
   
}//end public class