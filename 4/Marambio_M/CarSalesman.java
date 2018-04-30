/********************
*Mike Marambio
*CarSalesman
*
*Last Edited: 1/19/2018
*********************/
import java.util.Scanner;

public class CarSalesman
{
   public static void main(String[] args)
   {  //create scanner object
      Scanner in = new Scanner(System.in);
      
      //initialize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman's dealership!");
      System.out.println("Insert the base price of your car: ");
      //get cost of car
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total = dealerPrep + destCharge + cost + tax + license;
      //display total
      System.out.println("The tax of this car is: " + tax);
      System.out.println("The license tax of this car is: " + license);
      System.out.println("The dealerPrep fees are : " + dealerPrep);
      System.out.println("The destCharge fees are : " + destCharge);
      System.out.println("The total cost of the car after everything is: " + total);
      
   } //end main
} //end CarSalesman