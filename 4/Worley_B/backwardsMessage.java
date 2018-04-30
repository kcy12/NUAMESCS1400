/*********************
*Braden Worley
*counter
*counts by specified numbers int
*Last Edited: 1/25/18
**********************/
import java.util.Scanner;

//class
public class backwardsMessage{
   //main
   public static void main(String[] args){
      //declare variables
      Scanner in = new Scanner(System.in);
      String userIn;
      String sendBack;
      
      //get message
      System.out.println("Hi you son of a **** give me a word");
      userIn = in.next();
      
      //call backwards method
      sendBack = backwards(userIn);
      System.out.println(sendBack);
   }//end main code
   
   //backwards
   public static String backwards(String userIn){
      return new StringBuilder(userIn).reverse().toString();
   }//end bw
   
}