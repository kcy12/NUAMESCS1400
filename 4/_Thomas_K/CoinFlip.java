/***************************
* Kevin Thomas
*CoinFlip
*
* Last Edited: 1/23/18
***************************/
import java.util.Scanner;
import java.util.Random;



public class CoinFlip
{
   public static void main(String[] args)
   {
     //initialize variables
     Scanner in = new Scanner(System.in);
     Random rand = new Random();
     int heads = 0;
     int count = 0;
     int yeet = rand.nextInt(400);
     //greet user
     System.out.println("Welcome to the Coin Flippity FLipper!");
     System.out.print("Enter the number of flips you would like to simulate: ");
     int flips = in.nextInt();
     heads = flippityflip(flips, yeet);
     System.out.println("The coin has been flippity flipped "+flips+" times.");
     System.out.println("There were "+heads+" heads and "+(flips - heads)+ " tails.");

   }//end main method
   public static int flippityflip(int nFlips, int seed)
   {
     //create random object
     Random rand = new Random();
     //set starting point for pseudo random number list
     rand.setSeed(seed);
     //variables
     int heads = 0;
     int count = 0;
     int coin = rand.nextInt(2);
     while (count < nFlips)
     {
       count ++;
       if (coin == 0)
       {
         heads ++;
       }
       coin = rand.nextInt(2);
     }
     return heads;
   }
}//end class HelloWorld
