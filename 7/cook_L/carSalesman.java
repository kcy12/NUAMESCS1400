/****************************
*Logan Cook
*Car Salesman
*Last Edited: 1-22-18
****************************/

import java.util.Scanner;

public class carSalesman{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      //initalize variable
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int dealerFee = 200;
      int warranty = 500;
      
      //welcome user
      System.out.println("Welcome To The Used Car Salesman Program V1.0");
      
      //prompt for imput
      System.out.print("How Much Is The Vehicle Worth?");
      
      //save input
      value = input.nextInt();
      
      //newline
      System.out.println();
      
      //costs
      System.out.println("There Is A 15% tax.");
      System.out.println("There Is Also A 10% Liscense Tax.");
      System.out.println("Tere Is Also A $200 Dealer Fee.");
      System.out.println("Finally, There Is A $500 Warranty Fee.");
      
      //maths
      total = value + (value * tax);
      System.out.println("Total After Initail Tax is" + total);
      total = total + (total * liscense);
      System.out.println("After The License Tax, The Total is" + total);
      total = total + dealerFee;
      System.out.println("After The Dealer Fee, The Total is" + total);
      total = total + (dealerFee + warranty);
      
      
      
      //display totals
      System.out.println();
      System.out.println("The Total Cost Of The Vehicle Will Be" + total);
      
   }//end main method
}//end carSalesman