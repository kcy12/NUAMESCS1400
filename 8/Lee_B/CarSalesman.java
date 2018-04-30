import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //init values
      int cost = 0;
      double tax = 0.15;
      double total = 0.0;
      double license = 0.10;
      int dealer_prep = 500;
      int dest_charge = 375;
      //greet user
      System.out.println("Welcome to the Car Salesman Program!");
      System.out.print("What is the base amount of the car? ");
      //get input
      cost = input.nextInt();
      //newline
      System.out.println();
      //math
      
      //display totals
      System.out.println("Tax is 15%: $"+(cost*tax));
      System.out.println("License is 10%: $"+(cost*license));
      System.out.println("Dealer Preparation fee: $"+(dealer_prep));
      System.out.println("Destation Charge: $"+(dest_charge));
      System.out.println(" ");
      System.out.println("Your total is "+(cost+(cost*tax)+(cost*license)+dealer_prep+dest_charge));
   }//end main method
}//end CarSalesman class