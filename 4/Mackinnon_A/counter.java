/***********************
*Austin MacKinnon
*
*
*Last edited: 1/25/17
************************/
import java.util.Scanner;
//class
public class counter{
      //main
      public static void main(String[] args){

         //init vars
         int start = 0;
         int end = 0;
         int count = 0;
         Scanner in= new Scanner(System.in);
         //greet user
         System.out.println("Welcome to the number counter");
         //prompt valuex3
         System.out.println("What number would you like to start at");
         start = in.nextInt();
         System.out.println("What number would you like to end at?");
         end = in.nextInt();
         System.out.println("What would you like to count by?");
         count = in.nextInt();
         
         //save valuex3
         
         //call countin method
         counting(start, end, count);
         }//end main
   //counting
   public static int counting(int start, int end, int count){
      //for
      for(int i = start;i <end;i += count){
      //print count.
         System.out.print(i + " ");
         }//end counting
         return start;
   }
}//end Count
