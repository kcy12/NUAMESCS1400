/***************************
* Kevin Thomas
*Car Salesman
*
* Last Edited: 1/20/18
***************************/

import java.util.Scanner;

public class CarSalesman
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in); //create Scanner Object
//variables
     int cost = 0;
     double total = 0;
     int paint = 1500;
     int dealer = 1000;
     double tax = 0.15;
     double license = 0.1;
     double percent = 0;

     //welcome user
     System.out.println("Welcome to the Car price calculator!");
     System.out.print("Type in the base price of your selected car. ");
     //get cost of Car
     cost = in.nextInt();
     //math
     System.out.print("Adding painting charge of $1500: ");
     total = cost + paint;
     System.out.println(total);
     System.out.print("Adding dealer fees of $1000: ");
     total += dealer;
     System.out.println(total);
     System.out.print("Calculating 10% licensing fees: ");
     percent = cost * license;
     total += percent;
     System.out.println(total);
     System.out.println("Calculating absurd 15% tax fees (screw the Government): ");
     percent = cost * tax;
     total += percent;
     System.out.println("Your grand total is: " + total);
   }//end main method
}//end class HelloWorld
