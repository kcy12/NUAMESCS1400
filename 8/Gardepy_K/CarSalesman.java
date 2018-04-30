import java.util.Scanner;

/***********************
*Kacie Gardepy
*Car Salesman
*Last Edited: 01/22/2018
***********************/

public class CarSalesman{
   public static void main(String[] args){
      //make scanner
      Scanner input = new Scanner(System.in);
      //initialize values
      int cost = 0;
      double tax = 0.15;
      double total = 0.0;
      double license = 0.10;
      int dealer_prept = 500;
      int dest_charge = 375; 
      //greet user
      System.out.print("Welcome to the Car Salesman Program!");
      System.out.print("What is the base amount for the car? ");
      //get the input
      cost = input.nextInt();
      //new line
      System.out.println(); 
      //math
      double a = cost*tax;
      double b = cost*license;
      
      //display totals
      System.out.println("Tax is 15%:"+a);
      System.out.println("Liscence is 10%:"+b);
      System.out.println("Dealer preparation fee is: $500");
      System.out.println("Destination charge: $375");
      //new line
      System.out.println();
      //display total value after everything
      System.out.println("Your total is: "+(cost+a+b+dealer_prept+dest_charge));
   }//end main method
}//end Car Salesman class 