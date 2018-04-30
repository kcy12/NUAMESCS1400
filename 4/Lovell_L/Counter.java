/*********************************
*Leslie Lovell
*
*Counter Program in Java
*
*Last Edited: 01/25/2018
**********************************/
import java.util.Scanner;

//class
public class Counter
{
   //main
   public static void main(String[] args)
   {
      //initialize variables
      Scanner in = new Scanner(System.in);
      int start = 0;
      int end = 0;
      int count = 0;
      
      //greet user
      System.out.println("WELCOME TO THE COUNTER!");
      
      //prompt value x3
      //save value x3
      System.out.println("WHICH NUMBER WOULD YOU LIKE TO START WITH?");
      start = in.nextInt();
      System.out.println("WONDERFUL!");
      System.out.println("WHICH NUMBER WOULD YOU LIKE TO END WITH?");
      end = in.nextInt();
      System.out.println("FANTASTIC!");
      System.out.println("AND FINALLY, BY HOW MANY NUMBERS WOULD YOU LIKE TO COUNT BY?");
      count = in.nextInt();
      
      //call counting method
      Counter(start, end, count);
   }//end main   
      
   //counting
   public static void Counter(int start, int end, int count)
   {
      //for loop
      for(int i=start; i<=end; i+=count){
         System.out.println(i+" ");
      }//end for loop
   //print count
   }//end counter
}//end class   