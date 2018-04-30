/*
*Justin Whitaker
*Car Salesman
*Last Edited: 1/22/18
*/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //init values
      int cost = 0;
      double tax = 0.15;
      double totalcost = 0.0;
      double license = 0.10;
      int dealer_prep = 500;
      int dest_charge = 375;
      
      //greet user
      System.out.println("Welcome to the Car Salesman program!\nWhat is your car gonna cost ya?");
      
      //get input
      Scanner scannerObject = new Scanner(System.in);
      System.out.print("Initial car cost: $");
      cost = scannerObject. nextInt();
      
      //math
      System.out.println("Tax: 15% of " + cost + " is $" + (tax * cost));
      System.out.println("License: 10% of " + cost + " is $" + (license * cost));
      System.out.println("Dealer prep is $500.\nDestination charge is $375.");
      
      //display total
      System.out.println("\nYour total cost is $" + ((cost * tax) + (cost * license) + dealer_prep + dest_charge + cost) + ".");
      
   }//end main method
}//end CarSalesman class