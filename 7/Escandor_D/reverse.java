/*****
*Dana Escandor
*Reverse
*L.E. 2-11-2019
*****/

//import
import java.util.Scanner;

//class
public class reverse{
   //main
   public static void main(String[] args){
      //greet user
      System.out.println("Welcome to the Message Reverser program!");
      //input
      System.out.print("Message input: ");
      
      //scanner
      Scanner read = new Scanner(System.in);
      String str = read.nextLine();
      //reverse output
      String reversed = "";
      reversed = reverse (str);
      System.out.println("Message output, reversed: ");
      System.out.println(reversed);

      }
      
    public static String reverse(String str){
      int i = str.length();
      String reversed = "";
         for(i = str.length() - 1; i >= 0; i--)
         {
            reversed = reversed + str.charAt(i);
         }//close for loop
         return reversed;
        }//close main
      
}