/**********************
*Zoey Beets
*Reverse
*last edit: 2/11/18
**********************/

import java.util.Scanner;
//class
public class reverse{
   //main
   public static void main(String[] args){
      //greet user
      System.out.println("Type the message you would like reversed: ");
      Scanner read = new Scanner(System.in);
      String str = read.nextLine();
      String reversed = "";
      reversed = reverse (str);
      System.out.println("Reversed message: ");
      System.out.println(reversed);

      }//end main
      
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