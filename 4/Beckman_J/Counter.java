/*****************************
*Jarren Beckman
*Counter Program in Java
*
*Last Edited: 1/31/18
******************************/

import java.util.Scanner;

//class
public class Counter{
   //main
   public static void main(String[] args){
      //init vars
      Scanner in = new Scanner(System.in);
      int S = 0;
      int E = 0;
      int C = 0;
      //greet user
      System.out.println("Welcome to my number counter");
      //prompt valuex3
      System.out.println("What number would you like to start at?");
      S = in.nextInt();
      System.out.println("What number would you like to end at?");
      E = in.nextInt();
      System.out.println("What would you like to count by?");
      C = in.nextInt();
      //save valuex
      //call counting method
      counting(S, E, C);
    }//end main
     //counting
     public static int counting(int S, int E, int C){
      //for
      for(int i = S;i <=E;i += C){
          //print count.
          System.out.print(i + " ");
          }//end counting
          return S;
     }
}//end Counter