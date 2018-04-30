/************************
*Zoey Beets
*Cars Salesman
*Last Edited: 1/22/18
************************/
import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //create scanner
      Scanner input = new Scanner(System.in);
      //initalize variables
      int value = 0;
      double total = 0.0;
      double tax = .15;
      double liscense = .12;
      int dest_charge = 350;
      int dealer_prep = 500;
      
      //welcome user
      System.out.println("Welcome To The Car Salesman");
      System.out.println("Input the car value");
      
      
      //prompt for input
      System.out.print("prompt");
      //save input
      value = input.nextInt();
      //new line
      System.out.println();
      //maths
      double valtax = value*tax;
      System.out.println("Tax is 15%: $"+ valtax);
      
      
      double vallis = value*liscense;
      System.out.println("Liscense is 12%: $"+ vallis);
      
      System.out.println("Destination Preperation fee: $"+ dest_charge);
      
      System.out.println("Dealer Preperation fee: $"+ dealer_prep);
      
      //display totals
      total = (value+valtax+vallis+dest_charge+dealer_prep);
      
      System.out.print("Your total is $"+ total);
      
      
   }//end main method
}//end CarSaleman class
