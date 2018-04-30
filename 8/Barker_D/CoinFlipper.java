/*
*DJ Barker
*coin flipper
*last edited 1/24/2018
*/
import java.util.Scanner;
import java.util.Random;
public class CoinFlipper{
   public static void main(String[] args){
      //init vars
      //greet
      System.out.println("Hello Welcome to coin Flipper!");
      //prompt for number of flips
      //save nFlips
      Scanner scannerObject = new Scanner(System.in);
      System.out.println("How many times do you dare flip the COIN:");
      int nFlips = scannerObject. nextInt();
      //get heads from flipper, seed = 0
      
      //display total heads and tails
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
      while (count < nFlips){
         //increment counter
         count ++; 
         //if
         if (coin == 0){
            //increment heads
            heads++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//}end while
     return heads;            
   }//end flipper
}//end class