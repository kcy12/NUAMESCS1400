/**************************
*Matthew Abrahamson
*reverses a user inputed string
*2/9/18
**************************/

import java.util.Scanner;

public class ReverseString
{
   public static void main(String[] args) //main
   {
      String userString;
      String outputString;
      Scanner input = new Scanner(System.in);
      System.out.println("What would you like to reverse");
      userString = input.nextLine();
      outputString = reverse(userString);
      System.out.println("this is your reversed messsage ");
      System.out.println(outputString);
   }
   public static String reverse(String userString)
   {
      String outputString = "";
      for (int i = userString.length()-1; i >= 0; i--)
      {
         outputString = outputString + userString.charAt(i);
      }   
      return outputString;
   }
}