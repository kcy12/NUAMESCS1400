import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random r = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed

      
      //generate the initial dice roll - save it in an int[5]
      int[] diceRoll = new int[5];
      Random generator = new Random();
      for(int i = 0; i<=4; i++) {
         int roll = generator.nextInt(6) + 1;
         diceRoll[i] = roll;
      }
      
      System.out.println("The dice fall:");
      //print(print_dice(dice))
      System.out.println(print_dice(diceRoll));
      
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      
      //keep asking until giving an input that is within range
         
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(int i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            int temp = scnr.nextInt();
            System.out.println("");//newline
            
            while(temp>5 || temp<1) {
               System.out.print("Please enter a number between 1 and 5: ");
               temp = scnr.nextInt();
            }
           
            //reroll selected die
            int roll = generator.nextInt(5) + 1;
            diceRoll[temp] = roll;
            rroll = rroll - 1;
         }//end re-roll die selection
      
      if(rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   System.out.println(print_dice(diceRoll));
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      System.out.println(print_dice(diceRoll));
  
      //Display score
      System.out.println("Score:");
      System.out.println(print_score(diceRoll));
      scnr.close();
      
   }//end main method


//String print_dice(int[] dice)
   /*This methos creates a string representation of the dice array seperated by " "
   ie. rep = "1 2 3...", full credit will be given with or without a trailing " "
   */
   public static String print_dice(int[] diceRoll) {
      String diceStr = "";
      for(int i = 0; i < diceRoll.length; i++) {
         diceStr = diceStr + diceRoll[i] + " ";
      }
      return diceStr;
   }

//int[] kinds(int[] dice) method
   /*this method counts the number of unique values and stores them in an int array
   ie 1 3 3 4 6 yields [1,0,2,1,0,1]
   */
   public static int[] kinds(int[] diceRoll) {
      int sC = 0;
      int fC = 0;
      int foC = 0;
      int tC = 0;
      int twC = 0;
      int oC = 0;
      for (int x = 0; x < diceRoll.length; x++) {
         if (diceRoll[x] == 6) {
            sC++;
         }
         else if (diceRoll[x] == 5) {
            fC++;
         }
         else if (diceRoll[x] == 4) {
            foC++;
         }
         else if (diceRoll[x] == 3) {
            tC++;
         }
         else if (diceRoll[x] == 2) {
            twC++;
         }
         else if (diceRoll[x] == 1) {
            oC++;
         }
      }
      return new int[]{oC, twC, tC, foC, fC, sC};
   }
   
//String print_score(int[]dice) method
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
   public static Boolean contains(int checkVal, int[] diceRoll) {
      Boolean check = false;
      for(int i = 0; i < diceRoll.length; i++) {
         if (checkVal == diceRoll[i]) {
            check = true;
         }
      }
      return check;
   }
   
   public static String print_score(int[] diceRoll) {
      //diceRoll = new int[]{6,4,5,3,1};
      Boolean flagY = true;
      Boolean flagLS = true;
      Boolean flasSS = false;
      int sCount = 0;
      for(int i = 0; i < diceRoll.length; i++) {
         if (diceRoll[0] != diceRoll[i]) {
            flagY = false;
         }
         if (contains(i+1, diceRoll) == false && contains(6, diceRoll) == false) {
            flagLS = false;
         }
         if (contains(i+2, diceRoll) == false && contains(6, diceRoll) == true) {
            flagLS = false;
         }
      }
      if (flagLS == false && contains(1, diceRoll) == true && contains(2, diceRoll) == true && contains(3, diceRoll) == true && contains(4, diceRoll) == true) {
         flasSS = true;
      }
      else if (flagLS == false && contains(2, diceRoll) == true && contains(3, diceRoll) == true && contains(4, diceRoll) == true && contains(5, diceRoll) == true) {
         flasSS = true;
      }
      else if (flagLS == false && contains(3, diceRoll) == true && contains(4, diceRoll) == true && contains(5, diceRoll) == true && contains(6, diceRoll) == true) {
         flasSS = true;
      }
      int sC = 0;
      int fC = 0;
      int foC = 0;
      int tC = 0;
      int twC = 0;
      int oC = 0;
      for (int x = 0; x < diceRoll.length; x++) {
         if (diceRoll[x] == 6) {
            sC++;
         }
         else if (diceRoll[x] == 5) {
            fC++;
         }
         else if (diceRoll[x] == 4) {
            foC++;
         }
         else if (diceRoll[x] == 3) {
            tC++;
         }
         else if (diceRoll[x] == 2) {
            twC++;
         }
         else if (diceRoll[x] == 1) {
            oC++;
         }
      }
      if (sC >= fC && sC >= foC && sC >= tC && sC >= twC && sC >= oC) {
         sCount = fC;
      }
      if (fC >= foC && fC >= tC && fC >= twC && fC >= oC && fC >= sC) {
         sCount = fC;
      }
      else if (foC >= fC && foC >= tC && foC >= twC && foC >= oC && foC >= sC) {
         sCount = foC;
      }
      else if (tC >= fC && tC >= foC && tC >= twC && tC >= oC && tC >= sC) {
         sCount = tC;
      }
      else if (twC >= fC && twC >= fC && twC >= tC && twC >= oC && twC >= sC) {
         sCount = twC;
      }
      else if (oC >= fC && oC >= foC && oC >= tC && oC >= twC && oC >= sC) {
         sCount = oC;
      }
      if (flagY == true) {
         return "Yahtzee";
      }
      else if (flagLS == true) {
         return "Large Straight";
      }
      else if (sCount == 4) {
         return "4 of a Kind";
      }
      else if (sCount == 3 && (fC == 2 || foC == 2 || tC == 2 || twC == 2 || oC == 2 || sC == 2)) {
         return "Full House";
      }
      else if (sCount == 3 && (fC != 2 || foC != 2 || tC != 2 || twC != 2 || oC != 2 || sC != 2)) {
         return "3 of a Kind";
      }
      else if (flasSS == true) {
         return "Small Straight";
      }
      else {
         return "You did not score anything noteworthy.";
      }
      
   }
   //String print_score(int[]dice) method
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

}//end class Main