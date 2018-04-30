/*********************
*Nick Lee
*Reverse Message
*
*Last Edited:2-8-2018
*********************/

import java.util.Scanner;

//class
public class ReverseMessage{
   //main
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String message = "";
      String reversedMessage;
      //welcome
      System.out.print("What is a message you want to reverse? ");
      message = in.nextLine();
      //cal method reverse
      reversedMessage = reverse(message);
      //print result
      System.out.println("Your new message is: " + reversedMessage);
      
   }// end method main
   public static String reverse(String message){
      String reversedMessage = "";
      String newLetter;
      int messageLength = message.length();
      int count1 = messageLength;
      int count2 = messageLength - 1;
      //System.out.println(message);
      for(int i = 1; i <= messageLength; i ++){
         newLetter = message.substring(count2, count1);
         reversedMessage += newLetter;
         //System.out.println(reversedMessage);
         //System.out.println(count1 + " " + count2 + " " + messageLength);
         count1 += -1;
         count2 += -1;
      }//end for loop
      return reversedMessage;
   }//end method reverse
}//end ReverseMessage