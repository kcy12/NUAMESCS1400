/********************************
*Grant Arave
*Coin Flipper
*Last Edited: 1/30/18
********************************/


import java.util.Scanner;
import java.util.Random;

//class
public class CoinFlipper
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //init vars
      int heads = 0;
      int tails = 0;
      int flips = 0;
      
      //greet user
      System.out.println("Welcome to the Coin Flipper");
      
      //prompt for scan
      System.out.println("How many flips?: ");
      flips = scan.nextInt();
      
      //Get heads and tails from flipper
      heads = flipper(flips, 0);
      tails = (flips - heads);
      
      //Display number of heads and tails
      System.out.println("The coin was flipped: "+ flips +"times");
      System.out.println("There are: "+ heads +" heads");
      System.out.println("There are: "+ tails +" tails");
      
   }//end main
   public static int flipper(int nFlips, int seed)
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
         count ++;
         //if heads
         if (coin == 0)
         {
            //increment heads
            heads ++;  
         }//end check
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      //return head value
      return heads;
   }//end flipper
}