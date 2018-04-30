/***************************
* Cally Dessenberger
* Car Salesman
*Last Edited:1/22/18
***************************/
import java.util.Scanner;
public class CarSalesMan {
   public static void main(String[] args){
   //make scanner
   Scanner scan = new Scanner(System.in);
      //init values
      int cost = 0;
      double tax = 0.15;
      double total = 0.0;
      double license = 0.10;
      int dealer_prep = 500;
      int dest_charge = 375;
      //greet user
      System.out.print("Hello, welcome to the the car dealership!");
      System.out.print(" What is the base amount of the car?  ");
      // get input
      cost = scan.nextInt();
      //newline
      System.out.println();
      //math
      //display totals
      System.out.println("Tax is 15%: "+(cost*tax));
      System.out.println("License fee is 10%: " +(cost*license));
      System.out.println("Dealer prep. is: "+ dealer_prep);
      System.out.println("Destination Charge: " + dest_charge);
      System.out.println("Total is: " + (cost*tax*license+dealer_prep+dest_charge));
   }//end main method
   }// end CarSalesman class