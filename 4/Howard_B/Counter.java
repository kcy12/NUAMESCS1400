/************************
*Brock Howard
*Number Counter
*
*Last Edited 1/25/18
************************/
import java.util.Scanner;

//class
public class Counter {
   //main
   public static void main (String[] args){
      //init vars
      int start = 0;
      int end = 0;
      int count = 0;
      Scanner in = new Scanner (System.in);
      //greet user
      System.out.println("Welcome to Number Counter");
      //prompt valuex3
      System.out.println("What number would you like to start at?");
      start = in.nextInt();
      System.out.println("What number would you like to end at?");
      end = in.nextInt();
      System.out.println("What number would you like to count by?");
      count = in.nextInt();
      
      //save valuex3
      
      //call counting method
      counting(start,end,count);
      }//end main
   //counting
   public static int counting(int start, int end, int count){
      //for
      for(int i = start;i <end;i += count){ 
         //print count
         System.out.print(i + " ");
         }//end counting
         return start;
   }
}//end Counter