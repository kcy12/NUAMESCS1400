/*********************
*Saxxon Whitaker
*Carsalsman
*Last Edited 1/22/2018
*********************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
   
      //create scanner
      Scanner input = new Scanner(System.in);
      
      //init values
      int value = 0;
      double tax = 0.15;
      double total = 0.0;
      double license = 0.10;
      int dealer_prep = 500;
      int dest_charge = 375;
      
      //greet user
      System.out.println("Welcome to the Car Salesman Program! ");
      //get input
      System.out.print("What is the value of your car? ");
      
      //get input
      value = input.nextInt();
      
      //newline
      System.out.println();
      
      //math
      total = (value * tax + value * license + dest_charge + dealer_prep + value);
      tax = (value * 0.15);
      license = (value * 0.10);
      //display totals
      System.out.println("Tax is 15%: " + tax);
      System.out.println("License is 10%: " + license);
      System.out.println("Destination Charge: $375");
      System.out.println("Dealer Prep: $500");
      System.out.println("Total charges are:" + total);
      
   }//end main method
}//end Carsalesman class