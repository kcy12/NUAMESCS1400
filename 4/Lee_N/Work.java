import java.util.Random;

public class Work{
   public static void main(String[] args){
      System.out.println("Use this to work on a part of a bigger problem");
      int[] dice = new int[5];
      
      
      dice[0] = 1;
      dice[1] = 2;
      dice[2] = 3;
      dice[3] = 4;
      dice[4] = 5;
      
      System.out.println(print_dice(dice));
      
   }//end main
   
   //String print_dice(int[] dice)
   public static String print_dice(int[] dice){
      int i;
      String printThis = "";
      for(i = 0; i <= 4; i++){
         printThis = printThis + dice[i] + " ";
      }//end for loop
      return printThis;
   }//end print_dice
   
}//end Work