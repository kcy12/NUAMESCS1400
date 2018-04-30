/************************************
   Garrett Keefe
   Counter Program
   Last Edited 1/26/2018
************************************/
import java.util.Scanner;
public class Counter{
   public static void main(String[] args){
      //implement scanner
      Scanner input = new Scanner(System.in);
      //ask for and save variable
      System.out.println("What number do you want to start with?: ");
      int x = input.nextInt();
      System.out.println("What number do you want to end at?: ");
      int y = input.nextInt();
      System.out.println("What should I count by?: ");
      int z = input.nextInt();
      counter(x,y,z);
      System.out.println("Thanks for using our program!");
   }
   public static void counter(int x, int y, int z){
      //begin for loop
      for(int i=x; i<=y; i+=z){
         System.out.println(i);
      }//end for loop
   }//end main
}//end class