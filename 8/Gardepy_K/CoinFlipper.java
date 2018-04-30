/************************
* Kacie Gardepy
* Coin Flipper Program
* Last Edited: 01/24/2018
************************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //initialize variables
      int nFlips = 0;
      int heads = 0;
      //greet user
      System.out.print("Welcome to the Coin Flipper Program!");
      System.out.print("How many times should I flip the coin?: ");
      //prompt for number of flips
      nFlips = input.nextInt();
      //save nFlips
      //get heads from flipper, seed = 0
      heads = flipper(nFlips, 0);
      //display total heads and tails 
      System.out.println("The coin has been flipped "+ nFlips +" Times");
      System.out.println("There were "+ heads +" heads and "+(nFlips-heads)+" tails");
   }//end main function
   
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //initialize variables
      int heads = 0;
      int count = 0;
      int coin = 0;
      rand.setSeed(seed);
      //generate random number
      coin = rand.nextInt(2);
      //while
      while (count < nFlips){
         //increment counter
         count ++;
         //if
         if (coin == 0){
            //increment heads
            heads ++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
       }//end while
      //return number of heads
      return heads;
   }//end flipper
}//end class