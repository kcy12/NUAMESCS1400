/*******************************
* Leon Nguyen
* Counter Program
* 1/25/18 
********************************/
import java.util.Scanner;
public class CounterProgram{
   public static void main(String[] args){
   
   //main
      //init vars
      Scanner in = new Scanner(System.in);
      int Start = 0;
      int End = 0;
      int Count = 0;

      //greet user
      System.out.println("Welcome to the Counter Program");

      //prompt valuex3
      System.out.println("What number should I start at?");
             Start=in.nextInt();

      System.out.println("What number should I I end at?");
             End=in.nextInt();

      System.out.println("What number should I Count by?");
             Count=in.nextInt();


       

      //call counting method
         CountsMethod(Start, End, Count);
         }
       //counting
        public static void CountsMethod(int Start, int End, int Count){
      //for
      for(int i = Start; i <= End; i += Count ){
         System.out.println(i);  
     
      
      
        }// end for loop   
      }//end CountsMethod
}//end CounterProgram