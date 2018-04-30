/*******
*Kaden Casteel
*Counter Program
*****/
import java.util.Scanner;
//class
public class Counter{
   public static void main(String[] args){
   //main
      //init vars
      int start = 0;
      int end = 0;
      int countBy = 0;
      
     
      //greet user
      System.out.println("Welcome to the Counter Program");
      
      //prompt valuex3
      Scanner in = new Scanner(System.in);
      System.out.println("What number should I start at?");
       start = in.nextInt();
      System.out.println("What number should I end at?");
       end = in.nextInt();
      System.out.println("What should I count by?");
       countBy = in.nextInt();
      //save valuex3
      //call counting method
      count(start,end,countBy);
   //counting
   }
   public static void count(int start, int end, int countBy) {
      //for
      for(int i=start;i<=end;i+=countBy){
         System.out.println(i);
      }
   }
 }
    
         