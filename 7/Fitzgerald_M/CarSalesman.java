/***********************************
* Matt Fitzgerald
* car sales man
* Last Edited 1/22/18
**********************************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);  
      //intialize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //weclome user
      System.out.println("Welcome to the Car Sales Man thing");
      //prompt for input
      System.out.print("What is the base value of your car?: ");
      //save input
      value = input.nextInt();
      //new line
      System.out.println();
      
      //maths
      total = total + (total * tax);
      total = total + (total * liscense);
      total = total + dealer_prep;
      total = total + dest_charge;
      //display totals
      System.out.println("The tax is 15%: "+ tax);
      System.out.println("The lisence is 10%: "+ liscense);
      System.out.println("Dealer fee is:"+ dealer_prep);
      System.out.println("Destation fee:"+ dest_charge);
      System.out.println("Your total cost is:"+ total);
   }//end main method
}//end CarSalesman class
   