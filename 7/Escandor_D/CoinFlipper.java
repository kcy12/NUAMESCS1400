/*****************
*Dana Escandor
*Coin Flipper
*Last Edited: 1/25/18
******************/

//importing
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //scanner
      Scanner input = new Scanner(System.in);
      //init vars
      int heads = 0;
      int nFlips = 0;
      
      //instructions
      System.out.println("Coin Flipper");
      System.out.print("How many coin flips would you like?: ");
      //prompt number of flips
      nFlips = input.nextInt();     
      
      
      //new line
      System.out.println();
      
      //get heads from flipper, seed = 0
      heads = flipper(nFlips,0);
      //display number of heads and tails
      System.out.println("The coin has been flipped " + nFlips + " Times.");
      System.out.println("There was " + heads + " heads" + " and " +(nFlips - heads)+" tails!"); 
   
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