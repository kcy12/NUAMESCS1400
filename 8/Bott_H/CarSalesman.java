/*******************
*Holden Bott
*CarSalesman
*Last Edited: 1/23/18
*******************/

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
      System.out.print("What is the base amount of the car? ");
      cost = input.nextInt();
      
      //new line
      System.out.println();
      //math
      double tax_total = cost * tax;
      System.out.println("Tax is 15%:" + tax_total);
      
      double license_total = cost * license;
      System.out.println("License is 10%:" + license_total);
      
      System.out.println("Dealer Prep is:" + dealer_prep);
      
      System.out.println("Destination charge is:" + dest_charge);
      
      //display totals
      total = tax_total + license_total + dealer_prep + dest_charge;
      
      System.out.println("Your total is:" + total);
   }//end main method
}//end CarSalesman class