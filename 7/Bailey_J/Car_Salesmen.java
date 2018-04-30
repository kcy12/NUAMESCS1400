/*******************************************
* Jaden Bailey
* Car Salesmen
* 1/22/18
*******************************************/
import java.util.Scanner;


public class Car_Salesmen{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //ititalize variables
      int value = 0;
      double total = 0.0;
      double tax = 0.15;
      double liscense = 0.10;
      int dest_charge = 375;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome to dealership calculator");
      System.out.println("Put in the price and I will calculate");
      System.out.println("the costs");
      //prompt for input
      System.out.print("Put in the price ");
      //save input
      value = input.nextInt();
      //newline
      System.out.println();
      
      //maths
      tax *= value;
      liscense *= value;
      total = value + tax + liscense + dest_charge + dealer_prep;
      
      //display totals
      System.out.println("Tax is 15%: " + tax);
      System.out.println("Liscense is 10%: " + liscense);
      System.out.println("Dealer Preparation fees: " + dealer_prep);
      System.out.println("Destation Charge: " + dest_charge);
   
   
      
      System.out.print("here is your total: " + total);
      
   }//End Main Function
}//End Class Car_Salemen