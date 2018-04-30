/***************************
* Kevin Thomas
*Message Reverser
*
* Last Edited: 2/8/18
***************************/
import java.util.Scanner;

public class MessageReverse
{
   public static void main(String[] args)
   {
     Scanner in  = new Scanner(System.in);
     String reversed;
     System.out.println("Welcome to the Message Reverser!");
     System.out.println("Enter the message you would like to reverse.");
     String message = in.nextLine();
     String toPrint = reverse(message);
     System.out.println(toPrint);
   }//end main method
   public static String reverse(String toReverse)
   {
     int messageLength = toReverse.length();
     messageLength -= 1;
     char first = toReverse.charAt(0);
     String toPrint = "";
     for(int l = messageLength; l>0; l-=1)
     {
       toPrint += toReverse.charAt(l);
     }
     toPrint += first;
     return toPrint;
   }
}//end class HelloWorld
