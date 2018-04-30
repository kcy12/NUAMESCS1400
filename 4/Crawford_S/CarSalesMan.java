/**********************************
*Spencer Crawford
*Car Salesman in Java
*
*Last Edited 1/19/18
**********************************/
import java.util.Scanner;

public class CarSalesman {
   public static void main(String[] args) {
      //create scanner object
      Scanner in = new Scanner(System.in);
      
      //initalize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman Program\n please enter the cost of your car.");
      //get cost of car
      cost = in.nextInt();
      //math
      tax *= cost;
      license *= cost;
      total += cost;
      total += tax;
      total += license;
      //display total
      System.out.println("The Dealer's Prep Charge is " + dealerPrep);
      System.out.println("The Destation Charge is " + destCharge);
      System.out.println("The Tax Total on your car is " + tax);
      System.out.println("The License Charge for your car is " + license);
      System.out.println("Your Total is " + total);
   }//end main
}//end CarSalesman