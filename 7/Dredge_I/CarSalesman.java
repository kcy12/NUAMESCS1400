/*********************
* Isaac Dredge
* Description: Car salesman program
* Last edited: 1/22/18
*********************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // create scanner
      // vars:
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int desk_charge = 375;
      int dealer_prep = 500;
      
      // welcome the user, tell them how to use this program
      System.out.println("Welcome to the Car Salesman program!");
      System.out.println("simply enter the cars value to continue");
      // take input (save it)
      value = input.nextInt();
      // maths
      tax = (value * tax);
      System.out.println("Tax is 15%: $" + tax);
      liscense = (value * liscense);
      System.out.println("Liscense is 10%: $" + liscense);
      total = (tax + liscense + value + desk_charge + dealer_prep);
      System.out.println("Dealer preperation fee: $500");
      System.out.println("Destation Charge: $375");
      // display running totals
      System.out.print("The total is $");
      System.out.println(total);
   }//end main
}//end program