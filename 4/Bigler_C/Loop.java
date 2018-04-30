/*******************************************
*Connor Bigler
*For Loop in Java
*
*Last edited 1/25/18
*******************************************/
import java.util.Scanner;
public class Loop
{
   public static void main(String[] args)//main
   {
      //init vars
      int e = 0;
      int t = 0;
      int g = 0;
      
      Scanner in = new Scanner(System.in);
      //greet user
      //prompt valuex3
      System.out.println("Welcome to the counting system, please enter intial number:");
      
      g = in.nextInt();
      System.out.println("please enter ending number:");
      e = in.nextInt();
      System.out.println("please enter couting interval:");
      t = in.nextInt();
      //call counting method
      counter(e,t,g);
      
   }
   public static void counter(int e, int t,int g)
   {
            //counting
         System.out.println("-------------------------------------------------------------");
         //for
         for (int i = g; i <= e;i += t)
         {
         int count = i;
         System.out.println(count);
         }  
   }    
}  