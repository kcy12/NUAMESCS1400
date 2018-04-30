/*******************************************
*Connor Bigler
*CarSalesman in Java
*
*Last edited 1/19/18
*******************************************/
import java.util.Scanner;
public class CarSalesman
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      //intalize variables
      double cost = 0;
      double total = 0.0;
      double costtax = 0.0;
      double costlic = 0.0;
      //two set fees
      double frog = 500;
      double carcost = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      //welcome user
      System.out.println("Welcome to the car salesman system please enter car cost");
      //get cost of car
      cost = in.nextInt();
      //math
      costtax = cost * tax;
      costlic = cost * license;
      total = cost + costtax + costlic + frog + carcost;
      //display total
      System.out.println("Here is your cost");
      System.out.println(total);
   }//end method main 
}//end CarSalesman class
