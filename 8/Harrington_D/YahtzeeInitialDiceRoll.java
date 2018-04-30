import java.util.Random;
import java.util.Scanner;

public class YahtzeeInitialDiceRoll{
   public static void main(String[] args) {
   int[] InitRolls = new int[5];
   int seed = 0;
   int max = 6;
   int min = 1;
   InitRolls[0] = Roll(min, max, seed);
   InitRolls[1] = Roll(min, max, seed);
   InitRolls[2] = Roll(min, max, seed);
   InitRolls[3] = Roll(min, max, seed);
   InitRolls[4] = Roll(min, max, seed);
   System.out.println("The dice fall:");
   System.out.println(InitRolls[0]);
   System.out.println(InitRolls[1]);
   System.out.println(InitRolls[2]);
   System.out.println(InitRolls[3]);
   System.out.println(InitRolls[4]);
   }
   
   
   public static int Roll (int min, int max, int seed){
   Random rand = new Random();
   int randNum;
   
   randNum = rand.nextInt(max - min + 1) + min;
   return randNum;
   }
}