/******************************
*Ashton Songer
*Car Salesman
*Runs a car salesman calculator
*Last edited 1/19/2018
*******************************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in);
      //initalize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      //welcome user
      System.out.println("Hello! Welcome to the car salesman program!\n");
      //get cost of car
      System.out.print("What is the base price of the car? ");
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total = cost + dealerPrep + destCharge + tax + license;
      //display total
      System.out.println("\nYour base price was: $" + cost);
      System.out.println("There was a Dealer Prep fee of $500.");
      System.out.println("There was a Destination Charge fee of $375.");
      System.out.println("There was a tax fee of: $" + tax);
      System.out.println("There was a license fee of: $" + license);
      System.out.println("\nThe total price of the car is: $" + total);
   }// end method main
}// end CarSalesman class