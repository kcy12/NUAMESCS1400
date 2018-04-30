/***************************
* Kevin Thomas
*Counter in Java
*
* Last Edited: 1/25/17
***************************/
import java.util.Scanner;

public class Counter
{
   public static void main(String[] args)
   {
      Scanner in  = new Scanner(System.in);
      System.out.println("Welcome to the Counter!");
      System.out.print("Enter the starting number. ");
      int s = in.nextInt();
      System.out.println();
      System.out.print("Enter the number to count to. ");
      int u = in.nextInt();
      System.out.println();
      System.out.print("Enter the number to count by. ");
      int cc = in.nextInt();
      System.out.println();

      for (int i = s; i <= u; i += cc )
      {
        System.out.print(i + "  ");
      }
   }//end main method
}//end class HelloWorld
