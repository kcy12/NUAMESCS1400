import java.util.Scanner;

public class Main {//class
   //main
   public static void main(String[] args){   
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to the Reverse Message Program!");
      System.out.println("What message would you like to reverse?");
      //get message
      String message = input.nextLine();
      String output;
      //call reverse
      output = Main.reverse(message);
      //print reversed message
      System.out.println(output);
   }   
   // reversing method called 'reverse'
   public static String reverse(String message){
      //do the reversing
      String output = "";
      for (int i = message.length()-1; i>=0; i --){
         output += message.charAt(i);
      }
      return output;
      }       
}