/***********************
* Chris Coffey
* Car salesman in Java
*
* Last Edited: 1/19/18
************************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
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
      System.out.println("Welcome to the Car Salesman program!");
      //get cost of car
      System.out.println("Please enter the cost of the car");
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total += cost;
      total += tax;
      total += license;
      total += destCharge;
      total += dealerPrep;
      //display total
      System.out.println("Dealer Prep = " + dealerPrep);
      System.out.println("Destination Charge = " + destCharge);
      System.out.println("Cost = " + cost);
      System.out.println("Tax = " + tax);
      System.out.println("License = " + license);
      System.out.println("Total = " + total);
      
   }//end method main
}//end CarSalesman class