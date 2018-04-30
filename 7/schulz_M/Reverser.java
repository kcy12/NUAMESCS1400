/*********************
Mason Schulz
Reverser
Last Edited: 2/9
**********************/
import java.util.Scanner;
//class
public class Reverser{
   /*main*/public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String uMessage = "";
       
      //get message
      System.out.print("Hey what message do you want reversed? ");
      uMessage = input.nextLine();
      System.out.println();
      //call reverse
      String r = reverse(uMessage);
      //print reversed
      System.out.println("Your message reversed is: ");
      System.out.print("\"" + r + "\"");
      
   }//main\\

   // reversing method called 'reverse'
   public static String reverse(String reverser){
      String s = reverser;
      int n = 0, length = s.length();
      String f,r = "";
      while(n<length){
         f=s.substring(n,n+1);
         r=f.concat(r);
         n++;
      }
      return r;
      
   }//reverse\\

      
}//end Main class\\
