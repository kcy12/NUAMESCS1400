/***********************
*Nick Lee
*Input practice
*
*Last Edited: 1-19-2018
***********************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //Creates a scanner object(instance)
      Scanner in = new Scanner(System.in);
      
      //intitalize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Welcome to a car cost calculator!");
      System.out.println("Here you will learn the TRUE cost of your car.");
      //get cost of car
      System.out.println("What is the cost of the car?");
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total = cost + tax + license + dealerPrep + destCharge;
      //display total
      System.out.println("The tax is: $" + tax);
      System.out.println("The license cost is: $" + license);
      System.out.println("The dealer prep cost is: $" + dealerPrep);
      System.out.println("The destination charge is: $" + destCharge);
      System.out.println("\nThe total for your car is: $" + total);
      
      System.out.println("Have a nice day!");
   }// end main method
}//end CarSlaesman class