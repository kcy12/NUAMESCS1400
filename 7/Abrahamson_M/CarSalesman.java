/***************
*Matthew Abrahamson 
*Car salesman program in java
*1/22/18
*******************/

import java.util.Scanner;



public class CarSalesman
{
   public static void main(String[] args)
   {
      //create scanner(userinput)
      Scanner input = new Scanner(System.in);
      //initialize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      //prompt for input
      System.out.print("Welcome to your car payment calculator. Please enter the value of your vehicle.");
      //save input
      value = input.nextInt();
      //newline
      System.out.println();
      //maths
      total = value + value*tax + value*liscense + dest_charge + dealer_prep;
      tax = value*tax;
      liscense = liscense*value;
      //Display totals
      System.out.println("Tax is 15%  $" + tax);
      System.out.println("liscense fee is 10%  $" + liscense);
      System.out.println("Destination Charge is  $" + dest_charge);
      System.out.println("Dealer prep is  $" + dealer_prep);
      System.out.println("Total is  $" + total);
   }//end main method
}//end CarSalesman class