import java.util.Random;
import java.util.Scanner;

public class Yahtzee{

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      int [] initRoll = new int[6];
      int randNum;
      int temp;
      //generate the initial dice roll - save it in an int[5] 
      for(int i = 0; i < 5;i++){
         randNum = rand.nextInt(6) + 1;
         initRoll[i] = randNum;
         }
      System.out.println("The dice fall:");
      //print(print_dice(dice))
      System.out.println(print_dice(initRoll));
      
      System.out.print("How many dice would you like to hold? ");
      hold = in.nextInt();
      
      //keep asking until giving an input that is within range
      while (hold < 0 || hold > 6){
         System.out.println("Please enter a valid number of die.");
         System.out.print("How many dice would you like to hold? ");
         hold = in.nextInt();
      }  
      
      while(hold<5&&rroll>0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(int i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = in.nextInt();
            System.out.println();//newline
            temp = temp - 1;
            
            //validate dice reroll number
            while (temp < 0 || temp > 6) {
               System.out.println("Please select a valid die.");
               temp = in.nextInt();
               temp -= 1;
            }
            
            //reroll selected die
           initRoll[temp] = (rand.nextInt(6) + 1);
             
         }//end re-roll die selection
      rroll = rroll - 1;
      if(rroll>0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   //print_dice(dice)
         System.out.println(print_dice(initRoll));
   		System.out.print("How many dice would you like to hold? ");
   		hold = in.nextInt();
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      //print(print_dice(dice))
      System.out.println(print_dice(initRoll));
      //Display score
      System.out.println("Score:");
      //print(print_score(dice))
      System.out.println(print_score(initRoll));
      in.close();
      
   }//end main method

//String print_dice(int[] dice)
   /*This methos creates a string representation of the dice array seperated by " "
   ie. rep = "1 2 3...", full credit will be given with or without a trailing " "
   */
public static String print_dice(int[] initRoll){
   String string = initRoll[0] + " " + initRoll[1] + 
        " " + initRoll[2] + " " + initRoll[3] + " " +
      initRoll[4];
   return string;
}  
//int[] kinds(int[] dice) method
   /*this method counts the number of unique values and stores them in an int array
   ie 1 3 3 4 6 yields [1,0,2,1,0,1]
   */
public static int [] kinds(int [] initRoll){
   int[] a = new int[6];
   for(int i= 0; i < 5; ++i){
      if (initRoll[i] == 1){
         ++a[0];
         }
      else if(initRoll[i] == 2){
         ++a[1];
         }
      else if(initRoll[i] == 3){
         ++a[2];
         }
      else if(initRoll[i] == 4){
         ++a[3];
         }
      else if(initRoll[i] == 5){
         ++a[4];
         }
      else if(initRoll[i] == 6){
         ++a[5];
         }
   }
   return a;
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
public static String print_score(int[] initRoll){
   String rep = "";
   int[] kinds = kinds(initRoll);
   if (kinds[0] == 5 || kinds[1] == 5 || kinds[2] == 5 ||
       kinds[3] == 5 || kinds[4] == 5 || kinds[5] == 5){
       rep = "Yahtzee";
       }
   else if(kinds[0] == 1 && kinds[1] == 1 && kinds[2] == 1 &&
           kinds[3] == 1 && kinds[4] == 1 || kinds[1] == 1 &&
           kinds[2] == 1 && kinds[3] == 1 && kinds[4] == 1 &&
           kinds[5] == 1){
       rep = "Large Straight";
       }
   else if((kinds[0] == 1 || kinds[0] == 2) && (kinds[1] == 1 || kinds[1] == 2) &&
           (kinds[2] == 1 || kinds[2] == 2) && (kinds[3] == 1 || kinds[3] == 2) ||
           (kinds[1] == 1 || kinds[1] == 2) && (kinds[2] == 1 || kinds[2] == 2) &&
           (kinds[3] == 1 || kinds[3] == 2) && (kinds[4] == 1 || kinds[4] == 2) ||
           (kinds[2] == 1 || kinds[2] == 2) && (kinds[3] == 1 || kinds[3] == 2) &&
           (kinds[4] == 1 || kinds[4] == 2) && (kinds[5] == 1 || kinds[5] == 2)){
       rep = "Small Straight";
       }
   else if(kinds[0] == 4 || kinds[1] == 4 || kinds[2] == 4 ||
           kinds[3] == 4 || kinds[4] == 4 || kinds[5] == 4){
       rep = "4 of a Kind";
       }
   else if(kinds[0] == 3 && kinds[1] == 2 || kinds[0] == 2 && kinds[1] == 3 ||
           kinds[0] == 3 && kinds[2] == 2 || kinds[0] == 2 && kinds[2] == 3 ||
           kinds[0] == 3 && kinds[3] == 2 || kinds[0] == 2 && kinds[3] == 3 ||
           kinds[0] == 3 && kinds[4] == 2 || kinds[0] == 2 && kinds[4] == 3 ||
           kinds[0] == 3 && kinds[5] == 2 || kinds[0] == 2 && kinds[5] == 3 ||
           kinds[1] == 3 && kinds[2] == 2 || kinds[1] == 2 && kinds[2] == 3 ||
           kinds[1] == 3 && kinds[3] == 2 || kinds[1] == 2 && kinds[3] == 3 ||
           kinds[1] == 3 && kinds[4] == 2 || kinds[1] == 2 && kinds[4] == 3 ||
           kinds[1] == 3 && kinds[5] == 2 || kinds[1] == 2 && kinds[5] == 3 ||
           kinds[2] == 3 && kinds[3] == 2 || kinds[2] == 2 && kinds[3] == 3 ||
           kinds[2] == 3 && kinds[4] == 2 || kinds[2] == 2 && kinds[4] == 3 ||
           kinds[2] == 3 && kinds[5] == 2 || kinds[2] == 2 && kinds[5] == 3 ||
           kinds[3] == 3 && kinds[4] == 2 || kinds[3] == 2 && kinds[4] == 3 ||
           kinds[3] == 3 && kinds[5] == 2 || kinds[3] == 2 && kinds[5] == 3 ||
           kinds[4] == 3 && kinds[5] == 2 || kinds[4] == 2 && kinds[5] == 3){
       rep = "Full House";
       }
   else if(kinds[0] == 3 || kinds[1] == 3 || kinds[2] == 3 || kinds[3] == 3 ||
           kinds[4] == 3 || kinds[5] == 3){
       rep = "3 of a Kind";
       }
   else{
       rep = "You did not score anything noteworthy.";
       }
return rep;
}
}//end class Main
