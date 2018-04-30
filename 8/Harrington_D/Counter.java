/***********
*David Harrington
*Counter
*Period 8
**********/
import java.util.Scanner;
public class Counter{
   public static void main(String[] args){
   //main

      Scanner input = new Scanner(System.in);
      //greet user
      System.out.println("Hello");
      
      //prompt for input x3
      System.out.println("Where do you want to start?");
      int Start = input.nextInt();
      
      System.out.println("Where do you want to end");
      int End = input.nextInt();
      
      System.out.println("What do you want to count by");
      int Mult = input.nextInt();
      
      
      //save input x3
      for(int i = Start;i<=End;i+=Mult){
         System.out.println(i);
      }//end for loop
   }//end main
}//end class   
   

      
      
