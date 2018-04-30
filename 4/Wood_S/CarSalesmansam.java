/****************************
* Samuel Wood
* java carsalesman
* Insert price of car
* Last Edited:1/25/18
*****************************/


import java.util.Scanner;

public class CarSalesmansam
{
   public static void main(String[] args)
   {  //create scanner object
      Scanner in = new Scanner(System.in);
      
      //initialize variables
      int price = 0;
      double total = 0.0;
      //two set fees
      int Dealerpreparation = 500;
      int Destination = 375;
      //two % fees
      double tax = 0.15;
      double License = 0.10;
      
      //welcome user
      System.out.println("Welcome to the Car Saleman Program!");
      System.out.println("What is the base amount of the car? : ");
      //get cost of car
      cost = in.nextInt();
      //workings to get total
      tax *= cost;
      license *= cost;
      total = Dealerpreparation + Destination + price + tax + License;
      //display total
      System.out.println("Tax is: " + tax);
      System.out.println("License is: " + registration);
      System.out.println("Dealer Preparation fee: " + dealerfees);
      System.out.println("The Utah fees are: " + UtahFee);
      System.out.println("Your total is $ " + total);
      
   } //end main
} //end CarSalesmansam