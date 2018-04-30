//class
import java.util.Scanner;

public class Counter
{
   public static void main(String[] args) //main method
   {
   int S = 0;
   int E = 0;
   int cBy = 0;
   //init vars
   Scanner input = new Scanner(System.in);
   //greet user
   System.out.println("Welcome to the Counter program!");
   //prompt input x3    //save input x3
   System.out.println("What would you like to start at?");
   S = input.nextInt();
   System.out.println("What would you like to end at?");
   E = input.nextInt();
   System.out.println("What would you like to count by?");
   cBy = input.nextInt();
   //call counter method
   Counter.counter(S,E,cBy);
   }
   public static void counter(int S, int E, int cBy)// counter
   {
      for(int i = S; i <= E ;i += cBy)//for loop for(it i=(user starting value);i<endvalue;i +=countby){}
      {
       System.out.print(i + "  ");
           //print count
      }
   }
   
}   