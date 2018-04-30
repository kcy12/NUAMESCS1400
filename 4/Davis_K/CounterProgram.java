/******
*Kaylin Davis 
*Counter Program
*Last edited: 01/25/2018
*******/

//header
import java.util.Scanner;
//class
public class CounterProgram{
   //main
   public static void main(String[] args){
      //init vars
      Scanner in = new Scanner(System.in);
      int start = 0;
      int endPoint = 0;
      int count = 0;
      //greet user
      System.out.println("Welcome to the Counter Program.");
      //prompt value x3
      //save value x3
      System.out.println("What number should I start at?");
      start = in.nextInt();
      System.out.println("What number should I end at?");
      endPoint = in.nextInt();
      System.out.println("What should I count by?");
      count = in.nextInt();
      //call counting method
      counter(start, endPoint, count);
  }//end main
   //counting
   public static void counter(int start, int endPoint, int count){
      //for
      for(int i = start; i<=  endPoint; i += count){
      System.out.println(i);

      }//end for loop
      //print count
   }//end counter
}//end class