/*******************************************
*Connor Bigler
*Coin Flip in Java
*
*Last edited 1/23/18
*******************************************/
import java.util.Scanner;
import java.util.Random;
public class CoinFlip
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      //intialize variables
      int nFlip = 0;
      int heads = 0;
      int count = 0;
      //greet user
      System.out.println("Welcome to the Coin Flipper system, please enter how many times you want to flip the coin:");
      nFlip = in.nextInt();
      //save number
      
      //call flipper method
      heads = Flipman(nFlip,0);
      //display success message
      System.out.println("coins being flipped");
      //display number of heads and tails
      System.out.println("heads:");
      System.out.println(heads);
      System.out.println("tails:");
      System.out.println(nFlip - heads);
      }//end method main
   public static int Flipman(int nFlip, int seed)
   {
   //creates random object
      Random rand = new Random();
   //set the starting point for pseudo random number list
      rand.setSeed(seed);
   //initalize variables
      int heads = 0;
      int count = 0;
      int coin = rand.nextInt(2);
   //flip coin nFlips times
      while (count < nFlip)
      {
         count ++;
         if (coin == 0)
         {
            heads ++;
         }
         coin = rand.nextInt(2);
      }//end while loop
   //return count
      return heads;
           
   }//end flipper method
}//end CoinFlip class
