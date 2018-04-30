import java.util.Random;
import java.util.Scanner;

public class InitDiceRollAndReroll{
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int[] dice = new int[5];
   int Hold = 0;
   int Rroll = 2;
   int seed = 0;
   int max = 6;
   int min = 1;
   dice[0] = Roll(min, max, seed);
   dice[1] = Roll(min, max, seed);
   dice[2] = Roll(min, max, seed);
   dice[3] = Roll(min, max, seed);
   dice[4] = Roll(min, max, seed);
   System.out.println("The dice fall:");
   System.out.println(print_dice(dice));
   
   
   
   
   System.out.println("How many dice would you like to hold? ");
   Hold = scan.nextInt();
   while(Hold > 5&&Hold < 5){
      System.out.print(" Please select a value within the range of one to five ");
      System.out.println("How many dice would you like to hold? ");
      Hold = scan.nextInt();
   }   
      
   
   while(Hold<5&&Rroll>0){
      System.out.println("You chose to reroll "+(5-Hold)+" dice.");
	   for(int i=0;i<(5-Hold);i++){
	   System.out.print("Which die would you like to reroll? ");
      int temp = scan.nextInt();
      System.out.println();
      dice[temp-1] = Roll(min, max, seed);
   }   
   if(Rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
         System.out.println(print_dice(dice));
		   //print_dice(dice)
   		System.out.print("How many dice would you like to hold? ");
   		Hold = scan.nextInt();
         System.out.println();//newline
         
   }   
   if(Hold==5){   
      System.out.println("The final dice are:");
      System.out.println(print_dice(dice));
   }         
            
            
            
            
      }
      System.out.println("The final dice are:");
      System.out.println(print_dice(dice));
   }
   
   
   public static int Roll(int min, int max, int seed){
      Random rand = new Random();
      int randNum;
      randNum = rand.nextInt(max - min + 1) + min;
      return randNum;
   }
   
   public static String print_dice(int[] dice){
      String newStr = "";
         for(int i = 0; i < dice.length; ++i){
            newStr = newStr.concat(Integer.toString(dice[i]));
            newStr += " ";
         }
   return newStr;
   }
   
   
   public static String print_score(int[] dice){
   
   }
   
   
   
   
}