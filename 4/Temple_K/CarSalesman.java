/************
*Kyler Temple
*Car Salesman in Java
*
*Last Edited 1/22/18
************/

import java.util.Scanner;


public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in); 
   
      //initialize 
      double cost = 0.00;
      double total = 0.00;
      // two pre determined fees
      int dealerPrep = 500;
      int destCharge = 500;
      int pocketbook = 1500;   
      // two percent fees
      double tax = 0.25;
      double licence = 0.15;
      
      //welcome user
      System.out.println("Welcome to the Car Salesman program!");
      System.out.println("Please enter the cost of the car below.");
      //obtain user input
      cost = in.nextInt();
      //find total 
      total = (cost + (cost * tax) + (cost * licence) + dealerPrep + destCharge + pocketbook);
      //print statements
      System.out.println("25% tax:" + (tax * cost));
      System.out.println("15% licence:" + (licence * cost));
      System.out.println("The Dealer Prep Charge is:" + dealerPrep);
      System.out.println("The Destination Charge is:" + destCharge);
      System.out.println("The 'Pocketbook Fee' is:" + pocketbook);
      System.out.println("The final cost is :" + total);
   }//end main  
   
}//end CarSalesman