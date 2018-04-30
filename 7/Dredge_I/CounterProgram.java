/*************
* Isaac Dredge
* Description: Counter program
* Last Edited: 1/26/18
*************/

import java.util.Scanner;

//class
public class CounterProgram {
   //main
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //init vars
      int counter = 0;
      int start = 0;
      int end = 0;
      //greet user
      System.out.println("Welcome to the Counter Program!");
      //prompt and save x3
      System.out.print("What number should I start at?: ");
      start = scan.nextInt();
      System.out.print("What number should I end at?: ");
      end = scan.nextInt();
      System.out.print("What should I count by?: ");
      counter = scan.nextInt();
      //start end step
      //call counter method
      counter(start, end, counter);
   }//end main
   //counter method
   public static int counter(int Start, int End, int Step) {
      //for
      int Number = 0;
      int i;
      for (i = Start; i <= End; i = i + Step) {
         //print count
         Number = Number + Step;
         //create a 'filter' so that it does not go over one
         if (Number <= End) {
            System.out.print(Number + " ");
         }//end if statment
      }//end for loop
      return Number;
   }//end counter
}//end program