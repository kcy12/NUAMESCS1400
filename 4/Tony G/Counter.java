/*******************
*Tony Gutierrez
*Counter
*last edited 1/25/18
********************/

import java.util.Scanner;
//class
public class Counter {
   public static void main(String[] args){
   //main
      //init vars
      Scanner in = new Scanner(System.in);
      int start = 0;
      int end = 0;
      int count = 0;
      //greet user
      System.out.println("Welcome to the Counter program!");
      //prompt valuex3
      System.out.println("Where do you want to start?!");
      start = in.nextInt();
      System.out.println("Where to end?");
      end = in.nextInt();
      System.out.println("what to count by?");
      count = in.nextInt();
      //save valuex3
      //call counting method
      counterr(start,end,count);
      }
   //counting
   public static void counterr(int start, int end, int count){
      //for
      for(int i=start;i<=end;i+=count){
         System.out.println(i);
         }
        }
        }
         //print count