/****************
/*Andrew Barton
/*Counting
/*
/*last edited: 1/25/18
*****************/
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
      System.out.println("Welcome to the Counting program.");
      //prompt valuex3
      System.out.println("What do you want to start at.");
      S = in.nextInt();
      System.out.println("What do you want to end at.");
      E = in.nextInt();
      System.out.println("What do you want to count by.");
      C = in.nextInt();
      //save valuex3
      //call counting method
      counting(S, E, C);
   }//end main
   //counting
   public static int counting(int S, int E, int C){
      //for
      for(int i = S;i <= E;i += C){
         //print count
         System.out.print(i + "  ");
         }//end for
      return E;
   }//end counting
}//end Counter