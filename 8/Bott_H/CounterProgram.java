/********************
*Holden Bott
*CounterProgram
*Last Edited: 1/26/18
********************/

//import scanner
import java.util.Scanner;

//class
public class CounterProgram{

   //main
   public static void main(String[] args){

      //init vars
      int start = 0;
      int end = 0;
      int count = 0;
      Scanner input = new Scanner(System.in);
      
      //greet the user
      System.out.println("Welcome to the Counter Program");
      
      //prompt for input x3
      System.out.print("What number should I start at? ");
      start = input.nextInt();
      System.out.println();
      
      System.out.print("What number should I end at? ");
      end = input.nextInt();
      System.out.println();
      
      System.out.print("What should I count by? ");
      count = input.nextInt();
      System.out.println();
      
      
      
      //for loop
      for(int i = start; i <= end; i += count){
         System.out.print(start + " ");
         start += count;
         }
      
      
   //end main
      }
   }
