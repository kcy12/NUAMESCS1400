/**************************
*Grant Arave
*Car Salesman
*Last Edited: 1/22/18
**************************/


import java.util.Scanner;

public class CarSalesman
{
   public static void main(String[] args)
   {
      //create scanner
      Scanner input = new Scanner(System.in);
      //initalize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .10;
      int destination = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome to the CarSalesman Program");
      //prompt for input
      System.out.print("What is the original price?: ");
      //save input
      value = input.nextInt();
      //newline
      System.out.println();
      //maths
      tax *= value;
      liscense = (value * liscense);
      total = (tax + liscense + destination + dealer_prep + value);
      
      
      //display totals
      System.out.println("The Dealer Prep Charge is: "+ dealer_prep);
      System.out.println("The Destination Charge is: "+ destination);
      System.out.println("The Tax is 15%: "+ tax);
      System.out.println("The Liscense charge is 10%: "+ liscense);
      System.out.println("The Total value is: "+ total);
      
   }//end main method
}//end CarSalesman class