import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      
      int randNum = 0;
      int [] initRoll = new int[5];
      int temp = 0;

      
      //generate the initial dice roll - save it in an int[5] 
      for (int i = 0; i < 5; i++) {
         randNum = (rand.nextInt(6) + 1);
         initRoll[i] = randNum;
      }
      println("The dice fall:");
      System.out.println(print_dice(initRoll));
      
      print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
      
      //keep asking until giving an input that is within range
      while(hold < 5 && rroll > 0){
         System.out.println("You chose to reroll "+(5 - hold)+" dice.");
			for(int i = 0; i < (5 - hold); i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = scnr.nextInt();
            System.out.println();//newline
            temp -=1;
            
            while (temp < 0 || temp > 6) {
               System.out.println("Please select a valid die.");
               temp = scnr.nextInt();
               temp -= 1;
            }//end validate while loop
           
            //reroll selected die
            initRoll[temp] = (rand.nextInt(6) + 1);
                        
         }//end re-roll die selection
         //incremement
         rroll -= 1;
         //continue asking 
         if(rroll>0){//only ask if there are rerolls left
            System.out.println("The dice fall:");
		      System.out.println(print_dice(initRoll));
   		   System.out.print("How many dice would you like to hold? ");
   		   hold = scnr.nextInt();
            System.out.println();//newline
         }
      }//end re-roll loop
      
      /*
      initRoll[0] = 3;
      initRoll[1] = ;
      initRoll[2] = ;
      initRoll[3] = ;
      initRoll[4] = ;
      */
      //final dice display
      println("The final dice are:");
      System.out.println(print_dice(initRoll));
  
      //Display score
      println("Score:");
      System.out.println(print_score(initRoll));
      scnr.close();
      
   }//end main method

   //String print_dice(int[] dice)
   public static String print_dice(int[] initRoll) {
      //init vars etc
      String theRoll = "";
      int i;
      
      //making string
      for (i = 0; i < 5; i++) {
         theRoll = theRoll.concat(initRoll[i] + " ");
      }
      
      return theRoll;
      
   }//end print_dice method

   //int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice) {
      int i;
      int j;
      int [] kind = new int[6];
      
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
   
   //String print_score(int[]dice) method
   public static String print_score(int[] dice) {
      int [] kindArray = new int[6];
      int j;
      int i;
      int forVariable = 4;
      boolean booLargeStraight = false;
      boolean booShortStraight = false;
      int falseInc = 2;
      String result = "You did not score anything noteworthy.";
      kindArray = kinds(dice);
	   //rep = "3 of a Kind"; 3 dice with the same value
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 3) {
            result = "3 of a Kind";
         }//end if 
      }//end 3 of a kind for 
      //rep = "Full House"; 3 dice with the same value and another 2 dice with the same value
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 2) {
            for (i = 0; i < 6; i++){
               if (kindArray[j] == 3) {
                  result = "Full House";
               }//end if 
            }//end second for lop
         }//end if 
      }//end Full House 
      //rep = "4 of a Kind"; 4 dice with the same value
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 4) {
            result = "4 of a Kind";
         }//end if 
      }//end 4 of a kind
      //rep = "Small Straight"; 4 dice in sequential order
      for(i=1; i < 5;i++) {
         if(dice[i] < dice[i-1] ){
            dice[i] =dice[i] +dice[i-1];
            dice[i -1] = dice[i] -dice[i-1];
            dice[i] = dice[i] - dice[i-1];
            i=0;
         }  //end if    
      }//end for
      

      if (dice[3] == dice[4] || (dice[3] + 2 == dice[4])){
         forVariable -= 1;
      }
      for(i = 0; i < forVariable;i++) {
         if (falseInc == 0) {
            break;
         }
         else if(dice[i + 1] == (dice[i] + 1)){
            booShortStraight = true;
         }
         else{
            falseInc -= 1;
            booShortStraight = false;
         }
      }
      if(booShortStraight == true) {
         result = "Small Straight";
      }

      //rep = "Large Straight"; all dice in sequential order
      for(i = 0; i < 4;i++) {
         if(dice[i + 1] == (dice[i] + 1)){
            booLargeStraight = true;
         }//end if
         else{
            booLargeStraight = false;
            break;
         }//end if result
      }//end if reslut
      if(booLargeStraight == true) {
         result = "Large Straight";
      }//end if result
      //FULL HOUSE 
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 2) {
            for (i = 0; i < 6; i++){
               if(kindArray[i] == 3) {
                  result = "Full House";
               }//end if 
            }//end for 
         }//end if 
      }//full house
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 5) {
            result = "Yahtzee";
         }//end if 
      }//end Yahtzee
      return result;
   }//end print scores
   //print
   public static void println(String theMessage) {
         System.out.println(theMessage);
   }//end print function
   //print
   public static void print(String theMessage) {
         System.out.print(theMessage);
   }//end print function
}//end class Main