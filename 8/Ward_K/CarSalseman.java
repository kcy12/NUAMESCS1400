/******************
*Kade Ward
*Carsalesman, adds up numbers
*1/22/18
******************/

import java.util.Scanner;

public class CarSalseman {
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init values
      int cost = 0;
      double tax = .15;
      double total = 0.0;
      double license = .10;
      int dealer_prep = 500;
      int dest_charge = 375;
      
      //greet user
      System.out.print("How much yo car foo? ");
      //get input
      cost = input.nextInt();
      //new line
      System.out.println();
      //math
      tax *= cost;
      license *= cost;
      total = tax + license + dealer_prep + dest_charge + cost;
      System.out.println("Tax is: " + tax);
      System.out.println("License is: " + license);
      System.out.println("Dealer Prep is: " + dealer_prep);
      System.out.println("Destination Charge is: " + dest_charge);
      System.out.println();
      System.out.println("Your total is: " + total);
      //display total
      
   }//end main method      

}//end Carsalesman class