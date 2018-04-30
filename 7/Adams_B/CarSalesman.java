/***********************
*Brady Adams
*Car Salesman
*Last Edited 1/24/2018
***********************/

import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args) {
   //create scanner
   Scanner input = new Scanner(System.in);
   
   //initialize variables
   int value = 0;
   double total = 0.0;
   double tax = .15;
   double liscense = .10;
   int desk_charge = 375;
   int dealer_prep = 500;
   
   //welcome user
   System.out.println(" ******************** ");
   System.out.println(" *  Welcome to the  * ");
   System.out.println(" *   CarSalesman    * ");
   System.out.println(" *     Program      * ");
   System.out.println(" ******************** ");
   //prompt for input
   System.out.print("Enter a price to continue!");
   //save input
   value = input.nextInt();
  
   //maths
   tax = (value * tax);
   System.out.println("Tax is 15%: $" + tax);
   liscense = (value * liscense);
   System.out.println("License is 10%: $" + tax);
   total = (tax + liscense + desk_charge + dealer_prep);
   System.out.println("Desk charge is $375");
   System.out.println("Dealer Prep fee is $500");
   
   //display totals
   System.out.println("The final total comes to: $" + total);
   }//end main method
}//end program