import java.util.Scanner;

public class CarSalesman
{
   public static void main(String[] args)
   {
      //create scanner object
      Scanner in = new Scanner(System.in);
      
      //initialize variables
      int cost = 0;
      double total = 0.0;
      double totaltax = 0.0;
      double totallicense = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Hello!");
      System.out.println("Welcome to The Car Salesman!");
      
      //get cost of car
      System.out.println("Please enter in the dollar cost of the car.");
      System.out.println("Please only enter numbers!");
      System.out.println("Anything other than integers will be rejected.");
      cost = in.nextInt();
      
      //math
      totaltax = cost * tax;
      totallicense = cost * license;
      total = cost + dealerPrep + destCharge + totaltax + totallicense;
      
      //display total
      System.out.println("Congragulations!");
      System.out.println("You have allowed The Car Salesman to successfully");
      System.out.println("calculate the total cost of your car!");
      System.out.println("Here are your results!");
      System.out.println(total);
   }//end main
}//end CarSalesman      