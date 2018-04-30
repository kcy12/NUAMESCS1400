/**********************
* Ethan Pickard
* Car salesmen program
* Last Edited: 1/22/18
***********************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){ 
      //create scanner
      Scanner input = new Scanner(System.in);
      //initalize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome to the car salesmen program! I");
      
      //prompt for input
      System.out.print("What is the base value of the car you would like to buy? ");
      
      //save input
      value = input.nextInt();
      
      //newline
      System.out.println();
      
      //maths
      tax = value*tax;
      liscense = value*liscense;
      total = value + tax + liscense + dest_charge + dealer_prep;
      
      //display totals
      System.out.println("Tax is 15%: $" + tax);
      System.out.println("Liscense fees are 10%: $" + liscense);
      System.out.println("The car dealership requires a fee also: $" + dest_charge);
      System.out.println("The dealer requires a prep fee: $" + dealer_prep);
      System.out.println();
      System.out.println("Your total is $" + total);
      
   }//end main method
}//end CarSalesmen class