import java.util.Scanner;
//class
public class Main{
   //main
   public static void main(String[] args){
      String userMess;
      Scanner scnr = new Scanner(System.in);
      //get message
      userMess = scnr.nextLine();
      //call reverse
      String outPut = Main.reverse(userMess);
      //print reversed
      System.out.print(outPut);
   }
   
   // reversing method called 'reverse'
   public static String reverse(String userMess){
      int i;
      String outPut = "";
      //do the reversing
      for (i = userMess.length() - 1; i >= 0 ; --i){
         outPut += userMess.charAt(i);
         }
      return outPut;
   }
}