/*****************
* Jacob Baggett
* CarSalesman
* last edited 1/22/18
*****************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init values
      int cost = 0;
      double tax = 0.15;
      double license = .10;
      int dealer_prep = 500;
      int dest_charge = 375;
      double total = 0.0;
      //greet user
      System.out.println("Welcome to Automated Car Salesman! ");
      System.out.print("What is the base cost for the car? ");
      //get input
      cost = input.nextInt();
      //newline
      System.out.println();
      //math
      tax *= cost;
      license  *= cost;
      total = (cost + tax + license + dealer_prep + dest_charge);
      //display totals
      System.out.println("Tax is 15%: $" + tax);
      System.out.println("License fee is 10%: $" + license);
      System.out.println("Dealer prep will cost $" + dealer_prep);
      System.out.println("Destination charge is $" + dest_charge);
      System.out.println();
      System.out.println("Final cost is $" + total);
      System.out.println("Thank you for using Automated Car Salesman!");
      
   }//end main method
}//end CarSalesman class