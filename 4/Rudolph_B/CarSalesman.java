/************************
* Breyden Rudolph
* Carsales men
*
*
* Last edited 1/19/18
*************************/
import java.util.Scanner;


public class CarSalesman{
   public static void main(String[] args){
      //create scanner object
      Scanner in = new Scanner(System.in);
      
      // initalize variables
      int cost = 0;
      double total = 0.0;
      //two set fees
      int dealerPrep = 500;
      int destCharge = 375;
      //two % fees
      double tax = 0.15;
      double license = 0.10;
      
      //welcome user
      System.out.println("Welcome to Cars R Us.");
      System.out.println("How much is your car?");
      //get cost of car
      cost = in.nextInt();
      //math
      total = (cost+dealerPrep+destCharge)+(cost*tax)+(cost*license);
      //display total
      System.out.print("Here is your total ");
      System.out.print(total);
      
   }//end main
}//end CarSalesman