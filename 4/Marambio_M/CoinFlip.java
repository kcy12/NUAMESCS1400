/*********************
*Mike Marambio
*CoinFlip
*
*Last Edited 1/23/2018
**********************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlip
{
   public static void main(String[] args) 
   {//init variables
   int heads = 0;
   int count = 0;
   int MAOUI = 0;
   Scanner in = new Scanner(System.in);
   //greet user
   System.out.println("Welcome to the Coin Flip Simulator!");
   //prompt for number of coin flips
   System.out.println("How many times should i flip the coin: ");
   //save number
   MAOUI = in.nextInt();
   //call flipper method
   heads = flipper(MAOUI,0);
   //display success message
      System.out.println("The coin has been flipped "+MAOUI+" times.");
   //display number of heads and tails

      System.out.println("there were "+heads+" heads and "+(MAOUI-heads)+" tails.");   
   

   }//end main
   
   public static int flipper(int nFlips, int seed)
   {
      //create random object
      Random rand = new Random();
     //set starting point for pseudo random number list
         rand.setSeed(seed);
     //Initialze variables
     int heads = 0;
     int count = 0;
     int MAOUI = 0;
     int coin = rand.nextInt(2);
     
     //flip coin nFlips times
     while(count< nFlips)
     {
      count ++;
      if(coin == 0)
      {
      heads ++;
      }
      coin = rand.nextInt(2);
     }//end while loop
     return heads;
   }//end flipper method
   
}//end class