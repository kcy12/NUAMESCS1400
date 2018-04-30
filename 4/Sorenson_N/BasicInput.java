/***************
*Niklas Sorenson
*Basic input
*
*Last edited 2/21/18
***************/

import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      char userChar;
      String userString;
      

      
      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      
      System.out.println("Enter character:");
      userChar = scnr.next().charAt(0);

      
      System.out.println("Enter string:");
      userString = scnr.next();
                  
      
      System.out.print(userInt + " ");
      System.out.print(userDouble + " ");
      System.out.print(userChar + " ");
      System.out.println(userString);

      System.out.println(userString  + " " + userChar + " " + userDouble + " " + userInt);
      // FIXME (3): Cast the double to an integer, and output that integer
      System.out.println(userDouble + " cast to an integer is " + (int)(userDouble));
   }
}