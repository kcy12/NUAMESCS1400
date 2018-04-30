/*****************
*Austin MacKinnon
*
*Coinflip program
*1/23/2018
******************/
import java.util.Scanner;
import java.util.Random;

public class CoinFlip{
   public static void main (String [] args){

   Scanner in= new Scanner(System.in);
    int nFlips = 0;
    int heads = 0;
    int tails = 0;
    //greet user

   System.out.println("Welcome to the Coin Flipper");
   System.out.println("How many times do you want to flip the coin?");
   nFlips = in.nextInt();
   
   //prompt for number of coin flips
   //save number 
   //call flipper method
   heads = flipper(nFlips, 0);
   //display success message
   System.out.println("It was flipped"+nFlips+"times.");
   //display number of heads and tails
   System.out.println("Heads:"+heads+"Tails:"+(nFlips-heads));
   
   
   }//end main
   public static int flipper(int nFlips, int seed){
      //create random object
      Random rand = new Random();
      //set starting point for pseudo random number list
      rand.setSeed(seed);
     //initialize variables
     int heads = 0;
     int count = 0;
     int coin = rand.nextInt(2);
     
     
     //flip coin nFlips times
     while(count< nFlips){
      count ++;
      if (coin==0){
         heads ++;
         }
       coin = rand.nextInt(2);
     }//end while loop
     //return count
     return heads;
      }//end flipper method
   
   
   }



//end class