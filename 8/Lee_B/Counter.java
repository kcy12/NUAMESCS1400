/*****************************
* Brandon Lee
* Counter program
* 1/26/18
*****************************/
import java.util.Scanner;

//class
public class Counter{
   public static void main(String[] args){
   //main
      //init vars
      Scanner s = new Scanner(System.in);
      int start = 0;
      int end = 0;
      int interval = 0;
      int num = 0;
      //greet the user
      System.out.println("Welcome to the Counter Program.");
      //prompt for imput x3
      System.out.print("What number should I start at? ");
      start = s.nextInt();
      System.out.println();
      System.out.print("What number should I end at? ");
      end = s.nextInt();
      System.out.println();
      System.out.print("What should I count by? ");
      interval = s.nextInt();
      //save input x3
      //call counter method
      num = Counter(start, end, interval);
   }
   //counter
   public static int Counter(int start, int end, int interval){
      int current = 0;
      //for
      for(int i=start; i<=end; i+=interval){
         current = i;
         System.out.print(current+" ");
         
      }
      return current;
   }
}