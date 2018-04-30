/************************
* Alysha Robertson
* Car Salesman
* Last Edited: 2/1/18
************************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      //initialize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double license = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman Program!");
      //prompt for input
      System.out.print("What is the base amount of the car? ");
      //save input
      value = input.nextInt();
      //new line
      System.out.println();
      
      //maths
      tax = .15*value;
      license = .10*value;
      dealer_prep = 500;
      dest_charge = 375;
      total = (value + tax + license + dest_charge + dealer_prep);
      //display totals
      System.out.println("Tax is 15%: $" + tax);
      System.out.println("License is 10%: $" + license);
      System.out.println("Dealer Preparation fee: $" + dealer_prep);
      System.out.println("Destination Charge: $" + dest_charge);
      System.out.println();
      System.out.println("Your total is: $" + total);
   }//end main method
}//end CarSalesman class