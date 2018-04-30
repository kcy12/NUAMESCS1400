/*****************************
*Julia Ludlow
*8th Period
*Car Salesman Program
*Last Edited: 1-30-2018 (Was absent and needed time to make it up.)
******************************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
   //make scanner
   Scanner input = new Scanner(System.in);
   
   //init values
   int cost = 0;
   double tax = 0.15;
   double total = 0.0;
   double license = 0.10;
   int dealer_prep = 500;
   int dest_charge = 375;
   
   //greet user
   System.out.println("Welcome to the Car Salesman Program!");
   
   //get input
   System.out.print("What is the base price of the car? $");
   cost = input.nextInt();
   //newline
   System.out.println();
   //math
   tax *= cost;
   license *= cost;
   total = cost + tax + license + dealer_prep + dest_charge;
   //display totals
   System.out.println("Your tax is: $" + tax);
   System.out.println("The license cost is: $" + license);
   System.out.println("The cost for Dealer Prep is: $" + dealer_prep);
   System.out.println("The Destination Charge is: $" + dest_charge);
   System.out.println();
   System.out.println("Your total is $" + total);
   
   }//end main method
 }//end CarSalesman class