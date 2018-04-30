/*******************************
* Leon Nguyen
*Game over
* 1/19/18 
********************************/
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
      double tax = 1.15;
      double licence = 1.10;
      
      
      
      //welcome user
      System.out.println("Welcome to Cars Sales, Whats the cost");
      //get cost of car
      cost= in.nextInt();
      //math
      total = (cost)+(dealerPrep)+(destCharge)*(tax)*(licence);
      //display total
      System.out.print("The total is");
      System.out.print(total);
      System.out.print(".");
      
   }//end main 
}//end CarSalesman