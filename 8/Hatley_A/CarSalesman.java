/***************************************************
*Abigail Hatley
*Car Salesman
*Last Edited:1/22/18
***************************************************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //initialize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dealerprep = 500;
      int dest_charge = 350;
      
      //Welcome user
      System.out.println("Welcome to the carsalesman program!");
      //Prompt for input
      System.out.print("What was the original Car Price? ");
      //save input
      value = input.nextInt();
      System.out.println();
      //maths
      tax *= value;
      liscense = (value* liscense);
      total = (tax + liscense + value + dealerprep + dest_charge);
      
      //display totals
      System.out.println("The Dealership Prep Charge is... " + dealerprep);
      System.out.println("The Destination Charge is... " + dest_charge);
      System.out.println("The tax total for your car is... " + tax);
      System.out.println("The Liscense charge is... " + liscense);
      System.out.println("Your total cost is... " + total);
      
   }//end main method
}//end CarSalesman