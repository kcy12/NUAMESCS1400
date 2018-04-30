/************************************************
*Michael Wolford
*Demostrates randomness by simulating a coin flip
*Last Edited: 1/24/18
************************************************/
import java.util.Scanner;
import java.util.Random;

public class Flipper{
   public static void main(String[] args){
      //init vars
      Scanner input = new Scanner(System.in);
      int nFlips = 0;
      //greet user
      System.out.print("Welcome to the Coin Flipper program");
      //prompt number of flips
      System.out.println("How many times should the coin be flipped? ");
      //save flips
      nFlips = input.nextInt();
      //get heads from flipper, seed = 0
      int heads = flipper(nFlips,0);
      //display number of heads and tails
      System.out.print("Heads was flipped " + heads);
      System.out.print("times and tails was flipped " + (nFlips-heads));
      System.out.print(" times");
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
      //while loop
      while (count < nFlips){
         //count flips
         count ++;
         //if head
         if (coin == 0){
            heads ++;
         }//end if
         //flip coin again
         coin = rand.nextInt(2);
      }//end while loop
      return heads;
   }//end flipper method
}//end Flipper class