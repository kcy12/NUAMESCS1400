/**********************************
*Spencer Crawford
*Counter program
*
*Last Edited 1/25/18
**********************************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //init vars
      int start;
      int end;
      int countBy;
      //greet user
      System.out.println("Welcome to the Counter Program");
      //promt and save start value
      System.out.println("What number should I start at?");
      start = in.nextInt();
      //promt and save end value
      System.out.println("What number should I end at?");
      end = in.nextInt();
      //promt and save countBy value
      System.out.println("What number should I count by?");
      countBy = in.nextInt();
      //call counting method
      counting(start, end, countBy);
    //counting
   }
    public static void counting(int start, int end, int countBy){
      //for
      for(int i=start;i<=end;i+=countBy){
      System.out.print(i+" ");
      }         
    }
}     
         
