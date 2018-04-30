import java.util.Scanner;

public class CarSalesman{
   public static void main(String[] args) {
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
      System.out.print("Prompt?");
      //get input
      cost = input.nextInt();
      //newline
      System.out.println();
      //math
      
      //display totals
      System.out.println("tax cost is "+(cost*tax));
      System.out.println("license cost is "+(license*tax));
      System.out.println("Dealer Preperation fee: "+(dealer_prep*tax));
      System.out.println("Destation Charge: "+(dest_charge*tax));
   }//end main method
}//end Carsalesman class