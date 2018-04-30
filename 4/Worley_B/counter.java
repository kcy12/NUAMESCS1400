/*********************
*Braden Worley
*counter
*counts by specified numbers int
*Last Edited: 1/25/18
**********************/
import java.util.Scanner;

//class
public class counter{
   //main
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in);
      //init vars
      int start = 0;
      int end = 0;
      int count = 0;
      //greet user
      System.out.println("Welcome to the Counter Program");
      
      //prompt valuex3
      //save valuex3
      System.out.println("What number should I start at?");
      start = in.nextInt();
      
      System.out.println("What number should I end at?");
      end = in.nextInt();
      
      System.out.println("What should I count by?");
      count = in.nextInt();

      //call counting method
      counting(start, end, count);
    }//end main count
   //counting
   public static void counting(int start, int end, int count){
      //for loop
      for(int i = start; i <= end; i+= count){
        System.out.print(i+" "); 
      }//end for loop
   }//end counting
}//end class