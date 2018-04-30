/**********************
*Matthew Abrahamson
*Coin flip
*1/24/18
************************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper
{

   public static void main(String[] args)
   {
      //init vars
      int nFlips = 0;
      int seed = 0;
      int tails = 0;
      int heads = 0;
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the coin flipper program");
      //prompt #of flips
      System.out.println("How many times would you like to flip the coin?");
      nFlips = input.nextInt();   // save flips
      //get heads from flipper, seed = 0 
      heads = CoinFlipper.flipper(nFlips, seed); //only need to call class when arugment needed is in a different class
      //display number of heads and tails
      tails = nFlips -= heads;
      System.out.println("You have " + heads + " heads and  "  + tails + " tails");
   }//end main method
   
   public static int flipper(int nFlips, int seed) //takes first sent number as flips second as seed
   {
      Random rand = new Random();
      //init vars
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //flip coin
      coin = rand.nextInt(2);
      //while loop
      while(count < nFlips)
      {
         //count flips
         count++;
         
         //if head
         if (coin == 0)
         {
         heads ++;
         }//end if  
         //flip coin again
        coin = rand.nextInt(2);   
      }//end while loop
      //return heads
      return heads;
   }//end flipper method
   
}//end class