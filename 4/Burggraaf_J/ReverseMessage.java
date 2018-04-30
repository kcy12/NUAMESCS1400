/******************
*JJ Burggraaf
*Reverses a message
*
*Last edited: 2/9/18
******************/

import java.util.Scanner;
//class
public class ReverseMessage{
      //main
      public static void main(String[] args){
      //greet user
      System.out.println("Put in the messsage you would like to reverse: ");
      //get message
      Scanner read = new Scanner(System.in);
      String str = read.nextLine();
      String reversed = "";
      // reversing method called 'reverse'
      //call reverse
      reversed = reverse (str);
      //print reversed
      System.out.println("Your message reversed is: ");
      System.out.println(reversed);
      }//end method main
      
      //do the reversing
      public static String reverse(String str){
      int i = str.length();
      String reversed = "";
         for(i = str.length() - 1; i >= 0; i--)
         {
            reversed = reversed + str.charAt(i);
         }//close for loop
         return reversed;
        }//close reverser

}//end ReverseMessage class