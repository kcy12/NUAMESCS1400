/************************
*Logan Cook
*Reverse Message
*Last Edited: 2-9-18
************************/

import java.util.Scanner;

//class
public class reverseMessage{
   
   //main
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String rMess = "";
      rMess = input.next();
      
      //get message
      System.out.println("Oi mate! What you want reversed, mate?");
      
      //call reverse
      String r = reverse(rMess);
      
      //print reversed
      System.out.print(r);
      
   }//end Main
   
   // reversing method called 'reverse'
   public static String reverse(String reverse){
      //do the reversing
      String s = reverse;
      int n = 0, length = s.length();
      String f,r = "";
      while(n<length){
         f=s.substring(n, n+1);
         r=f.concat(r);
         n++;
      }//end While 
      return r;
   }//end Reverse 
}//end Main Class