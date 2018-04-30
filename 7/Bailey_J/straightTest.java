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
      int [] kindArray = new int[6];
      int j;
      int i;
      int one = 1;
      boolean booLargeStraight = false;
      boolean booShortStraight = false;
      int falseInc = 2;
      int forVariable = 4;
      String result = "You did not score anything noteworthy";
      kindArray = kinds(dice);
      
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
         result = "Short Straight";
      }
      for(i = 0; i < 4;i++) {
         //if (
         if(dice[i + 1] == (dice[i] + 1)){
            booLargeStraight = true;
         }
         else{
            booLargeStraight = false;
            break;
         }
      }
      if(booLargeStraight == true) {
         result = "Large Straight";
      }
      for (j = 0; j < 6; j++){
         if (kindArray[j] == 2) {
            for (i = 0; i < 6; i++){
               if(kindArray[i] == 3) {
                  result = "Full House";
               }//end if
            }//end for
         }//end if 
      }//end Yahtzee
      return result;
   }//end print Score 
}//end class