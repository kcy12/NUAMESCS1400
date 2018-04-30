/*********
*Kaylin Davis
*Car Salesman
*
*Last Edited: 01/19/18
*********/

import java.util.Scanner;


public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in); 
   
      //initialize variables
      int cost = 0;
      double total = 0.0;
      // two set fees
      int dealerPrep = 500;
      int destCharge = 370;  
      // two % fees
      double tax = 0.15;
      double licence = 0.10;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman program! We\'re gald we can be of use to you today!");
      System.out.println("Please enter the cost of the car you\'re interested in below.");
      //get user input
      cost = in.nextInt();
      //math
      total = (cost + (cost * tax) + (cost * licence) + dealerPrep + destCharge);
      //itemize costs
      System.out.println("15% tax:" + (tax * cost));
      System.out.println("10% licence:" + (licence * cost));
      System.out.println("The Dealer Prep Charge is:" + dealerPrep);
      System.out.println("The Destination Charge is:" + destCharge);
      System.out.println("The final cost is :" + total);
   }//end main  
   
}//end CarSalesman