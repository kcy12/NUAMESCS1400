/******************
*JJ Burggraaf
*Car Salesman
*Car Salesman in Java
*Last edited: 1/19/18
******************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner input = new Scanner(System.in);
      
      // initalize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Welcome to the car salesman program.");
      //get cost of car
      cost = input.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total = cost + dealerPrep + destCharge + tax + license;
      //display total
      System.out.println("Tax is: " + tax);
      System.out.println("License is: " + license);
      System.out.println("Dealer Prep: " + dealerPrep);
      System.out.println("Destination Charge: " + destCharge);
      System.out.println("Total Cost: " + total);
      
   }//end main
}//end CarSalesman