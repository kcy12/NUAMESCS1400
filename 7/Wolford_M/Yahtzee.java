import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random r = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      int[] dice = new int[5];
      int seed = 10;
      int i = 0;
      int temp;
      
      //generate the initial dice roll - save it in an int[5] 
      for (i = 0; i < 5; i++) {
         int die = (r.nextInt(5) + 1);
         dice[i] = die;
      }
      System.out.println("The dice fall:");
      System.out.print(print_dice(dice));
      
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      
      //keep asking until giving an input that is within range
         
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = (scnr.nextInt() - 1);
            System.out.println();//newline
            
            //validate dice reroll number
            if (temp < 0 || temp > 6){
               System.out.println("That is not a valid number");
               temp = scnr.nextInt();
               temp -= 1;
            }
            //reroll selected die
            dice[temp] = (r.nextInt(5) + 1);
            rroll -= 1;
         }//end re-roll die selection

         if(rroll>0){//only ask if there are rerolls left
            System.out.println("The dice fall:");
		      System.out.print(print_dice(dice));
   		   System.out.print("How many dice would you like to hold? ");
   		   hold = scnr.nextInt();
            System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      System.out.print(print_dice(dice));
  
      //Display score
      System.out.println("Score:");
      System.out.print(print_score(dice));
      scnr.close();
      
   }//end main method


//String print_dice(int[] dice)
   public static String print_dice(int[] dice) {
      //init vars etc
      String returnString = "";
      //making string
      for (int i = 0; i < 5; i++) {
         returnString = returnString.concat(dice[i] + " ");
      }
      return returnString;  
   }//end print_dice method
   
//int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice) {
      int[] kindArray = new int[6];
      int i;
      int j;

      for (i = 0; i < 5; i++) {
         for (j = 1; j < 7; j++) {
            if (dice[i] == j) {
               kindArray[j-1] += 1;
            }//end if
         }//end for
      }//end for
   return kindArray;
   }//end kinds

//String print_score(int[]dice) method
   public static String print_score(int[] dice) {
   int i;
   int j;
   int [] kindArray2 = new int[6];
   String result = ("You did not score anything noteworthy.");
   kindArray2 = kinds(dice);
   boolean booLS = false;
   boolean booSS = false;

   for(j = 0; j < 6; j++){
      if(kindArray2[j] == 2) {
         for(i = 0; i < 6; i++){
            if(kindArray2[j] == 3) {
               result = "Full House";
            }//end of if
         }//end of for
      }//end of if
   }// end of for
   
   for(j = 0; j < 6; j++){
      if(kindArray2[j] == 3) {
         result = "3 of a Kind";
      }//end if 
   }//end for
         
   for(j = 0; j < 6; j++){
      if(kindArray2[j] == 4) {
         result = "4 of a Kind";
      }//end if
   }//end for
   
   for(i=1; i < 5;i++) {
         if(dice[i] < dice[i-1] ){
            dice[i] =dice[i] +dice[i-1];
            dice[i -1] = dice[i] -dice[i-1];
            dice[i] = dice[i] - dice[i-1];
            i=0;
         }      
      }
      for(i = 0; i < 5;i++) {
         System.out.println(dice[i]);
      }

      for(i = 0; i < 3;i++) {
         if(dice[i + 1] == (dice[i] + 1)){
            booSS = true;
         }
         else{
            booSS = false;
         }
      }
      for(i = 0; i < 4;i++) {
         if(dice[i + 1] == (dice[i] + 1)){
            booLS = true;
         }//end if
         else{
            booLS = false;
            break;
         }//end if result
      }//end if reslut
      if(booSS== true) {
         result = "Small Straight";
      }
      if(booLS == true) {
         result = "Large Straight";
      }//end if result        
   for(j = 0; j < 6; j++){
      if(kindArray2[j] == 5){
         result = "Yahtzee";
      }//end if
   }//end for
   return result;   
   /*this methiod returns a string representation of the different winning values. The test for this method is worth 7 points.
   possible return values
	      rep = "Yahtzee"; all dice the same value
	      rep = "Large Straight"; all dice in sequential order
	      rep = "Small Straight"; 4 dice in sequential order
	      rep = "4 of a Kind"; 4 dice with the same value
	      rep = "Full House"; 3 dice with the same value and another 2 dice with the same value
	      rep = "3 of a Kind"; 3 dice with the same value
	      rep = "You did not score anything noteworthy."; anything else
   */
      
   }//end print score

}//end class Main