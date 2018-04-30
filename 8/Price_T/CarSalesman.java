/**************************
*Teancum Price
*Get input from the user, 
*then calculates the total
*Last Edit: 1/22/18
**************************/

//import scanner class
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
      int dealerPrep = 500;
      int destCharge = 375;
      //greet user
      System.out.println("Welcome to the Car Salesman Program!");
      System.out.print("How much is the car you want? $");
      //get input
      cost = input.nextInt();
      //new line
      System.out.println();
      System.out.println();
      //do math
      total += cost;
      total += dealerPrep;
      total += destCharge;
      total += tax * cost;
      total += license * cost;
      //display totals
      System.out.println("Tax is 15%: $" + (tax * cost));
      System.out.println("License is 10%: $" + (license * cost));
      System.out.println("Dealer Prep is $500");
      System.out.println("Destination Charge is $375");
      System.out.println();
      System.out.println("The total is $" + total);
   }//end main method
}//end CarSalesman class