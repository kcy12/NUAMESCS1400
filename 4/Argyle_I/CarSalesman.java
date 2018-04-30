/*****************************
* Ian Argyle
* Calculate Cost of Car
* 
* Last Edited: 1/17/2018
******************************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args) {
      // Create scanner object
      Scanner in = new Scanner(System.in);
      // initialize variables
      int cost = 0;
      double total = 0.0;
      // two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      // two % fees
      double tax = 0.15;
      double license = 0.10;
      // welcome user
      // get cost of car
      System.out.println("Enter cost of car: ");
      cost = in.nextInt();
      // math
      double taxTotal = tax * cost;
      double licenseTotal = license * cost;
      total = taxTotal + licenseTotal + dealerPrep + destCharge + cost;
      // display total
      System.out.println("Dealer Prep Charge: " + dealerPrep);
      System.out.println("Dest Charge: " + destCharge);
      System.out.println("Tax: " + taxTotal);
      System.out.println("License: " + licenseTotal);
      System.out.println("Total: " + total);
      
   } //end method main
} //end CarSalesman