/**************************
/*Andrew Barton
/*CarSalesman
/*
/*Last edited 1/19/18
**************************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in);
      
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
      System.out.println("Welcome to Car Salesman program.");
      //get cost of car
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total = cost + dealerPrep + destCharge + tax + license;
      //display total\
      System.out.println("The tax is: " + tax);
      System.out.println("The liscense is: " + license);
      System.out.println("The Dealer Prep: " + dealerPrep);
      System.out.println("The Destination Charge is: " + destCharge);
      System.out.println("The total cost is: " + total);
      
   }//end main
}//end CarSalesman