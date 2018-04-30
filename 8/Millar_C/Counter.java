/*********************
* Carson Millar
* 1/26/18
* Counter Program
*********************/

import java.util.Scanner;

public class Counter{
   public static void main(String[] args){
      int S = 0;
      int E = 0;
      int cBy = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to the counter program!");
      System.out.println("What would you like to start at?");
      S = input.nextInt();
      System.out.println("What would you like to end at?");
      E = input.nextInt();
      System.out.println("What would you like to count by?");
      cBy = input.nextInt();
      counter(S, E, cBy);
   }
   public static void counter(int S, int E, int cBy){
      for(int i = S;i<=E;i += cBy){
         System.out.println(i);
      } 
   }
}   

   