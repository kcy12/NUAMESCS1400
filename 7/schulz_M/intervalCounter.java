/*********************
Mason Schulz
intervalCounter
Last Edited: date
**********************/
import java.util.Scanner;

public class intervalCounter{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
      //init vars
      int start = 0;
      int end = 0;
      int countBy = 0;
      //greet
      System.out.println("What's poppin Bimjo? I'mma count for you.");
      //prompt input 1
      System.out.print("Where should I start?");
      //save input 1
      start = input.nextInt();
      //prompt input 2
      System.out.print("Where should I end?");
      //save input 2
      end = input.nextInt();
      //prompt input 2
      System.out.print("What do I count by?");
      //save input 2
      countBy = input.nextInt();
      //call counter method
      counter(start, end, countBy);
   }//main\\
   //counter
   public static void counter(int uStart, int uEnd, int uCountBy){
      //for
      for (int i = uStart; i <= uEnd; i += uCountBy){
         //print count
         System.out.print(i + " ");
         }//for loop\\

    }//counter\\


}//end intervalCounter class\\