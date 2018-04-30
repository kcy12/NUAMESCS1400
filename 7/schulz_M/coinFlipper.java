/*********************
Mason Schulz
Coin Flipper
Last Edited: 1/24/18
**********************/
import java.util.Scanner;
import java.util.Random;

public class coinFlipper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //init vars
      int heads = 0;
      int uFlips = 0;
      //greet
      System.out.println("Welcome, you weird, estranged child.");
      //prompt # flips
      System.out.print("How many coins do you wanna flip? ");
      //save flips
      uFlips = input.nextInt();
      //get heads from flipper, seed = 0 
      heads = flipper(uFlips, 0); 
      //display
      System.out.println("I flipped " + uFlips + "coins in total.");
      System.out.println("You got " + heads + " Heads and " + (uFlips - heads) + " Tails.");
      
      
      
   }//end main\\
   public static int flipper(int nFlips, int seed){
      Random r = new Random();
      //init vars\\
      int heads = 0;
      int flipsCount = 0;
      int coin = 0;
      r.setSeed(seed);
      //flip coin\\
      coin = r.nextInt(2);
      //while\\
      while  (flipsCount < nFlips){
         //count the flip\\
         flipsCount ++;
         //if heads\\
         if (coin == 0){
            heads ++;
            }//end if\\
         //flip again\\
         coin = r.nextInt(end) + start;
       }//end while loop\\
       return heads;
         
   }//end flipper\\

}//end HelloWorld\\