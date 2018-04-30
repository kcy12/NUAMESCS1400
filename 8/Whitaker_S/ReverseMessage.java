/***************************************
*Saxxon Whitaker
*Reverse Message Program
*Last Edited: 2/9/2018
***************************************/

import java.util.Scanner;

public class ReverseMessage
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String rMess;
      
      //get message
      System.out.println("What is the message? ");
      rMess = input.nextLine();
      
      //call reverse
      String r = reverse(rMess);
      
      //print reversed
      System.out.println(r);
      
   }//end main
   public static String reverse(String reverse)
   {
      //do the reversing
      String s = reverse;
      int n = 0, length = s.length();
      String f, r = "";
      while(n < length)
      {
         f = s.substring(n, n + 1);
         r = f.concat(r);
         n++;
      }
      return r;
   }//reversing method called 'reverse'
   
}//end class