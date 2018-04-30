/********************
*Nick Lee
*Yahtzee
*
*Last Edited:
********************/

// 5 dice with 6 sides

import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random r = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      int[] dice = new int[5];
      int[] kinds = new int[6];
      int i = 5;
      int temp;
      
      //generate the initial dice roll - save it in an int[5]
      for(i = 0; i <= 4; i++){
         temp = r.nextInt(6) + 1;
         dice[i] = temp;
      }//end initial dice roll
      
      System.out.println("The dice fall:");
      //print(print_dice(dice))
      System.out.println(print_dice(dice));
      
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      
      //keep asking until giving an input that is within range
      while(hold > 5 || hold < 0){
         System.out.println("I did not understand that");
         System.out.println("How many dice would you like to hold? ");
         hold = scnr.nextInt();
      }  
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = scnr.nextInt();
            System.out.println();//newline
            
            //validate dice reroll number
            while(temp > 6 || temp < 1){
               System.out.println("I did not understand that");
               System.out.print("Which die would you like to reroll? ");
               temp = scnr.nextInt();
            }//end validate dice roll
           
            //reroll selected die
               dice[temp - 1] = r.nextInt(6) + 1;
                        
         }//end re-roll die selection
         rroll --;
      if(rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   //print_dice(dice)
         System.out.println(print_dice(dice));
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      //print(print_dice(dice))
      System.out.println(print_dice(dice));
  
      //Display score
      System.out.println("Score:");
      //print(print_score(dice))
      System.out.println(print_score(dice));
      scnr.close();
      
   }//end main method


//String print_dice(int[] dice)
   public static String print_dice(int[] dice){
      int i;
      String printThis = "";
      for(i = 0; i <= 4; i++){
         printThis = printThis + dice[i] + " ";
      }//end for loop
      return printThis;
   }//end print_dice
   
//int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice){
   /*this method counts the number of unique values and stores them in an int array
   ie 1 3 3 4 6 yields [1,0,2,1,0,1]
   */
      int i;
      int num;
      int[] kindsCheck = new int[6];// 0 to 5 ALL 6 SIDES
      for(i = 0; i <= 4; i++){//for each dice in int[] dice
         for(num = 1; num <= 6; num++){//check for 1 to 6
            if(dice[i] == num){
               kindsCheck[num - 1] ++;
            }//end if
         }//end second for loop
      }//end first for loop
      return kindsCheck;
   }//end kinds method
   
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
      String win = "";
      int[] kinds2 = new int[6];
      int i;
      int count = 0;
      int sum = 0;
      
      for(i = 0; i <= 4; i++){
         sum += dice[i];
      }
      
      kinds2 = kinds(dice);
      
      //Yahtzee = all dice the same value
      if(win.equals("")){
         for(i = 0; i <= 5; i++){
            if(kinds2[i] == 5){
               win = "Yahtzee";
            }
         }
      }//end Yahtzee
      //Large Straight = all dice in sequential order
      if(win.equals("")){
         for(i = 0; i <= 5; i ++){
            if(kinds2[i] == 1){
               count ++;
            } else if (i != 5){
               count = 0;
            }
         }//end for loop
         if (count == 5){
            win = "Large Straight";
         }
      }//end large straight
      //"Small Straight"; 4 dice in sequential order
      if(win.equals("")){
         count = 0;
         for(i = 0; i <= 5; i ++){
            if(kinds2[i] == 1 || kinds2[i] == 2){
               count ++;
            } else if (i != 5 || i != 4){
               count = 0;
            }
         }//end for loop
         if (count == 4){
            win = "Small Straight";
         }
      }//end small straight-
	   //"4 of a Kind"; 4 dice with the same value
      if(win.equals("")){
         for(i = 0; i <= 5; i ++){
            if(kinds2[i] == 4){
               win = "4 of a Kind";
            }
         }
      }//end 4 of a kind
	   //"Full House"; 3 dice with the same value and another 2 dice with the same value
      if(win.equals("")){
         int num2 = 0;
         int num3 = 0;
         for(i = 0; i <= 5; i ++){
            if(kinds2[i] == 2){
               num2 ++;
            } else if(kinds2[i] == 3){
               num3 ++;
            }
         }//end for loop
         if(num2 == 1 && num3 == 1){
            win = "Full House";
         }
      }//end full house
	   //"3 of a Kind"; 3 dice with the same value
      if(win.equals("")){
         for(i = 0; i <= 4; i++){
            if(kinds2[i] == 3){
               win = "3 of a kind";
            }
         }
      }//end 3 of a kind
	   //"You did not score anything noteworthy."; anything else
      if(win.equals("")){
         win = "You did not score anything noteworthy.";
      }//end anything else

      return win;
   }//end method print_score
}//end class Main