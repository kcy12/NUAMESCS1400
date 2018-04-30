import java.util.Scanner;


public class straightTest {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int [] dice = new int[5];
      for (int i = 0; i < 5; i++) {
         dice[i] = scnr.nextInt();
      }
      System.out.println(print_score(dice));
   }//end main
   
   public static int[] kinds(int[] dice) {
      int i;
      int j;
      int [] kind = new int[6];
      boolean boo;

      for (i = 0; i < 5; i++){
         for (j = 1; j < 7; j++){
            //println("test loop");
            if (dice[i] == j) {
               kind[j - 1] +=1;
            }//end if
         }//end if
      }//end for 
      return kind;
   }//end int method
   
   
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
            dice[i -1] = dice[i] -dice[i-1];                                   ////////////////PUT THIS IN NORMAL PROGRAM FUCKFACE
            dice[i] = dice[i] - dice[i-1];
            i=0;
         }      
      }//sorting
      //print sorted
      String sortString = "";
      for (int i = 0; i < 5; i++) {
         sortString = sortString.concat(dice[i] + " ");
      }
      System.out.println(sortString);
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
      for (int i = 0; i < 6; i++) {
         if (kind[i] == 5) {
            returnString = "Yahtzee";
         }
      }
      
      
      ////////////////////////////////////////////////////////////end of kind tests
      
      
      return returnString;    
   }//end print Score 
}//end class