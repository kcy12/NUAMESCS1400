//intro


import java.util.Random;
import java.util.Scanner;

public class YahtzeeSim {
   public static void main(String[] args) {
      //init vars etc
      Scanner scnr = new Scanner(System.in);
      int seed = 9834;
      Random rand = new Random();
      rand.setSeed(seed);
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      int[] initialRoll = new int[5];
      int[] kind = new int[6];
      int randomNum;
      int holdNum;
      String resultString = "";

      
      //generate the initial dice roll - save it in an int[5]
      for (int i = 0; i < 5; i++) {
         randomNum = (rand.nextInt(6) + 1);
         initialRoll[i] = randomNum;
      } 
      
      //print initial roll
      System.out.println("The dice fall:");
      System.out.println(print_dice(initialRoll));
      
      //hold dice?
      System.out.print("How many dice would you like to hold? ");
      holdNum = scnr.nextInt();
      
      while (holdNum < 1 || holdNum > 6) {
         System.out.println();
         System.out.println("Please input a valid option.");
         System.out.print("How many dice would you like to hold? ");
         holdNum = scnr.nextInt();
      }
         
      
      while(holdNum < 5 && rroll > 0){
         System.out.println("You chose to reroll "+(5 - holdNum)+" dice.");
			for(int i = 0; i < (5 - holdNum); i++){
			   System.out.print("Which die would you like to reroll? ");
            int temp = scnr.nextInt();
            int temp2 = temp - 1;
            System.out.println();//newline
            
            while (temp < 1 || temp > 6) {
               System.out.println("Please select a valid die.");
               temp = scnr.nextInt();
               temp2 = temp - 1;
            }//end validate while loop
           
            //reroll selected die
            initialRoll[temp2] = (rand.nextInt(6) + 1);
            
                        
         }//end re-roll die selection
         
         rroll -= 1;   
      
      if (rroll > 0) {//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   System.out.println(print_dice(initialRoll));
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
         System.out.println();//newline
         }
      
      
      
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      System.out.println(print_dice(initialRoll));
  
      //Display score
      System.out.println();
      System.out.println("Score:");
      resultString = print_score(initialRoll);
      System.out.println(resultString);
      
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////test thing
//      String testString = "";
//      kind = kinds(initialRoll);
//      for (int i = 0; i < 6; i++) {
//         testString = testString.concat(kind[i] + " ");
//      }
//      System.out.print(testString);
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////REMEMBER TO DELETE THIS
      //print(print_score(dice))
      scnr.close();
      
   }//end main method


   public static String print_dice(int[] initialRoll) {
      //init vars etc
      String returnString = "";
      
      //making string
      for (int i = 0; i < 5; i++) {
         returnString = returnString.concat(initialRoll[i] + " ");
      }
      
      return returnString;
      
   }//end print_dice method

   public static int[] kinds(int[] initialRoll) {
      /*this method counts the number of unique values and stores them in an int array
      ie 1 3 3 4 6 yields [1,0,2,1,0,1]
      */
      //init vars etc
      int[] kind = new int[6];
      
      for (int i = 0; i < 5; i++) {
         for (int j = 1; j < 7; j++) {
            //test die
            if (initialRoll[i] == j) {
               kind[j - 1] += 1;
            }// end if
         }//end nested for 
      }//end initial for
      
      return kind;
      
   }//end kinds method
   
   public static String print_score(int[] dice) {
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
      /////////////////////////////////////////////////////////// setup
      //sort numbers
      for(int i=1; i < 5;i++) {
         if(dice[i] < dice[i-1] ){
            dice[i] =dice[i] +dice[i-1];
            dice[i -1] = dice[i] -dice[i-1];                                   
            dice[i] = dice[i] - dice[i-1];
            i=0;
         }      
      }//sorting
      //print sorted
//      String sortString = "";
//      for (int i = 0; i < 5; i++) {
//        sortString = sortString.concat(dice[i] + " ");
//      }
//      System.out.println(sortString);
      //////////////////////////////////////////////////////////// setup end
      
      //init vars etc
      String returnString = ("You did not score anything noteworthy.");
      int [] kind = new int[6];
      kind = kinds(dice);
      boolean booLargeStraight = false;
      boolean booSmallStraight = false;
      int forVariable = 4;
      int falseInc = 2;
      
      ///////////////////////////////////////////////////////////kind tests
      //3 of a kind
      for (int i = 0; i < 5; i++) {
         if (kind[i] == 3) {
            returnString = "3 of a Kind";
         }
         
      }
      
      //full house
      for (int i = 0; i < 6; i++) {
         if (kind[i] == 2) {
            for (int j = 0; j < 6; j++) {
               if (kind[j] == 3) {
                  returnString = "Full House";
               }
            }
         }
      }
      
      
      //4 of a kind test
      for (int i = 0; i < 5; i++) {
         if (kind[i] == 4) {
            returnString = "4 of a Kind";
         }
      }
      
      //Small Straight
      if (dice[3] == dice[4] || (dice[3] + 2 == dice[4])){
         forVariable -= 1;
      }
      for(int i = 0; i < forVariable;i++) {
         if (falseInc == 0) {
            break;
         }
         else if(dice[i + 1] == (dice[i] + 1)){
            booSmallStraight = true;
         }
         else{
            falseInc -= 1;
            booSmallStraight = false;
         }
      }
      if(booSmallStraight == true) {
         returnString = "Small Straight";
      }
      
      //Large Straight
      if (dice[0] == 1) {
         for (int i = 0; i < 4; i++) {
            if (dice[i] + 1 == dice[i + 1]) {
               booLargeStraight = true; //returnString = "Large Straight";
            }
            else {
               booLargeStraight = false; //returnString = "You did not score anything noteworthy.";
               break;
            }
         }
      }
      if (dice[0] == 2) {
         for (int i = 0; i < 4; i++) {
            if (dice[i] + 1 == dice[i + 1]) {
               booLargeStraight = true; //returnString = "Large Straight";
            }
            else {
               booLargeStraight = false; //returnString = "You did not score anything noteworthy.";
               break;
            }
         }
      }
      if (booLargeStraight == true) {
         returnString = "Large Straight";
      }   
      
      
      //Yahtzee
      for (int i = 0; i < 5; i++) {
         if (kind[i] == 5) {
            returnString = "Yahtzee";
         }
      }
      
      
      ////////////////////////////////////////////////////////////end of kind tests
      
      
      return returnString;
   }//end print_score method
}//end class Main