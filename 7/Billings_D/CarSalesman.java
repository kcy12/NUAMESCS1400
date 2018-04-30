/*****************
*Dallin Billings
*Car Salesman Program
*Last Edited: 1/22/2018
*****************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      
      //create scanner
      Scanner input = new Scanner(System.in);
      
      //initialize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman Program!");
      //prompt for input      
      System.out.print("What is the value of your car?");
      //save input
      value = input.nextInt();
      //newline
      System.out.println();     
      //maths
      total = value*tax + value*liscense + dest_charge + dealer_prep + value;
      tax = value*.15;
      liscense = value*.10;
      //display totals
      System.out.println("Tax is 15%: " + tax);
      System.out.println("Liscense is 10%: " + liscense);
      System.out.println("Destination Charge: $375");
      System.out.println("Dealer Prep: $500");
      System.out.println("Total charges are:" + total);
      
      }//end main method
}//end CarSalesman class