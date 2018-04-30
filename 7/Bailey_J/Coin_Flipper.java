/*******************************************
* Jaden Bailey
* Coin_Flipper
* 1/24/18
*******************************************/
import java.util.Scanner;
import java.util.Random;

public class Coin_Flipper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //initialize variables
      int nFlips = 0;
      int seed = 0;
      int heads1 = 0;
      //great user
      System.out.println("Welcome to the coin flippers, I will flip");
      System.out.println("coins for you and tell you how many heads");
      System.out.println("and tails you got");
      //prompt number of flips
      System.out.print("put in the number of flips you want ");
      //save flips
      nFlips = input.nextInt();
      Coin_Flipper.flipper(nFlips, seed);
      //get heads from flipper, seed = 0
      heads1 = Coin_Flipper.flipper(nFlips, seed);
      //display number of heads and tails
      nFlips -= heads1;
      System.out.println();
      System.out.println("You have " + heads1 + " heads and " + nFlips + " tails");
   }//End Main Function
      
   public static int flipper(int nFlips, int seed){
      Random rand = new Random();
      //initialize variables
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
      }//end while   
      //return heads
      return heads ;
   }//end Flipper Method   
}//End class Coin_Flipper