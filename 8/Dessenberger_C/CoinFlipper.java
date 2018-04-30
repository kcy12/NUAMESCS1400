/***************************
* Cally Dessenberger
* CoinFlipper
*Last Edited:1/22/18
***************************/
import java.util.Scanner;
import java.util.Random;
public class CoinFlipper{
   public static void main(String[] args){
   //init vars
   int nFlips =0;
      Scanner scan = new Scanner(System.in);
      int heads = 0;
   //greet user
   System.out.println("Hello,this is the coin flipper");
   // prompt for number of flips\
   System.out.print("How many times should I flip the coin?  ");
   //save nFlips
   nFlips = scan.nextInt();
   //get heads from flipper, seed = 0
   heads = flipper(nFlips, 0);
   //display total heads and tails
   System.out.println("You got " +heads+" heads and "+(nFlips-heads)+" tails"); 
   }//end main
   
   public static int flipper(int nFlip, int seed){
   Random rand = new Random();
   
   //init vars
   int heads = 0;
   int counter = 0;
   int coin = 0;
   rand.setSeed(seed);
   //generate a random number
   coin = rand.nextInt(2);
      //while
      while (counter < nFlip){
         //increment counter
         counter ++;
         //if
         if (coin == 0){
             //increment heads
             heads ++;
             }//end if
          //flip coin again
          coin = rand.nextInt(2);
          }//end while
          return heads;
          //return number of heads
   }//end flipper
}//end class