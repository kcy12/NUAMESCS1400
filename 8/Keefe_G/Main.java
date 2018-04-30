import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random r = new Random();
      int[] dice = new int[5];
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed

      
      //generate the initial dice roll - save it in an int[5] 
      dice[0] = r.nextInt(6)+1;
      dice[1] = r.nextInt(6)+1;
      dice[2] = r.nextInt(6)+1;
      dice[3] = r.nextInt(6)+1;
      dice[4] = r.nextInt(6)+1;
      
      System.out.println("The dice fall:");
      //print(print_dice(dice))
      System.out.println(print_dice(dice));
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      if(hold > 5 || hold < 0){
         System.out.println("Sorry, that number is wrong, please select a number within the range 0-5");
         hold = scnr.nextInt();
      }
      
      //keep asking until giving an input that is within range
         
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(int i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            int temp = scnr.nextInt();
            System.out.println();//newline
            int x = 1;
            //validate dice reroll number
            while(x != 0){
               if(temp > 0 && temp < 6){
                  dice[temp-1] = r.nextInt(6)+1;
                  x = 0;
               }
               else{
                  temp = scnr.nextInt();
               }
            }
            //reroll selected die 
         }//end re-roll die selection
      
      if(rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   //print_dice(dice)
		   System.out.println(print_dice(dice));
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
   		if(hold > 5 || hold < 0){
            System.out.println("Sorry, that number is wrong, please select a number within the range 0-5");
            hold = scnr.nextInt();
         }
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      //print(print_dice(dice))
      System.out.println(print_dice(dice));
  
      //Display score
      int [] kind = new int [6];
      kind = kinds(dice);
      for(int i = 0; i < kind.length; ++i){
         System.out.print(kind[i]);
      }
      
      System.out.println("Score: " + print_score(dice));
      scnr.close();
      
   }//end main method


//String print_dice(int[] dice)
   public static String print_dice(int[] dice){
   /*This methos creates a string representation of the dice array seperated by " "
   ie. rep = "1 2 3...", full credit will be given with or without a trailing " "
   */
   String newStr = "";
      for(int i = 0; i < dice.length; ++i){
         newStr = newStr.concat(Integer.toString(dice[i]));
         newStr += " ";
      }
      return newStr;
   }

//int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice){
   /*this method counts the number of unique values and stores them in an int array
   ie 1 3 3 4 6 yields [1,0,2,1,0,1]
   */
      int [] kinds = new int[6];
      int type1 = 0;
      int type2 = 0;
      int type3 = 0;
      int type4 = 0;
      int type5 = 0;
      int type6 = 0;
      for(int i = 0; i < dice.length; ++i){
         if(dice[i] == 1){
            ++type1;
         }
         if(dice[i] == 2){
            ++type2;
         }
         if(dice[i] == 3){
            ++type3;
         }
         if(dice[i] == 4){
            ++type4;
         }
         if(dice[i] == 5){
            ++type5;
         }
         if(dice[i] == 6){
            ++type6;
         }
      }
      kinds[0] = type1;
      kinds[1] = type2;
      kinds[2] = type3;
      kinds[3] = type4;
      kinds[4] = type5;
      kinds[5] = type6;
      return kinds;
   }
   
//String print_score(int[]dice) method
   public static String print_score(int[] dice){
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
      String x = "";
      boolean y = false;
      int [] kind = new int[6];
      kind = kinds(dice);
      for(int i = 0; i < kind.length; ++i){
         if(kind[i] == 5){
            x = "Yahtzee";
            y = true;
         }
         if(kind[i] == 4 && kind[i] != 5){
            x = "4 of a Kind";
            y = true;
         }
         if(kind[i] == 3){
            x = "3 of a Kind";
            y = true;
         }
         if(kind[i] == 3){
            for(int j = 0; j < kind.length; ++j){
               if(kind[j] == 2){
                  x = "Full House";
                  y = true;
               }
            }
         }
      }
      if(kind[0] == 1 && kind[1] == 1 && kind[2] == 1 && kind[3] == 1 && kind[4] == 1){
         x = "Large Straight";
         y = true;
      }
      if(kind[1] == 1 && kind[2] == 1 && kind[3] == 1 && kind[4] == 1 && kind[5] == 1){
         x = "Large Straight";
         y = true;
      }
      if(!y){
         if(kind[0] >= 1 && kind[1] >= 1 && kind[2] >= 1 && kind[3] >= 1){
            x = "Small Straight";
            y = true;
         }
         if(kind[1] >= 1 && kind[2] >= 1 && kind[3] >= 1 && kind[4] >= 1){
            x = "Small Straight";
            y = true;
         }
         if(kind[2] >= 1 && kind[3] >= 1 && kind[4] >= 1 && kind[5] >= 1){
            x = "Small Straight";
            y = true;
         }
      }
      if(!y){
         x = "You did not score anything noteworthy.";
      }
      return x;
   }

}//end class Main