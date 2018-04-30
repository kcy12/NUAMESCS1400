/**********************
*Mike Marambio
*Counter Program
*
*Last edited 1/25/2018
***********************/

//header
//import scanner
import java.util.Scanner;

//class
public class Counter
{
   //main
   public static void main(String[] args)
   {
   
   
      //init vars
      int S = 0;
      int E = 0;
      int C = 1;
      Scanner in = new Scanner(System.in);
      //greet user
      System.out.println("Welcome to the Counter Program");
      
      //prompt value x3
      System.out.println("What number should I start at? ");
      S = in.nextInt();
      System.out.println("What number should I end at? ");
      E = in.nextInt();
      System.out.println("What should I count by? ");
      C = in.nextInt();
      //save value x3
      
      //call counting method
      counting(S, E, C);
    }// end  main
    public static int counting(int S, int E, int C)
    {
   //counting
      //for loop
      for(int i=S; i<=E; i+=C)
      {
         System.out.print(i + " ");
      }// end count
         //print count
         return S;
     }// end counting method
}// end public class