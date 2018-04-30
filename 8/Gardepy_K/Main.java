/***********************
*Kacie Gardepy
*Yahtzee Program
*Last Edited: 03/30/2018
***********************/

//copy in code from ZYBOOKS

import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random r = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed

      
      //generate the initial dice roll - save it in an int[5]
      //add the other variables or else the program wont work lol 
      int i;
      int [] dice = new int[5];
      int temp; 
      System.out.println("The dice fall:");
      //print(print_dice(dice))
      System.out.print(print_dice(dice));
      
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      
      //keep asking until giving an input that is within range
      
      if (hold > 5){
         //error
         System.out.print("How many dice would you like to hold? ");
         hold = scnr.nextInt();
      }//end if statement
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = scnr.nextInt();
            System.out.println();//newline
            
            //validate dice reroll number
           
            //reroll selected die
                        
         }//end re-roll die selection
      
      if(rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   //print_dice(dice)
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      //print(print_dice(dice))
      System.out.print(print_dice(dice));
  
      //Display score
      System.out.println("Score:");
      //print(print_score(dice))
      System.out.print(print_score(dice));
      scnr.close();
      
   }//end main method


//MAKE SURE THIS WORKS RIGHT DOWN BELOW LMAO
//String print_dice(int[] dice)
   public static String print_dice(int[] dice){
   /*This method creates a string representation of the dice array seperated by " "
   ie. rep = "1 2 3...", full credit will be given with or without a trailing " "
   */
   }//end string print dice

//int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice){
   /*this method counts the number of unique values and stores them in an int array
   ie 1 3 3 4 6 yields [1,0,2,1,0,1]
   */
   }//end int kinds
   
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
   }//end string print score 

}//end class Main