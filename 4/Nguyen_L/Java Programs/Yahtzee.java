/*******************************
* Leon Nguyen
*Yahtzee
* 3/25/18 
********************************/
import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random();
      int hold = 0;//number of dice being held
      int rroll = 2;//number of rerolls allowed
      int i;
      int randNum = 0;
      int [] initRoll = new int[5];
      int temp;
      

      
      //generate the initial dice roll - save it in an int[5] 
      for(i = 0; i < 5; i++){
         randNum = (rand.nextInt(6) + 1);
         initRoll[i] = randNum;
      }
      System.out.println("The dice fall:");
      System.out.println(print_dice(initRoll));
      
      System.out.print("How many dice would you like to hold? ");
      hold = scnr.nextInt();
   
      //keep asking until giving an input that is within range
      while(hold < 0 || hold > 6){
         System.out.println("Please enter a valid number of die.");
         System.out.print("How many dice would you like to hold? ");
         hold = scnr.nextInt();
      }
      while(hold < 5 && rroll > 0){
         System.out.println("You chose to reroll "+(5-hold)+" dice.");
			for(i=0;i<(5-hold);i++){
			   System.out.print("Which die would you like to reroll? ");
            temp = scnr.nextInt();
            System.out.println();//newline
            temp -= 1;
            
            while (temp < 0 || temp > 6) {
               System.out.println("Please select a valid die.");
               temp = scnr.nextInt();
               temp -= 1;
            }//validate dice reroll number
           
            //reroll selected die
            initRoll[temp] = (rand.nextInt(6) + 1);
            
                        
         }//end re-roll die selection
         rroll -= 1;
      
      if(rroll > 0){//only ask if there are rerolls left
         System.out.println("The dice fall:");
		   System.out.println(print_dice(initRoll));
   		System.out.print("How many dice would you like to hold? ");
   		hold = scnr.nextInt();
         System.out.println();//newline
         }
      }//end re-roll loop
      
      //final dice display
      System.out.println("The final dice are:");
      System.out.println(print_dice(initRoll));
  
      //Display score
      System.out.println("Score:");
      System.out.println(print_score(initRoll));
      scnr.close();
      
   }//end main method


//String print_dice(int[] dice)
   public static String print_dice(int[] initRoll){
      int i;
      String rep = "";
   
      for(i = 0; i < 5; i++){
         rep = rep.concat(initRoll[i] + " ");
      }
      return rep;  
   }//end of print_dice

//int[] kinds(int[] dice) method
   public static int[] kinds(int[] dice){
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

   }//end of kinds
   
//String print_score(int[]dice) method
   public static String print_score(int[] dice){
      int [] kindArray = new int[6];
      int j;
      int i;
      String result = "You did not score anything noteworthy.";
      kindArray = kinds(dice);
      boolean shortStraight = false;
      boolean largeStraight = false;
      boolean fullHouse = false;
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 2) {
            fullHouse = true;
            for (i = 0; i < 6; i++){
               if (kindArray[i] == 3) {
                  result = "Full House";
               }//end if 
            }//end second for lop
         }//end if 
      }// end of for
      //3 of a kind
      if(fullHouse != true){
      for(j = 0; j < 6; j++){
         if(kindArray[j] == 3) {
            result = "3 of a Kind";
         }//end if 
      }
      }
      for(j = 0; j < 6; j++){
         if(kindArray[j] == 4) {
            result = "4 of a Kind";
         }
      }
      for(j = 0; j < 6; j++){
         if(kindArray[j] == 5){
            result = "Yahtzee";
         }
      }
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
      }//end for
      for(i = 0; i < 3; i++){
         if(dice[i + 1] == dice[i] + 1){
            shortStraight = true;
         }//end if
         else{
            shortStraight = false;
            break;
         }//end else
      }//end for
      if(shortStraight != true){
      for(i = 1; i < 4; i++){
         if(dice[i + 1] == dice[i] + 1){
            shortStraight = true;
         }
         else{
         shortStraight = false;
         break;
         }
      }
      }
      if(shortStraight == true){
         result = "Small Straight";
      }
      for(i = 0; i < 4;i++) {
         if(dice[i + 1] == (dice[i] + 1)){
            largeStraight = true;
         }//end of large
         else{
            largeStraight = false;
            break;
         }//end of else
      }//end of for
      if(largeStraight == true){
         result = "Large Straight";
      }
      return result;
   }//end print_score

}//end class Main