/************************
*Dana Escandor
*Cars Salesman
*L.E. 1/22/18
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
      int dest_charge = 200;
      int dealer_prep = 400;
      
      //greetings
      System.out.println("Welcome To The Car Salesman!");
      System.out.println("Input car value");
      
      
      //prompt for input
      System.out.print("prompt: $");
      //save input
      value = input.nextInt();
      
      //new line
      System.out.println();
      
      
      //maths
      double value_tax = value*tax;
      System.out.println("Tax is 15%: $"+ value_tax);
      
      double value_lis = value*liscense;
      System.out.println("Liscense is 12%: $"+ value_lis);
      
      System.out.println("Dealer Preperation fee: $"+ dealer_prep); 
          
      System.out.println("Destination Preperation fee: $"+ dest_charge);
      
      
      //display totals
      total = (value + value_tax + value_lis + dealer_prep + dest_charge);
      
      System.out.print("Total is $"+ total);
      
      
   }//end main method
}//end CarSaleman class
