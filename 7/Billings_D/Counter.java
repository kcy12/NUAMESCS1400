/***********************
*Dallin Billings
*Counter Program
*Last Edited: 1/30/2017
***********************/
import java.util.Scanner;

//class
public class Counter {
   //main
   public static void main(String[] args){ 
      //init vars
      int start = 0;
      int end = 0;
      int step = 0;
      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the Counter Program!");
      //prompt for start
      System.out.println("What Number do you want to start with?");
      //save start
      start = input.nextInt();
      //prompt for end
      System.out.println("What Number do you want to end with?");
      //save end
      end = input.nextInt();
      //prompt for interval
      System.out.println("What interval should I count by?");
      //save interval
      step = input.nextInt();
      //call counter method
      Counter.count(start, end, step);}
   //counter
   public static void count(int start, int end, int step){
      for(int i = start; i <= end; i += step){
         //show count
         System.out.println(i);}}}