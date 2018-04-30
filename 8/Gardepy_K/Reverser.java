/***********************
*Kacie Gardepy
*Reverse Assignment
*Last Edited: 02/09/2018
***********************/
import java.util.Scanner;

public class Reverser{
   public static void main(String[] args){
   //new scanner
    Scanner input = new Scanner(System.in);
    //strings
    String message = (" ");
    String backwards = (" ");
    //greet user
    System.out.print("Welcome to the Reverse Message Program!");
    System.out.println(" ");
    //get message
    System.out.print("What is your message? ");
    message = input.nextLine();
    //call reverse
    backwards = reverse(message);
    //print reversed
    System.out.print("Your message reversed is: "+backwards);
    
    }//end main 
   //reversing method called 'reverse'
   public static String reverse(String message){
      //scanner
      Scanner input = new Scanner(System.in);
      //reverse
      String backwards = " ";
      for (int i = message.length()-1; i >= 0; -- i){
         backwards += message.charAt(i);
         
      }//end while
      //return the reversed message
      return backwards;
  }//end reverse  
}//end class