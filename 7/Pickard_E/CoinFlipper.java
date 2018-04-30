/**********************
* Ethan Pickard
* Coin flipper
* Last Edited: 1/24/18
***********************/

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      
      //init vars
      int nFlips = 0;
      int seed = 0;
      int heads = 0;
      int tails = 0;     
      
      //greet users
      System.out.println("Welcome to the coin flipper program!");
      
      //promt number of flips
      System.out.print("How many times would you like to flip the coin? ");
      
      //save flips
      nFlips = input.nextInt();
      
      //get heads from flipper, seed = 0
      CoinFlipper.flipper(nFlips, seed);
      heads = flipper(nFlips, seed);
      
      //display number of heads and tails
      tails = nFlips - heads;
      
      System.out.println();
      System.out.println("The coin has been flipped " + nFlips + " times");
      System.out.println("There were " + heads + " heads and " + tails + " tails.");
          
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
         
         //if head
         if (coin == 0){
            heads ++;
         }//end if statement 
           
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      
      return heads;     
   }//end flipper method
}//end class


