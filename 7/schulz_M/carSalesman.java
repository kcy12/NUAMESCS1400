/*********************
Mason Schulz
carSalesman
Last Edited: 1/22/18
**********************/

import java.util.Scanner;

public class carSalesman{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //variables
      int carValue = 0;
      double total = 0.00;
      double tax = .15;
      double liscense = .10;
      int dealerCharge = 150;
      int newTires = 50;
      
      //welcome
       System.out.println("Welcome to a Car Dealership!");
      //prompt for input
       System.out.print("How much is the car worth?");
      //save input
      carValue = input.nextInt();
       System.out.println();
      //math
      total = carValue + (carValue * tax);
       System.out.println("Plus 15% tax: $" + total);
      total = total + (carValue * liscense);
       System.out.println("Plus 10 %Liscenseing Fees: $" + total);
      total = total + dealerCharge;
       System.out.println("Plus 150$ dealer fees: $" + total);
      total = total + newTires;
       System.out.println("You'll need new 50$ tires: $" + total);
      //final outputs
      System.out.println();
      System.out.println("Your total cost is $" + total);

   }//end main method
}//end carSaleman