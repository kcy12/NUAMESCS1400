/***********************
*Brady Adams
*Coin Flipper
*Last Edited 1/24/2018
***********************/
import java.util.Scanner;
import java.util.Random;

public class coinFlipper {
   public static void main(String[] agrs){
      Scanner scan = new Scanner (System.in);
      //init vars
      int heads = 0;
      int tails = 0;
      int flips = 0;
      //greet user
      System.out.println("*******************");
      System.out.println("*   Welcome to    *");
      System.out.println("*       the       *");
      System.out.println("*  Coin Flipper   *");
      System.out.println("*     Program!    *");
      System.out.println("*******************");
      
      //prompt number of flips
      System.out.println("How many times would you like to flip a coin?");
      flips = scan.nextInt();
     
      //save flips
      
      //get heads from flipper, seed = 0
       heads = flipper(flips, 0);
      tails = (flips - heads);

      //display number of heads and tails
       System.out.println();
      System.out.println("The coin has flipped " + flips + " times");
      System.out.println("There was " + heads + " heads");
      System.out.println("And there are " + tails + " tails");

      }//end main method
      
      public static int flipper(int nFlips, int seed){
         Random rand = new Random();
         //init vars
         int head = 0;
         int count = 0;
         int coin = 0;
         rand.setSeed(seed);
         //flip coin
         coin = rand.nextInt(2);
         //while
         while (count < nFlips) {
            //count flips
            count ++;           
            //if heads
            if (coin == 0){
               head ++;   
            }// end if       
            //flip coin again
            coin = rand.nextInt(2);
           } //end while
         //return heads
         return head;
     } //end flipper methods
}//end class