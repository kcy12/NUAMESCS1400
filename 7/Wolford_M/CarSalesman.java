/************************************
*Michael Wolford
*Demonstrates data types, input, math
*Last Edited: 1/22/18
*************************************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      //initalize variable
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.print("Welcome to the Car Salesman program!");
      //prompt for input
      System.out.println("Please input the base value of the car");
      //save input
      value = input.nextInt();
      //new line
      System.out.println();
      
      //math
      total = value;
      total *= tax;
      total *= liscense;
      total += dest_charge;
      total += dealer_prep;
      //display totals
      System.out.println("Base value of the car: $" + value);
      System.out.println("Tax is 15%: $" + value*tax);
      System.out.println("Licensing is 10%: $" + value*liscense);
      System.out.println("Destination Charge: $" + dest_charge);
      System.out.println("Dealer Preparation fee: $" + dealer_prep);
      System.out.println("Total: $" + total); 
   }//end main method
}//end CarSalesman class